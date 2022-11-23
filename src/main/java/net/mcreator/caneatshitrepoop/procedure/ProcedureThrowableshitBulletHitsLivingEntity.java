package net.mcreator.caneatshitrepoop.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.caneatshitrepoop.ElementsCanEatShitRepoop;

@ElementsCanEatShitRepoop.ModElement.Tag
public class ProcedureThrowableshitBulletHitsLivingEntity extends ElementsCanEatShitRepoop.ModElement {
	public ProcedureThrowableshitBulletHitsLivingEntity(ElementsCanEatShitRepoop instance) {
		super(instance, 30);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThrowableshitBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 100, (int) 0));
	}
}
