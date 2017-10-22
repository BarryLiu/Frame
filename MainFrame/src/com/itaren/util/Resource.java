package com.itaren.util;

import java.awt.Image;

import javax.imageio.ImageIO;

/**
 * 文件资源
 * @author Barry
 */
public class Resource {
	//资源目录
	public final static String ROOT_PATH="/";
	public final static String IMAGE_PATH="/images/";
	
	// icon图片
	public final static Image IMAGE_ICON=loadImage(ROOT_PATH+"favicon.ico");
	
	
	/**
	 * 根据相对路径获取图片资源
	 * 
	 * @since eg: loadImage("/images/a.png");
	 */
	public static Image loadImage(String name) {
		try{
			return ImageIO.read(Resource.class.getResourceAsStream(name));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}	
}
