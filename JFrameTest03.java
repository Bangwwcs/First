package com.great.test01;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JFrameTest03 extends JFrame{
	
	public void init() {
		JMenuBar mb=new JMenuBar();//菜单栏
		JMenu filemenu=new JMenu("File");
		JMenu setmenu=new JMenu("set");
		filemenu.add("新建");
		filemenu.add("打开");
		filemenu.add("导出");
//		filemenu.add(setmenu);
		
		setmenu.add(new JMenuItem("字体"));
		setmenu.add(new JMenuItem("JDK选择"));
		setmenu.add(new JMenuItem("字体颜色"));
		
		mb.add(filemenu);//菜单栏中添加Filemeanu菜单
		mb.add(setmenu);
		this.setJMenuBar(mb);//菜单栏添加到容器中
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.getContentPane().setBackground(Color.pink);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new JFrameTest03().init();
	}
	
}
