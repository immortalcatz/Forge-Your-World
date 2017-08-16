package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.category.food.FoodTab;
import forgingaura.forgeyourworld.category.resource.ResouceTab;
import forgingaura.forgeyourworld.category.thing.ThingTab;
import forgingaura.forgeyourworld.category.toolarmor.ToolArmorTab;
import forgingaura.forgeyourworld.event.UpdateChecker;
import forgingaura.forgeyourworld.handler.BlocksHandler;
import forgingaura.forgeyourworld.handler.FuelHandler;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import forgingaura.forgeyourworld.handler.MainHandler;
import forgingaura.forgeyourworld.handler.OreDictinaryHandler;
import forgingaura.forgeyourworld.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.handler.RecipeHandler;
import forgingaura.forgeyourworld.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.CustomProperty;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MainHandler.MODID, name = MainHandler.NAME, version = MainHandler.VERSION, acceptedMinecraftVersions = MainHandler.ACCEPTED_VERSION, useMetadata = true, 
customProperties = { @CustomProperty(k = "useVersionChecker", v = "true") })
public class ForgeYourWorld {
	
	@Instance
	public static ForgeYourWorld instance;

	@SidedProxy(clientSide = MainHandler.CLIENT_PROXY_CLASSE, serverSide = MainHandler.SERVER_PROXY_CLASSE)
	public static CommonProxy proxy;
	
	public static final CreativeTabs FOOD_TAB = new FoodTab();
	public static final CreativeTabs RESOURCE_TAB = new ResouceTab();
	public static final CreativeTabs TOOL_TAB = new ToolArmorTab();
	public static final CreativeTabs THING_TAB = new ThingTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		System.out.println("Pre Initialization of Forge Your World Done");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		System.out.println("Initialization of Forge Your World Done");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Initialization of Forge Your World Done");
	}

}