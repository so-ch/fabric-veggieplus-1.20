package net.song.veggieplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.song.veggieplus.VeggiePlus;
import net.song.veggieplus.block.ModBlocks;

public class ModItems {

    // add new items
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP,
            new FabricItemSettings()));

    // add new ingredient items
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }
    // add new food and drink items
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
    }
    //add new natural items
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO_SEEDS);
    }

    // register new items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VeggiePlus.MODID, name), item);
    }

    public static void registerModItems() {
        VeggiePlus.LOGGER.info("Registering Mod Items for " + VeggiePlus.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);

    }
}
