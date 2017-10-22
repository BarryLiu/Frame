package com.itaren.frame.childs;

import javax.swing.JFrame;

import com.itaren.data.juhe.weather.JsonRootBean;
import com.itaren.frame.BaseFrame;
import com.itaren.util.Resource;

public class WeatherFrame extends BaseFrame{
	
	
	public WeatherFrame(JsonRootBean jrb) {
		this.setTitle("今日天气");
		this.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setIconImage(Resource.IMAGE_ICON);
		
	}

	@Override
	protected void addComponents() {
		
	}

	@Override
	protected void addLisenters() {
		
	}

	
}
