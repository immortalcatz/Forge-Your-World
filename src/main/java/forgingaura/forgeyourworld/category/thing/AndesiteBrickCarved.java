package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrickCarved extends Block{
	
	public AndesiteBrickCarved() {
		super(Material.ROCK);
		setUnlocalizedName(MainHandler.FYWBlocks.ANDESITEBRICKCARVED.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.ANDESITEBRICKCARVED.getRegistryName());
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ForgeYourWorld.THING_TAB);
	}

}
