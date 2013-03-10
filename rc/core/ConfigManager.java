package rc.core;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigManager {

	public static Boolean isCfgLoaded ;
	
	public static Configuration configuration; 
	
	/**
	 * @param file
	 */
	public ConfigManager(File file)
	{
		if (!ConfigManager.isCfgLoaded)
		{
			ConfigManager.configuration = new Configuration(file);
			this.setValues();
		}
	}

	
	/**
	 * 方块id
	 */
	public static int idBlockXXX;
	
	
	
	
	/**
	 * 物品id
	 */
	public static int idItemOOO;
	
	
	
	
	private void setValues() {
		try
		{
	        ConfigManager.configuration.load();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		}
		catch (final Exception e)
		{
			FMLLog.log(Level.SEVERE, e, "RoboticCraft has a problem loading it's configuration");
		}
		finally
		{
			ConfigManager.configuration.save();
			ConfigManager.isCfgLoaded = true;
		}
	};
}
