package com.itaren.util;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.itaren.test.Test;

/**
 * 程序需要用到的某些文件或索引资源
 * @author Barry
 */
public class Resource {
	//资源目录
	public final static String ROOT_PATH="/";
	public final static String IMAGE_PATH="/images/";
	
	// icon图片
	public final static Image IMAGE_ICON=loadImage(ROOT_PATH+"favicon.ico");
	
	public final static String NIRCMD_PATH=getFileAbsolutePath("/nircmd.exe");
	
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
	/**
	 *  返回文件绝对路径,没有返回null
	 */
	public static String getFileAbsolutePath(String name) {

		String url = Resource.class.getResource("/").getPath()+"/nircmd/nircmd.exe";
		return url;
 	}
}
