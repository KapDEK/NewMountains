package net.mcreator.mountainupdta.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mountainupdta.world.ExperimentalfeaturesGameRule;
import net.mcreator.mountainupdta.NewmountainsModElements;
import net.mcreator.mountainupdta.NewmountainsMod;

import java.util.Map;

@NewmountainsModElements.ModElement.Tag
public class TaigaMountainSpawnAdditionalGenerationConditionProcedure extends NewmountainsModElements.ModElement {
	public TaigaMountainSpawnAdditionalGenerationConditionProcedure(NewmountainsModElements instance) {
		super(instance, 43);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewmountainsMod.LOGGER.warn("Failed to load dependency world for procedure TaigaMountainSpawnAdditionalGenerationCondition!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(ExperimentalfeaturesGameRule.gamerule)) == (true))) {
			return (true);
		}
		return (false);
	}
}
