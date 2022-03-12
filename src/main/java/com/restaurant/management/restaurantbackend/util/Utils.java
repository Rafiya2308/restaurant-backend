package com.restaurant.management.restaurantbackend.util;

import com.google.gson.Gson;

public class Utils {
	
	private static final Gson GSON = new Gson();

	private Utils() {
		// To prevent instantiation
	}
	
	public static String toJson(Object obj) {
		return GSON.toJson(obj);
	}

}
