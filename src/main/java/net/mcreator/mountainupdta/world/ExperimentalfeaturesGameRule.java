package net.mcreator.mountainupdta.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.mountainupdta.NewmountainsModElements;

import java.lang.reflect.Method;

@NewmountainsModElements.ModElement.Tag
public class ExperimentalfeaturesGameRule extends NewmountainsModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("experimentalfeatures", GameRules.Category.UPDATES,
			create(false));
	public ExperimentalfeaturesGameRule(NewmountainsModElements instance) {
		super(instance, 40);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
