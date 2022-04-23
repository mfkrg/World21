package com.mfkrg.world21.world.feature;

import com.mfkrg.world21.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    //blood
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLOOD_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLOOD_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_DEEPSLATE_BLOOD_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BLOOD_ORE.get().defaultBlockState()));
    // cobalt
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COBALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_DEEPSLATE_COBALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
    //mythril
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MYTHRIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MYTHRIL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_DEEPSLATE_MYTHRIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MYTHRIL_ORE.get().defaultBlockState()));





    //blood
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLOOD_ORE = FeatureUtils.register("blood_ore",
    Feature.ORE, new OreConfiguration(OVERWORLD_BLOOD_ORES, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_BLOOD_ORE = FeatureUtils.register("deepslate_blood_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_DEEPSLATE_BLOOD_ORES, 6));
    //cobalt
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COBALT_ORE = FeatureUtils.register("cobalt_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES, 2));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_COBALT_ORE = FeatureUtils.register("deepslate_cobalt_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_DEEPSLATE_COBALT_ORES, 3));

    //mythril
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MYTHRIL_ORE = FeatureUtils.register("mythril_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MYTHRIL_ORES, 2));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_MYTHRIL_ORE = FeatureUtils.register("deepslate_mythril_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_DEEPSLATE_MYTHRIL_ORES, 3));

}
