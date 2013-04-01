package rc.common;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import rc.common.block.InitBlock;
import rc.common.item.InitItem;
import rc.common.utils.ConfigManager;
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

/**
 * @author kirby,hendyzone
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
	@SidedProxy(clientSide = "rc.client.ClientProxy", serverSide = "rc.common.CommonProxy")
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
	public static final CreativeTabs RC_TAB = new RcCreativeTab(CreativeTabs.getNextID(), RoboticCraft.CHANNEL);

//	public static ConfigManager cfg;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		new ConfigManager(new File(event.getModConfigurationDirectory(), CONFIG_FILE));
		new InitBlock();
		new InitItem();
//		new InitEntity();
		
//		MinecraftForge.EVENT_BUS.register(new RcSoundManager());

//		TickRegistry.registerTickHandler(new TickHandlerClient(), Side.CLIENT);
		rc.common.utils.Localization.addLocalization("/rc/lang/", "en_US");
		
		
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
