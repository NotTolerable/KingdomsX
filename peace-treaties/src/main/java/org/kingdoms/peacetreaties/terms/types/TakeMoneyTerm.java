package org.kingdoms.peacetreaties.terms.types;

import com.google.gson.JsonObject;
import org.kingdoms.constants.group.Kingdom;
import org.kingdoms.constants.land.abstraction.data.DeserializationContext;
import org.kingdoms.constants.land.abstraction.data.SerializationContext;
import org.kingdoms.constants.namespace.Namespace;
import org.kingdoms.locale.messenger.Messenger;
import org.kingdoms.locale.provider.MessageBuilder;
import org.kingdoms.peacetreaties.config.PeaceTreatyLang;
import org.kingdoms.peacetreaties.data.PeaceTreaty;
import org.kingdoms.peacetreaties.managers.StandardPeaceTreatyEditor;
import org.kingdoms.peacetreaties.terms.StandardTermProvider;
import org.kingdoms.peacetreaties.terms.Term;
import org.kingdoms.peacetreaties.terms.TermGroupingOptions;
import org.kingdoms.peacetreaties.terms.TermProvider;

import java.util.concurrent.CompletionStage;

public class TakeMoneyTerm extends Term {
    private double amount;

    public static final TermProvider PROVIDER = new StandardTermProvider(Namespace.kingdoms("TAKE_MONEY"), TakeMoneyTerm::new, true, false) {
        @Override
        public CompletionStage<Term> prompt(TermGroupingOptions options, StandardPeaceTreatyEditor editor) {
            return standardAmountPrompt(this, options, editor, (amount) -> new TakeMoneyTerm(amount.doubleValue()));
        }
    };

    private TakeMoneyTerm() {}

    public TakeMoneyTerm(double money) {
        this.amount = money;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void deserialize(DeserializationContext context) {
        JsonObject json = context.getJson();
        this.amount = json.get("amount").getAsDouble();
    }

    @Override
    public void serialize(SerializationContext context) {
        JsonObject json = context.getJson();
        json.addProperty("amount", amount);
    }

    @Override
    public void addEdits(MessageBuilder builder) {
        super.addEdits(builder);
        builder.raw("term_take_money_amount", amount);
    }

    @Override
    public TermProvider getProvider() {
        return PROVIDER;
    }

    @Override
    public boolean apply(TermGroupingOptions config, PeaceTreaty peaceTreaty) {
        Kingdom kingdom = peaceTreaty.getVictimKingdom();
        if (!kingdom.hasMoney(amount)) return false;
        kingdom.addBank(-amount);
        return true;
    }

    @Override
    public Messenger canAccept(TermGroupingOptions config, PeaceTreaty peaceTreaty) {
        Kingdom kingdom = peaceTreaty.getVictimKingdom();
        if (!kingdom.hasMoney(amount)) return PeaceTreatyLang.TERMS_TAKE_MONEY_NOT_ENOUGH;
        return null;
    }
}
