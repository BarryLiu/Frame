package com.itaren.frame.childs;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.itaren.frame.BaseFrame;

/**
 * 执行cmd命令, Nircmd是一个辅助java执行cmd命令的工具
 * @author Barry
 *
 */
public class NircmdFrame extends BaseFrame{
	private JButton execBtn = new JButton();//触发cmd命令执行
	private JTextField commandTf = new JTextField();//可执行cmd命令
	public static void main(String[] args) {
		
	}
	public NircmdFrame() {
		
	}
	@Override
	protected void addComponents() {
		
		
	}
	@Override
	protected void addLisenters() {
		
	}
}
