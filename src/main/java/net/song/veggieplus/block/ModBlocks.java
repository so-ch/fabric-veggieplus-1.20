package net.song.veggieplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.song.veggieplus.VeggiePlus;
import net.song.veggieplus.block.custom.RiceCropBlock;
import net.song.veggieplus.block.custom.TomatoCropBlock;

public class ModBlocks {

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block RICE_CROP = registerBlockWithoutItem("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VeggiePlus.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VeggiePlus.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        VeggiePlus.LOGGER.info("Registering ModBlocks for " + VeggiePlus.MODID);
    }
}
