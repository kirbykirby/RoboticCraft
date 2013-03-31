package rc.core;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import rc.block.InitBlock;
import rc.entity.InitEntity;
import rc.item.InitItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarted;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * @author kirby,dengz
 */

@Mod(modid = RoboticCraft.MOD_ID, name = RoboticCraft.MOD_NAME, version = RoboticCraft.MOD_VER)
@NetworkMod(channels = {RoboticCraft.CHANNEL},clientSideRequired = true, serverSideRequired = false)
public class RoboticCraft {

	/**
	 * 实例
	 */
	@Instance(RoboticCraft.MOD_ID)
	public static RoboticCraft instance ;

	/**
	 * 代理
	 */
	@SidedProxy(clientSide = "rc.core.ClientProxy", 
						serverSide = "rc.core.CommonProxy")
	public static CommonProxy proxy;

	
	
	/**
	 * Mod基本信息
	 */
	public static final String MOD_ID = "rc";
	public static final String MOD_NAME = "RoboticCraft";
	//这个是内部的版本，要经常改的哟
	public static final String MOD_VER = "0.0.0.1";
	//这个是对外宣传的版本
	public static final String MOD_WAIBU_VER = "Indev";
	
	public static final String CHANNEL = "RoboticCraft";

	/**
	 * 各种路径
	 */
	public static final String CONFIG_FILE = "RoboticCraft/main.conf";

	
	
	
	/**
	 * 创造栏
	 */
	public static final CreativeTabs RC_TAB = 
			new RcCreativeTab(CreativeTabs.getNextID(), RoboticCraft.CHANNEL);

	public static ConfigManager cfg;
	/**
	 * @param event
	 */
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		new InitBlock();
		new InitItem();
		new InitEntity();
		
		
		
		new ConfigManager(new File(event.getModConfigurationDirectory(), CONFIG_FILE));
		
		MinecraftForge.EVENT_BUS.register(new RcSoundManager());

		TickRegistry.registerTickHandler(new TickHandlerClient(), Side.CLIENT);
		
		
	}

	/**
	 * @param event
	 */
	@Init
	public void init(FMLInitializationEvent event) {

	}

	/**
	 * @param event
	 */
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {

	}
	
	/**
	 * @param event
	 */
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event)
	{		
		
	}
	
	/**
	 * @param event
	 */
	@ServerStarted
	public void serverInit(FMLServerStartedEvent event) {

	}
}
