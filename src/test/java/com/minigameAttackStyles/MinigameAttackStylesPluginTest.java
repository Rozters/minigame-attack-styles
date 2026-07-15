package com.minigameAttackStyles;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MinigameAttackStylesPluginTest
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MinigameAttackStylesPlugin.class);
		RuneLite.main(args);
	}
}