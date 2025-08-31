package com.dodiks.veyonis;

import com.dodiks.veyonis.entity.ModEntities;
import com.dodiks.veyonis.entity.custom.FemcelEntity;
import com.dodiks.veyonis.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeyonisMod implements ModInitializer {
	public static final String MOD_ID = "veyonis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.FEMCEL, FemcelEntity.createAttributes());
	}
}