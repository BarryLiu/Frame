package com.itaren.frame;

import javax.swing.JFrame;

import com.itaren.data.juhe.weather.JsonRootBean;
import com.itaren.util.Resource;

public class WeatherFrame extends JFrame{
	
	
	public WeatherFrame(JsonRootBean jrb) {
		this.setTitle("今日天气");
		this.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setIconImage(Resource.IMAGE_ICON);
		
		addComponents();
		addLisenters();
	}

	private void addLisenters() {
		
	}

	private void addComponents() {
		
	}
}
