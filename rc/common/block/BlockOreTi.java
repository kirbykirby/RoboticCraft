package rc.common.block;

import rc.common.RoboticCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOreTi extends Block{

	public BlockOreTi(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(RoboticCraft.RC_TAB);
		this.setUnlocalizedName("block.ti");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		// TODO Auto-generated method stub
		this.blockIcon = par1IconRegister.registerIcon("RoC:ti");
	}

	
}
