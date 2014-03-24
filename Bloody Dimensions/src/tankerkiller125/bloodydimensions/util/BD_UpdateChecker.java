package tankerkiller125.bloodydimensions.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import tankerkiller125.bloodydimensions.BD_Main;
import tankerkiller125.bloodydimensions.core.BD_Config;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BD_UpdateChecker
{
	private static final String updateUrl = "http://mythsofasiras.cu.cc/files/public.php?service=files&t=a2229ac7356f3dc23e8529932c700cdb&download";
	private static final String newStuffUrl = "http://mythsofasiras.cu.cc/files/public.php?service=files&t=757c8d4615713e508b50046cbc84aec9&download";
	private static String update;
	private static String newStuff;
	private static String pmc = "http://planetminecraft.com/mod/wipbloody-dimensions/";
	private static String mcf = "No topic created yet";
	private static boolean fired = false;
		
	public static boolean isUpdateAvailable() throws MalformedURLException, IOException
	{
		fired = true;
			
		BufferedReader updateFile = new BufferedReader(new InputStreamReader(new URL(updateUrl).openStream()));
		update = updateFile.readLine();
		updateFile.close();

		BufferedReader featureFile = new BufferedReader(new InputStreamReader(new URL(newStuffUrl).openStream()));
		newStuff = featureFile.readLine();
		featureFile.close();

		if(!(update.contains(BD_Main.BD_Info.version)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static class UpdateEvent extends BD_Config
	{
		private boolean hasSeenMsg = false;

		@SubscribeEvent(priority = EventPriority.HIGH)
		public void sendUpdateMsg(EntityJoinWorldEvent event) throws MalformedURLException, IOException
		{
			if(!(updateMsgState == 0))
			{
				if(event.entity instanceof EntityPlayer)
				{
					if(!hasSeenMsg && !fired)
					{
						if(!(BD_UpdateChecker.isUpdateAvailable()))
						{
							FMLClientHandler.instance().getClient().thePlayer.addChatComponentMessage(new ChatComponentText(
									BD_Colors.CYAN + " [Bloody Dimensions]" + BD_Colors.WHITE + 
									"No update available."));
						}
						else
						{
							if(!(updateMsgState == 1))
							{
								FMLClientHandler.instance().getClient().thePlayer.addChatComponentMessage(new ChatComponentText(
										BD_Colors.CYAN + "[Bloody Dimensions] " + BD_Colors.WHITE + 
										"New version (" + update + ") is available at PMC (" + BD_Colors.GOLD + pmc + BD_Colors.WHITE + ")" +
										"or at MCF (" + BD_Colors.GOLD + mcf + BD_Colors.WHITE + ")."));
								FMLClientHandler.instance().getClient().thePlayer.addChatComponentMessage(new ChatComponentText(
										BD_Colors.CYAN + "[Bloody Dimensions] " + BD_Colors.WHITE + 
										"Changes" + newStuff));
							}
						}
						hasSeenMsg = true;
					}
				}
			}
		}
	}
}