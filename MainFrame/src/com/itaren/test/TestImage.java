package com.itaren.test;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TestImage extends JFrame{
	public static void main(String[] args) {
//		Image img = kit.getImage("icon.gif");
		
		ImageIcon icon=new ImageIcon("icon.jpg");
		System.out.println(icon.getAccessibleContext());
	}
}
