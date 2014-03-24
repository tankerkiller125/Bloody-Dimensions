package tankerkiller125.bloodydimensions.core;

import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("static-access")
public class BD_Config extends BD_Registry
{
	public static int updateMsgState = 2;
	
	public static void init(FMLPreInitializationEvent event)
	{
		update(event);
	}
	
	public static void update(FMLPreInitializationEvent event)
	{
		Property updateMsg = config.get(config.CATEGORY_GENERAL, "Update Message", updateMsgState);
		updateMsg.comment = "0 = No update message at all\n1 = Only show a message when an update is available\n2 = Always show a message";
		updateMsg.getInt();
		updateMsgState = updateMsg.getInt();
	}
}
