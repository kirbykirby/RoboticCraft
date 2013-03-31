package rc.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rc.core.ConfigManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class InitBlock {
	
	public static Block BlockOreTi;
	

	/**
	 * 
	 */
	public InitBlock() {
		BlockOreTi = new BlockOreTi(ConfigManager.idTi, Material.rock);
		
		
		
		
		
		
		
		
		
		registerBlock();
	}

	/**
	 * 
	 */
	private void registerBlock() {
		// TODO Auto-generated method stub
		
		GameRegistry.registerBlock(BlockOreTi,"BlockOreTi");
		
	}
}
