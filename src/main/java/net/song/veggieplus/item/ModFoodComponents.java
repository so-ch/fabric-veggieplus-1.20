package net.song.veggieplus.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent BOWL_OF_RICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build();
    public static final FoodComponent PASTA = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
}
