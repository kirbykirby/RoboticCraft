package rc.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import rc.common.item.ItemBlcok;


public class CommonProxy {

	public void onLoad() {
		
	}

	public String getCurrentLanguage() {
	
		return null;
	}
	
	public void registerBlock(Block block) {
		Item.itemsList[block.blockID] = null;
		Item.itemsList[block.blockID] = new ItemBlcok(block.blockID - 256, block.getUnlocalizedName());
	}
}
