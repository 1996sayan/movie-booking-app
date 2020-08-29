package com.movie.booking.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesCache {

	/**
	 * configProp
	 */
	private final Properties configProp = new Properties();

	/**
	 * Private constructor to restrict new instances
	 */
	private PropertiesCache() {

		InputStream in = this.getClass().getClassLoader().getResourceAsStream("Data.properties");
		try {
			configProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Bill Pugh Solution for Singleton pattern
	 * 
	 * @author Sayan12
	 *
	 */
	private static class LazyHolder {
		private static final PropertiesCache INSTANCE = new PropertiesCache();
	}

	/**
	 * 
	 * @return LazyHolder.INSTANCE
	 */
	public static PropertiesCache getInstance() {
		return LazyHolder.INSTANCE;
	}

	/**
	 * 
	 * @param key
	 * @return String
	 */
	public String getProperty(String key) {
		return configProp.getProperty(key);
	}

	/**
	 * 
	 * @return Set<String>
	 */
	public Set<String> getAllPropertyNames() {
		return configProp.stringPropertyNames();
	}

	/**
	 * 
	 * @param key
	 * @return boolean
	 */
	public boolean containsKey(String key) {
		return configProp.containsKey(key);
	}
}
