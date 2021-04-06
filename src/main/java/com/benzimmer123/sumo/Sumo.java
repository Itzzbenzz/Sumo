package com.benzimmer123.sumo;

import org.bukkit.plugin.java.JavaPlugin;

import com.benzimmer123.sumo.managers.SumoManager;

public class Sumo extends JavaPlugin {

	private static final Sumo instance = new Sumo();
	private static final SumoManager sumoManager = new SumoManager();

	public static Sumo getInstance() {
		return instance;
	}

	public SumoManager getSumoManager() {
		return sumoManager;
	}
}
