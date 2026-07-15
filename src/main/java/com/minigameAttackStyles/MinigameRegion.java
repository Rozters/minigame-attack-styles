package com.minigameAttackStyles;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public enum MinigameRegion {
    //    CASTLE_WARS(
    //            "Castle Wars",
    //            MinigameTypes.CASTLE_WARS,
    //            9520, 9620
    //    ),

    BOUNTY_HUNTER_CRATER(
      "BH Crater",
      MinigameTypes.BOUNTY_HUNTER,
13374, 13375, 13376, 13630, 13631, 13632, 13886, 13887, 13888
    ),

    CLAN_WARS_FREE_FOR_ALL(
        "CLW Free For All",
        MinigameTypes.CLAN_WARS,
        13130, 13131, 13386, 13387
    ),

    CLAN_WARS_WASTELAND(
        "CLW Wasteland",
        MinigameTypes.CLAN_WARS,
        13134, 13135
    ),

    CLAN_WARS_PLATEAU(
        "CLW Plateau",
        MinigameTypes.CLAN_WARS,
        13133
    ),

    CLAN_WARS_SYLVAN_GLADE(
        "CLW Sylvan Glade",
        MinigameTypes.CLAN_WARS,
        13646
    ),

    CLAN_WARS_FORSAKEN_QUARRY(
        "CLW Forsaken Quarry",
        MinigameTypes.CLAN_WARS,
        13647
    ),

    CLAN_WARS_TURRETS(
        "CLW Turrets",
        MinigameTypes.CLAN_WARS,
        12622, 12623
    ),

    CLAN_WARS_CLAN_CUP_ARENA(
        "CLW Clan Cup Arena",
        MinigameTypes.CLAN_WARS,
        12621
    ),

    CLAN_WARS_SOGGY_SWAMP(
        "CLW Soggy Swamp",
        MinigameTypes.CLAN_WARS,
        13645
    ),

    CLAN_WARS_CLASSIC(
        "CLW Classic",
        MinigameTypes.CLAN_WARS,
        13641, 13642
    ),

    CLAN_WARS_LUMBRIDGE_CASTLE(
        "CLW Lumbridge Castle",
        MinigameTypes.CLAN_WARS,
        13643
    ),

    CLAN_WARS_FALADOR_PARK(
        "CLW Falador Park",
        MinigameTypes.CLAN_WARS,
        13898, 14154
    ),

    // Same region as soggy swamp (intentional duplicate)
    CLAN_WARS_GHASTLY_SWAMP(
        "CLW Ghastly Swamp",
        MinigameTypes.CLAN_WARS,
        13645
    ),

    CLAN_WARS_NORTHLEACH_QUELL(
        "CLW Northleach Quell",
        MinigameTypes.CLAN_WARS,
        13644
    ),

    CLAN_WARS_GRIDLOCK(
        "CLW Gridlock",
        MinigameTypes.CLAN_WARS,
        13899, 13900, 14155, 14156
    ),

    // Unknown but assumed purple
    CLAN_WARS_ETHEREAL(
        "CLW Ethereal",
        MinigameTypes.CLAN_WARS,
        13388, 13389, 13390, 13391
    ),

    LAST_MAN_STANDING_DESERT_ISLAND(
            "LMS Desert Island",
            MinigameTypes.LAST_MAN_STANDING,
            13658, 13659, 13914, 13915
    ),

    LAST_MAN_STANDING_WILD_VARROCK(
            "LMS Wild Varrock",
            MinigameTypes.LAST_MAN_STANDING,
            13918, 13919, 13920, 14174, 14175, 14176, 14430, 14431, 14432
    );

    //    SOUL_WARS(
    //            "Soul Wars",
    //            MinigameTypes.SOUL_WARS,
    //            7773, 8029, 8285
    //    ),

    //    TZHAAR_FIGHT_PITS(
    //            "Tzhaar Fight Pits",
    //            MinigameTypes.TZHAAR_FIGHT_PITS,
    //            9552
    //    );

    public final String name;
    public final MinigameTypes type;
    public final int[] regions;
    public final Set<Integer> regionSet;

    MinigameRegion(String name, MinigameTypes type, int... regions)
    {
        this.name = name;
        this.type = type;
        this.regions = regions;

        this.regionSet = Arrays.stream(regions).boxed().collect(Collectors.toSet());
    }
}
