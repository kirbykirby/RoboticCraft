package rc.client;

import net.minecraft.util.StringTranslate;
import rc.common.CommonProxy;


/**
 * @author kirby
 *
 */
public class ClientProxy extends CommonProxy{

	@Override
	public void onLoad() {
		
		System.out.println("FUUUUUUUUUUUUUUUUUUUUUU");
	}
	@Override
	public String getCurrentLanguage() {
		return StringTranslate.getInstance().getCurrentLanguage();
	}
}
