package reyansh.minecraftmod;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;

public class ModEffects {

    public static final Holder<MobEffect> FLYING =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    ModEffectIds.FLYING,
                    new FlyingEffect()
            );

    public static final Holder<MobEffect> FIRE =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    ModEffectIds.FIRE,
                    new FireEffect()
            );

    public static final Holder<MobEffect> ARMOR_DECAY_1 =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    ModEffectIds.ARMOR_DECAY_1,
                    new ArmorDecayEffect()
            );

    public static final Holder<MobEffect> ARMOR_DECAY_2 =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    ModEffectIds.ARMOR_DECAY_2,
                    new ArmorDecayEffect()
            );
}
