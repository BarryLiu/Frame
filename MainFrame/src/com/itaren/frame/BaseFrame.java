package com.itaren.frame;

import javax.swing.JFrame;

import com.itaren.util.Resource;

/**
 * 封装的 BaseFrame,主要想对多个button点击进入子窗口JFrame时各个界面差异不是太大,
 * 代码风格不是太大
 * @author Barry
 *
 */
public abstract class BaseFrame extends JFrame{
	public BaseFrame() {
		this.setIconImage(Resource.IMAGE_ICON);
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(false);// 禁用最大化按钮

		this.setSize(500,400);
		this.setLocationRelativeTo(null); // 让窗体居中显示
		this.setLayout(null);

		addComponents();
		addLisenters();
		
	}
	/**
	 * 为当前窗体添加组件
	 */
	protected abstract void addComponents();

	/**
	 * 为组件添加事件监听
	 */
	protected abstract void addLisenters();

}
