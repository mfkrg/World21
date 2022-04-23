package com.mfkrg.world21.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeature {
    //blood ores
    public static final Holder<PlacedFeature> BLOOD_ORE_PLACED = PlacementUtils.register("blood_ore_placed",
            ModConfiguredFeatures.BLOOD_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(-80))));

    public static final Holder<PlacedFeature> DEEPSLATE_BLOOD_ORE_PLACED = PlacementUtils.register("deepslate_blood_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_BLOOD_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    //cobalt ores
    public static final Holder<PlacedFeature> COBALT_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(-80))));

    public static final Holder<PlacedFeature> DEEPSLATE_COBALT_ORE_PLACED = PlacementUtils.register("deepslate_cobalt_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_COBALT_ORE, ModOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    //mythril
    public static final Holder<PlacedFeature> MYTHRIL_ORE_PLACED = PlacementUtils.register("mythril_ore_placed",
            ModConfiguredFeatures.MYTHRIL_ORE, ModOrePlacement.commonOrePlacement(3,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(-80))));

    public static final Holder<PlacedFeature> DEEPSLATE_MYTHRIL_ORE_PLACED = PlacementUtils.register("deepslate_mythril_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_MYTHRIL_ORE, ModOrePlacement.commonOrePlacement(3,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
