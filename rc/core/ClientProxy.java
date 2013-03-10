package rc.core;

import net.minecraftforge.client.MinecraftForgeClient;

/**
 * @author kirby
 *
 */
public class ClientProxy extends CommonProxy{

	@Override
	public void onLoad() {
		MinecraftForgeClient.preloadTexture(RoboticCraft.BLOCK_TEX);
	    MinecraftForgeClient.preloadTexture(RoboticCraft.ITEM_TEX);
		System.out.println("RoboticCraft loaded textures successfully!");
	}
}
