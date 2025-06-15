
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AlligatorScaleItem extends Item {
	public AlligatorScaleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
