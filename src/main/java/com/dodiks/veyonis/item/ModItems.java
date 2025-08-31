package com.dodiks.veyonis.item;

import com.dodiks.veyonis.VeyonisMod;
import com.dodiks.veyonis.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MARLBORO = registerItem("marlboro", new Item(new Item.Settings()));



    public static final Item FEMCEL_SPAWN_EGG = registerItem("femcel_spawn_egg",
            new SpawnEggItem(ModEntities.FEMCEL, 0xe3c19c, 0x5e6446, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VeyonisMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VeyonisMod.LOGGER.info("Registering Mod Items for " + VeyonisMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MARLBORO);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MARLBORO);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(FEMCEL_SPAWN_EGG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(FEMCEL_SPAWN_EGG);
        });
    }



}
