package com.itaren.frame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.itaren.util.Constants;

public class MainFrame extends JFrame{
	public static void main(String[] args) {
		new MainFrame();
	}
	public MainFrame() {
		
		this.setTitle(Constants.TITLE+"主界面");
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//禁用最大化按钮
		
//		设置全屏1
//		this.getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
//		设置全屏2
//		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
//        this.setSize(d.width, d.height); 
//		设置全屏3
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        Rectangle bounds = new Rectangle(screenSize); 
        this.setBounds(bounds); 
        
		this.setLayout(null);
		
		addComponents();
		addLisenters();
	}

	private void addLisenters() {
		
	}

	private void addComponents() {
		 setLayout(new GridLayout(0,6));
		 
		 
		 List<JButton> buttons = new ArrayList<>();
		 JButton jbtn1 = new JButton("Coding Button");
		 jbtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "click "+jbtn1.getText());
			}
		});
		 buttons.add(jbtn1);	
		 
		 for(int i=0;i<25;i++) {
			 JButton jbtn = new JButton("Coding Button"+i);
			 jbtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(getParent(), "click "+jbtn.getText());
				}
			});
			 
			 buttons.add(jbtn);	
		 }
		 
		 
		//JButton b1 = new JButton("Button 1");
		// b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		 for (JButton btn : buttons) {
			this.getContentPane().add(btn);
		}
	}
	
	

 /*   JPanel p=new JPanel();
    public MainFrame(){
  setLayout(new BorderLayout(5,5));
  setFont(new Font("Helvetica", Font.PLAIN, 14));
  getContentPane().add("North", new JButton("North"));
  getContentPane().add("South", new JButton("South"));
  getContentPane().add("East",  new JButton("East"));
  getContentPane().add("West",  new JButton("West"));
      //设置面板为流式布局居中显示，组件横、纵间距为5个像素
       p.setLayout(new FlowLayout(1,5,5));
       //使用循环添加按钮，注意每次添加的按钮对象名称都是b
//但按钮每次均是用new新生成的，所有代表不同的按钮对象。
       for(int i=1;i<10;i++){
                 //String.valueOf(i)，将数字转换为字符串
                JButton b=new JButton(String.valueOf(i));
                p.add(b);           //将按钮添加到面板中
       }
  getContentPane().add("Center",p);  //将面板添加到中间位置
}  
public static void main(String args[]) {
	MainFrame f = new MainFrame();
    f.setTitle("边界布局");
    f.pack();  //让窗体自适应组建大小
    f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setLocationRelativeTo(null);             //让窗体居中显示
 }*/

	
}

 