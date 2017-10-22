package com.itaren.util;

import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
	private static Properties p;

	private static void initProperties() {
		InputStream inStream = ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties");
		p = new Properties();
		try {
			p.load(inStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		if (p == null) {
			initProperties();
		}
		return p.getProperty(key);
	}
	
	public static void main(String[] args) {
		String property = ConfigUtil.getProperty("sf");
		System.out.println(property);
	}
}