package com.dodiks.veyonis.entity;

import com.dodiks.veyonis.VeyonisMod;
import com.dodiks.veyonis.entity.custom.FemcelEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FemcelEntity> FEMCEL = Registry.register(Registries.ENTITY_TYPE, Identifier.of(VeyonisMod.MOD_ID, "femcel"),
            EntityType.Builder.create(FemcelEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1.72f).build());

    public static void registerModEntities() {
        VeyonisMod.LOGGER.info("Registering Mod Entities for " + VeyonisMod.MOD_ID);

    }
}
