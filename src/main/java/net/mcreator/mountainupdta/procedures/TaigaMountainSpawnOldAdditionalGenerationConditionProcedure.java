package net.mcreator.mountainupdta.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mountainupdta.world.ExperimentalfeaturesGameRule;
import net.mcreator.mountainupdta.NewmountainsModElements;
import net.mcreator.mountainupdta.NewmountainsMod;

import java.util.Map;

@NewmountainsModElements.ModElement.Tag
public class TaigaMountainSpawnOldAdditionalGenerationConditionProcedure extends NewmountainsModElements.ModElement {
	public TaigaMountainSpawnOldAdditionalGenerationConditionProcedure(NewmountainsModElements instance) {
		super(instance, 42);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewmountainsMod.LOGGER.warn("Failed to load dependency world for procedure TaigaMountainSpawnOldAdditionalGenerationCondition!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		boolean isExperementalon = false;
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(ExperimentalfeaturesGameRule.gamerule)) == (false))) {
			return (true);
		}
		return (false);
	}
}
