package rc.common;

import rc.common.block.InitBlock;
import net.minecraft.creativetab.CreativeTabs;

public class RcCreativeTab extends CreativeTabs{

	public RcCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int getTabIconItemIndex() {
		return InitBlock.BlockOreTi.blockID;
	}
	@Override
	public String getTranslatedTabLabel()
    {
        return "RobotiCraft";
    }

	
}
