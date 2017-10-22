package com.itaren.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.itaren.util.Constants;
import com.itaren.util.Resource;

/**
 * 绝对布局窗体界面
 * 
 * @author Barry
 *
 */
public class Login extends JFrame {
	// private JPanel this = new JPanel();

	private JTextField userTf = new JTextField("admin");
	private JPasswordField pwdPf = new JPasswordField("123");

	private JButton loginBtn = new JButton("登录");
	private JButton resetBtn = new JButton("重置");

	public static void main(String[] args) {
		Login.getInstance();
	}

	private static Login instance = null;

	public static Login getInstance() {
		if (instance == null) {
			instance = new Login();
		}
		return instance;
	}

	private Login() {
		this.setTitle(Constants.TITLE + "简单登录界面");
		ImageIcon icon=new ImageIcon("icon.jpg");
		this.setIconImage(Resource.IMAGE_ICON);
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(false);// 禁用最大化按钮

		this.setSize(400, 200);
		// this.setLocation(400, 200);
		this.setLocationRelativeTo(null); // 让窗体居中显示
		this.setLayout(null);

		addComponents();
		addLisenters();
	}

	private void addLisenters() {
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("login....");
					String admin = userTf.getText();
					char[] password = pwdPf.getPassword();
					String pwd = String.valueOf(password);
					System.out.println("admin " + admin + " pwd " + pwd);

					if ("admin".equals(admin) && "123".equals(pwd)) {
						MainFrame d = new MainFrame();
						d.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "用户名或密码错误!");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});

		resetBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userTf.setText("");
				pwdPf.setText("");
			}
		});
	}

	private void addComponents() {
		JLabel userLb = new JLabel("账号:");
		JLabel pwdLb = new JLabel("密码：");

		userLb.setBounds(50, 20, 165, 25);
		this.add(userLb);

		userTf.setBounds(150, 20, 165, 25);
		this.add(userTf);

		pwdLb.setBounds(50, 60, 165, 25);
		this.add(pwdLb);

		pwdPf.setBounds(150, 60, 165, 25);
		this.add(pwdPf);

		loginBtn.setBounds(100, 120, 100, 25);
		this.add(loginBtn);

		resetBtn.setBounds(200, 120, 100, 25);
		this.add(resetBtn);

	}
}
