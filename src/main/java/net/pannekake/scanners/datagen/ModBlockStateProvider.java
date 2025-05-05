//package net.pannekake.scanners.datagen;
//
//import net.minecraft.data.PackOutput;
//import net.minecraftforge.client.model.generators.BlockStateProvider;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.pannekake.scanners.ScannerMod;
//
//public class ModBlockStateProvider extends BlockStateProvider {
//    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
//        super(output, ScannerMod.MOD_ID, exFileHelper);
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//
//    }
//
//    private void blockWithItem(registryObject<Block> blockRegistryObject) {
//        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
//    }
//
//}
