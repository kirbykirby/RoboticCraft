package rc.client.utils;

import java.io.IOException;
import java.net.URL;

import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author kirby
 *
 */
@SideOnly(Side.CLIENT)
public class RcSoundManager extends SoundManager {
	private static final String SOUND_RESOURCE_LOCATION = "/sound/";

	/**
	 * 声音文件库
	 */
	private String[] soundFiles = { 
			
			"xx.ogg",
	};

	/**
	 * @param event
	 * @throws IOException
	 * 载入声音文件
	 */
	@ForgeSubscribe
	public void onSoundsLoaded(SoundLoadEvent event) throws IOException {

		for (String soundFile : soundFiles) {
			String s = SOUND_RESOURCE_LOCATION + soundFile;
			try {
				URL url = this.getClass().getResource(s);
				event.manager.soundPoolSounds.addSound(soundFile, url);
			}

			catch (Exception e) {
				System.err.println("Failed loading sound file: " + s);
				e.printStackTrace();
			}
		}
	}
}
