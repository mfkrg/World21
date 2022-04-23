package com.mfkrg.world21.world.generation;

import com.mfkrg.world21.world.feature.ModPlacedFeature;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeature.BLOOD_ORE_PLACED);
        base.add(ModPlacedFeature.DEEPSLATE_BLOOD_ORE_PLACED);

        base.add(ModPlacedFeature.COBALT_ORE_PLACED);
        base.add(ModPlacedFeature.DEEPSLATE_COBALT_ORE_PLACED);

        base.add(ModPlacedFeature.MYTHRIL_ORE_PLACED);
        base.add(ModPlacedFeature.DEEPSLATE_MYTHRIL_ORE_PLACED);
    }
}
