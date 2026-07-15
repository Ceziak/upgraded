package net.ceziak.item;

import net.ceziak.upgraded.Upgraded;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Upgraded.MODID);

    // Templates
    public static final DeferredItem<Item> STONE_UPGRADE =
            ITEMS.register("stone_upgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_UPGRADE =
            ITEMS.register("iron_upgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_UPGRADE =
            ITEMS.register("gold_upgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_UPGRADE =
            ITEMS.register("diamond_upgrade", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
