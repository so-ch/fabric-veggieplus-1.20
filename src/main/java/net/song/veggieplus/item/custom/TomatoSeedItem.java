package net.song.veggieplus.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class TomatoSeedItem extends Item {
    public TomatoSeedItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        return ActionResult.SUCCESS;
    }
}
