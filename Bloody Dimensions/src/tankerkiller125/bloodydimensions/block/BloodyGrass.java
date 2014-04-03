package tankerkiller125.bloodydimensions.block;
//package tankerkiller125.bloodydimensions.block;
//
//import java.util.Random;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.util.Icon;
//import net.minecraft.world.IBlockAccess;
//import net.minecraft.world.World;
//import tankerkiller125.bloodydimensions.BD_Main;
//import tankerkiller125.bloodydimensions.core.BD_Blocks;
//import tankerkiller125.bloodydimensions.core.BD_Info;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//
//public class BloodyGrass extends Block
//{
//    @SideOnly(Side.CLIENT)
//    private IIcon iconGrassTop;
//
//    public BloodyGrass(int par1, Material mat)
//    {
//        super(Material.field_151566_D);
//        func_149663_c("bloodyGrass");
//        setTickRandomly(true);
////        setStepSound(soundGrassFootstep);
//        func_149647_a(BD_Main.bd_tab);
//        func_149711_c(0.659F);
//    }
//
//    @SideOnly(Side.CLIENT)
//    public IIcon getIcon(int par1, int par2)
//    {
//        return par1 == 1 ? this.iconGrassTop : (par1 == 0 ? BD_Blocks.bloodyDirt.getBlockTextureFromSide(par1) : this.blockIcon);
//    }
//
//    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
//    {
//        if (!par1World.isRemote)
//        {
//            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
//            {
//                par1World.setBlock(par2, par3, par4, BD_Blocks.bloodyDirt.blockID);
//            }
//            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
//            {
//                for (int l = 0; l < 4; ++l)
//                {
//                    int i1 = par2 + par5Random.nextInt(3) - 1;
//                    int j1 = par3 + par5Random.nextInt(5) - 3;
//                    int k1 = par4 + par5Random.nextInt(3) - 1;
//                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);
//
//                    if (par1World.getBlockId(i1, j1, k1) == BD_Blocks.bloodyDirt.blockID && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
//                    {
//                        par1World.setBlock(i1, j1, k1, BD_Blocks.bloodyGrass.blockID);
//                    }
//                }
//            }
//        }
//    }
//
//    public int idDropped(int par1, Random par2Random, int par3)
//    {
//        return BD_Blocks.bloodyDirt.idDropped(0, par2Random, par3);
//    }
//
//    @SideOnly(Side.CLIENT)
//    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
//    {
//        if (par5 == 1)
//        {
//            return this.iconGrassTop;
//        }
//        else if (par5 == 0)
//        {
//            return BD_Blocks.bloodyDirt.getBlockTextureFromSide(par5);
//        }
//        
//		return blockIcon;
//    }
//
//    @SideOnly(Side.CLIENT) @Override
//    public void registerIcons(IconRegister par1IconRegister)
//    {
//        this.blockIcon = par1IconRegister.registerIcon(BD_Info.modid + ":bloodyGrass_side");
//        this.iconGrassTop = par1IconRegister.registerIcon(BD_Info.modid + ":bloodyGrass_top");
//    }
//}