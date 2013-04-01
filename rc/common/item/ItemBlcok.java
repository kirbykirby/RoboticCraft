package rc.common.item;

import rc.common.utils.Localization;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlcok extends ItemBlock {

	protected String name;

	public ItemBlcok(int id, String name) {
		super(id);
		this.name = name;
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getItemDisplayName(ItemStack itemstack) {
		return Localization.localize(getUnlocalizedName(itemstack));
	}

}
