package reyansh.minecraftmod;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBrewingProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.BrewingRecipeBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SplashPotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.crafting.PotionIngredient;

import java.util.function.Function;

public class ModItems {
    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item SUSPICIOUS_SUBSTANCE = register(ModItemIds.SUSPICIOUS_SUBSTANCE, Item::new, new Item.Properties());
    public static final Holder<Potion> FLYING =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.FLYING_POTION,
                    new Potion(
                            "flying",
                            new MobEffectInstance(
                                    ModEffects.FLYING,
                                    600,
                                    0
                            )
                    )
            );

    public static final Holder<Potion> FIRE =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.FIRE_POTION,
                    new Potion(
                            "fire",
                            new MobEffectInstance(
                                    ModEffects.FIRE,
                                    200,
                                    0
                            )
                    )
            );

    public static final Holder<Potion> ARMOR_DECAY_1 =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.ARMOR_DECAY_1_POTION,
                    new Potion(
                            "armor_decay_1",
                            new MobEffectInstance(
                                    ModEffects.ARMOR_DECAY_1,
                                    600,
                                    0
                            )
                    )
            );

    public static final Holder<Potion> ARMOR_DECAY_2 =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.ARMOR_DECAY_2_POTION,
                    new Potion(
                            "armor_decay_2",
                            new MobEffectInstance(
                                    ModEffects.ARMOR_DECAY_2,
                                    600,
                                    1
                            )
                    )
            );

    public static final Holder<Potion> REACH =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.REACH_POTION,
                    new Potion(
                            "reach",
                            new MobEffectInstance(
                                    ModEffects.REACH,
                                    1800,
                                    0
                            )
                    )
            );

    public static final Holder<Potion> FEATHER_FOOT =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionIds.FEATHER_FOOT_POTION,
                    new Potion(
                            "feather_foot",
                            new MobEffectInstance(
                                    ModEffects.FEATHER_FOOT,
                                    1800,
                                    0
                            )
                    )
            );

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register((creativeTab) -> creativeTab.accept(ModItems.SUSPICIOUS_SUBSTANCE));
    }
}
