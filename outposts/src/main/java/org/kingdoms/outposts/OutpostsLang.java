package org.kingdoms.outposts;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.kingdoms.locale.LanguageEntry;
import org.kingdoms.locale.messenger.DefinedMessenger;

public enum OutpostsLang implements DefinedMessenger {
    COMMAND_OUTPOST_DESCRIPTION("{$s}Shows the available outpost commands."),
    COMMAND_OUTPOST_NOT_FOUND("{$e}Could not find {$es}%outpost% {$e}outpost.", 1, 2, 3),

    COMMAND_OUTPOST_EDIT_DESCRIPTION("{$s}Modify outpost settings."),
    COMMAND_OUTPOST_EDIT_USAGE("{$usage}outpost edit {$p}<name>"),

    COMMAND_OUTPOST_CREATE_DESCRIPTION("{$s}Creates a new outpost from WorldGuard region.", 1, 2, 3),
    COMMAND_OUTPOST_CREATE_USAGE("{$usage}outpost create {$p}<name> <region>", 1, 2, 3),
    COMMAND_OUTPOST_CREATE_REGION_NOT_FOUND("{$e}Could not find WorldGuard region named {$es}%region%", 1, 2, 3),
    COMMAND_OUTPOST_CREATE_NAME_ALREADY_TAKEN("{$e}There is already an outpost named {$es}%outpost%", 1, 2, 3),
    COMMAND_OUTPOST_CREATE_CREATED("{$p}Created an outpost named {$s}%outpost% {$p}in {$s}%region% {$p}region. " +
            "You can edit it with hover:{{$s}/k outpost edit;{$p}Click to edit;/k outpost edit %outpost%} {$p}command.", 1, 2, 3),

    COMMAND_OUTPOST_EDIT_ENTRANCE_MONEY_ENTER("{$p}Enter the outpost's money entrance fee {$cancel}", 1, 2, 3, 5),
    COMMAND_OUTPOST_EDIT_ENTRANCE_MONEY_SET("{$p}Outpost money entrace fee set to{$sep}: {$s}%outpost-new-entrance-money%", 1, 2, 3, 5),
    COMMAND_OUTPOST_EDIT_MAX_PARTICIPANTS_SET("{$p}Maximum outpost participants set to %outpost-new-max-participants%", 1, 2, 3, 5),
    COMMAND_OUTPOST_EDIT_MAX_PARTICIPANTS_INVALID("{$e}Maximum participants cannot be lower than 2", 1, 2, 3, 5),
    COMMAND_OUTPOST_EDIT_MAX_PARTICIPANTS_ENTER("{$p}Enter the outpost's max participants number {$cancel}", 1, 2, 3, 5),
    COMMAND_OUTPOST_EDIT_MIN_ONLINE_MEMBERS_ENTER("{$p}Enter the outpost's minimum kingdom online members number {$cancel}", 1, 2, 3, 6),
    COMMAND_OUTPOST_EDIT_MIN_ONLINE_MEMBERS_INVALID("{$e}Minimum kingdon online members cannot be lower than 1", 1, 2, 3, 6),
    COMMAND_OUTPOST_EDIT_ENTRANCE_RESOURCE_POINTS_FEE_ENTER("{$p}Enter the outpost's entrance resource points fee {$cancel}", 1, 2, 3, 7),
    COMMAND_OUTPOST_EDIT_REWARDS_COMMAND_ENTER("{$p}Enter a command (without slash) {$cancel}", 1, 2, 3, 4, 5),
    COMMAND_OUTPOST_EDIT_ENTRANCE_RESOURCE_POINTS_FEE_SET("{$p}Outpost money entrace fee set to{$sep}: {$s}%outpost-new-entrance-resource-points-fee%", 1, 2, 3, 7),
    COMMAND_OUTPOST_EDIT_REWARDS_RESOURCE_POINTS_ENTER("{$p}Enter the new outpost resource points reward equation {$cancel}", 1, 2, 3, 4, 6),
    COMMAND_OUTPOST_EDIT_REWARDS_RESOURCE_POINTS_SET("{$p}Outpost resource points rewards to{$sep}: {$s}%outpost-rewards-resource-points%", 1, 2, 3, 4, 6),
    COMMAND_OUTPOST_EDIT_REWARDS_MONEY_ENTER("{$p}Enter the new outpost moeny reward equation {$cancel}", 1, 2, 3, 4, 5),
    COMMAND_OUTPOST_EDIT_REWARDS_MONEY_SET("{$p}Outpost moeny rewards to{$sep}: {$s}%outpost-rewards-money%", 1, 2, 3, 4, 6),
    COMMAND_OUTPOST_EDIT_REGION_ENTER("{$p}Enter the new outpost region name {$cancel}", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_REGION_SET("{$p}Changed the outpost's name to{$sep}: {$s}%outpost-new-region%", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_SPAWN_SET("{$p}Changed the outpost's spawn location to your current location.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_SPAWN_TELEPORTED("{$p}Teleported you to this outpost's spawn location.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_CENTER_TELEPORTED("{$p}Teleported you to this outpost's central location.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_CENTER_SET("{$p}Changed the outpost's center location to your current location.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_NAME_ENTER("{$p}Enter the new outpost name {$cancel}", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_NAME_INVALID("{$es}%input% {$e}is an invalid name for outposts. It must only consist of English alphanumerics.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_NAME_ALREADY_IN_USE("{$es}%input% {$e}name is already being used by another outpost", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_NAME_SET("{$p}Changed the outpost's name to{$sep}: {$s}%outpost-new-name%", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_REMOVE_OUTPOST_IS_RUNNING("{$es}%outpost-name% {$e}outpost event has already started. You can't remove it right now.", 1, 2, 3, 4),
    COMMAND_OUTPOST_EDIT_REMOVE_REMOVED("{$p}Removed {$s}%outpost-name% {$p}outpost.", 1, 2, 3, 4),

    COMMAND_OUTPOST_JOIN_DESCRIPTION("{$s}Join a running outpost event.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_USAGE("{$usage}outpost join <outpost>", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_EVENT_NOT_STARTED("{$e}There are currently no events running for {$es}%outpost% {$e}outpost.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_EVENT_FULL("{$es}%outpost% {$e}outpost event is already full.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_MIN_ONLINE_MEMBERS("{$e}Your kingdom needs at least {$es}%min% {$e}online members to join {$es}%outpost% {$e}event.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_PERMISSION("{$e}Only kingdom member with {$es}WITHDRAW {$e}permission can enter outpost events.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_NOT_ENOUGH_RESOURCE_POINTS("{$e}Your kingdom needs {$es}%cost% {$e}resource points to join this event.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_NOT_ENOUGH_MONEY("{$e}Your kingdom needs {$es}%cost% {$e}money to join this event.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_JOINED("{$p}Your kingdom has joined {$s}%outpost% {$p}outpost event. " +
            "Teleport to the arena using hover:{{$s}/k outpost teleport;{$p}Teleport;/k outpost teleport}", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_ANNOUNCEMENT("{$s}%kingdom% {$p}has joined the event!", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_ALREADY("{$e}Your kingdom has already joined this event.", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_WIN("{$p}Your kingdom has won the event!\n{$s}+%resource-points% {$p}resource points\n{$s}+%money% {$p}money for kingdom", 1, 2, 3),
    COMMAND_OUTPOST_JOIN_LOST("{$e}Your kingdom has lost the event!", 1, 2, 3),

    COMMAND_OUTPOST_START_DESCRIPTION("{$s}Start an outpost event from the existing outposts.", 1, 2, 3),
    COMMAND_OUTPOST_START_USAGE("{$usage}outpost start <outpost> <time> <startIn>", 1, 2, 3),
    COMMAND_OUTPOST_START_ALREADY_STARTED("{$es}%outpost% {$e}outpost event has already started.", 1, 2, 3),
    COMMAND_OUTPOST_START_INVALID_START_TIME("{$e}Invalid event start time{$sep}: {$es}%time%", 1, 2, 3),
    COMMAND_OUTPOST_START_INVALID_TIME("{$e}Invalid event time{$sep}: {$es}%time%", 1, 2, 3),
    COMMAND_OUTPOST_START_SCHEDULED("\n\n{$s}%outpost% {$p}outpost event will start in {$s}%start% \n\n", 1, 2, 3),
    COMMAND_OUTPOST_START_STARTED("\n\n{$s}%outpost% {$p}outpost event has started! \n\n", 1, 2, 3),

    COMMAND_OUTPOST_STOP_DESCRIPTION("{$s}Stop a running outpost event.", 1, 2, 3),
    COMMAND_OUTPOST_STOP_USAGE("{$usage}outpost stop <outpost>", 1, 2, 3),
    COMMAND_OUTPOST_STOP_NOT_STARTED("{$es}%outpost% {$e}outpost event is not started.", 1, 2, 3),
    COMMAND_OUTPOST_STOP_STOPPED("\n\n{$es}%outpost% {$e}outpost event has been stopped! \n\n", 1, 2, 3),

    OUTPOST_EVENTS_DEATH("{$e}You died and your kingdom lost {$es}%rp% resource points", 2),

    COMMAND_OUTPOST_NAME("outpost"),
    COMMAND_OUTPOST_ALIASES("outposts koth kingofthehill"),
    ;

    private final LanguageEntry languageEntry;
    private final String defaultValue;

    OutpostsLang(String defaultValue, int... group) {
        this.defaultValue = defaultValue;
        this.languageEntry = DefinedMessenger.getEntry("outposts", this, group);
    }

    @NonNull
    @Override
    public LanguageEntry getLanguageEntry() {
        return languageEntry;
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }
}
