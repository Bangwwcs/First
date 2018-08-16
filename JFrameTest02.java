package com.great.test01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JFrameTest02 extends JFrame{
	public JFrameTest02()
	{
		JPanel c=(JPanel)this.getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(null);//允许你在面板上自由的布局
		
		JLabel j2=new JLabel("文本框 ");
		j2.setBounds(50, 20, 200, 100);//设定标签的位置以及在面板上的大小
		c.add(j2);
		
		JTextArea ta=new JTextArea();
		ta.setBackground(Color.pink);//多行文本对象
		ta.setBounds(50, 20, 200, 80);
		c.add(ta);
		
		JButton ok=new JButton("确定");
		ok.setBounds(50, 330, 60, 40);
		c.add(ok);
		
		JCheckBox box=new JCheckBox("自选",false);
		box.setBounds(50, 100, 80, 30);
		c.add(box);
		
		JCheckBox box1=new JCheckBox("推荐",false);
		box1.setBounds(50, 150, 80, 30);
		c.add(box1);
		
		JRadioButton jRadioButton=new JRadioButton("介绍",false);
		jRadioButton.setBounds(250, 100, 80, 30);
		c.add(jRadioButton);
		
		String[] str={"本田","丰田","日产"};
		JList n=new JList(str);
		n.setBackground(Color.pink);
		n.setBounds(50, 200, 200, 100);
		c.add(n);
		
		String[] names={"本田","丰田","日产","benz","floriy"};
		JComboBox auhouseBox=new JComboBox(names);
		auhouseBox.setBounds(50, 200,200, 30);
		c.add(auhouseBox);
		
		JButton cancel=new JButton("取消");
		cancel.setBounds(100, 330, 60, 40);
		c.add(cancel);
		
		
		
		
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new JFrameTest02().setVisible(true);
	}
}
