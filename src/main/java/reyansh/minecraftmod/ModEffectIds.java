package reyansh.minecraftmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffect;

public class ModEffectIds {

    public static final ResourceKey<MobEffect> FLYING =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("flying")
            );

    public static final ResourceKey<MobEffect> FIRE =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("fire")
            );

    public static final ResourceKey<MobEffect> ARMOR_DECAY_1 =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("armor_decay_1")
            );

    public static final ResourceKey<MobEffect> ARMOR_DECAY_2 =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("armor_decay_2")
            );

    public static final ResourceKey<MobEffect> REACH =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("reach")
            );

    public static final ResourceKey<MobEffect> FEATHER_FOOT =
            ResourceKey.create(
                    Registries.MOB_EFFECT,
                    MinecraftMod.id("feather_foot")
            );
}