package net.pannekake.scanners.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pannekake.scanners.ScannerMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScannerMod.MOD_ID);

    public static final RegistryObject<Item> NETHERITE_SCANNER = ITEMS.register("netherite_scanner",
            () -> new Item(new Item.Properties().setId(ITEMS.key("netherite_scanner"))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
