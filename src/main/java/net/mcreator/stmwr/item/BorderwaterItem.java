
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.stmwr.init.StmwrModFluids;

public class BorderwaterItem extends BucketItem {
	public BorderwaterItem() {
		super(StmwrModFluids.BORDERWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
