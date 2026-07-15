package net.ceziak.item;

import net.ceziak.upgraded.Upgraded;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Upgraded.MODID);

    public static final Supplier<CreativeModeTab> RICE_DELIGHT = CREATIVE_MODE_TAB.register("upgraded",() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_UPGRADE.get()))
            .title(Component.translatable("creativetab.upgraded.upgraded"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.STONE_UPGRADE);
                output.accept(ModItems.IRON_UPGRADE);
                output.accept(ModItems.GOLD_UPGRADE);
                output.accept(ModItems.DIAMOND_UPGRADE);
            })

            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
