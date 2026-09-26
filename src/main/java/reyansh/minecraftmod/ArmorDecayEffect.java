package reyansh.minecraftmod;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ArmorDecayEffect extends MobEffect {
    protected ArmorDecayEffect() {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL) or useless (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(MobEffectCategory.HARMFUL, 0x294224);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        int interval = 20;
        return interval <= 0 || duration % interval == 0;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        float damage = 20.0F + amplifier * 10;
        entity.hurtArmor(entity.damageSources().magic(), damage);

        return true;
    }
}
