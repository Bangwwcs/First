package com.great.test01;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JFrameTest03 extends JFrame{
	
	public void init() {
		JMenuBar mb=new JMenuBar();//�˵���
		JMenu filemenu=new JMenu("File");
		JMenu setmenu=new JMenu("set");
		filemenu.add("�½�");
		filemenu.add("��");
		filemenu.add("����");
//		filemenu.add(setmenu);
		
		setmenu.add(new JMenuItem("����"));
		setmenu.add(new JMenuItem("JDKѡ��"));
		setmenu.add(new JMenuItem("������ɫ"));
		
		mb.add(filemenu);//�˵��������Filemeanu�˵�
		mb.add(setmenu);
		this.setJMenuBar(mb);//�˵�����ӵ�������
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.getContentPane().setBackground(Color.pink);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new JFrameTest03().init();
	}
	
}
