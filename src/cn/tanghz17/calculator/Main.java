package cn.tanghz17.calculator;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
    	//创建Frame窗口
		JFrame jFrame=new JFrame("TANGhz17计算器");
		// 创建面板
		JPanel digitalJPanel=new JPanel();
		// 创建按钮
		JButton digitalBtn0=new JButton("0");
		JButton digitalBtn1=new JButton("1");
		JButton digitalBtn2=new JButton("2");
		JButton digitalBtn3=new JButton("3");
		JButton digitalBtn4=new JButton("4");
		JButton digitalBtn5=new JButton("5");
		JButton digitalBtn6=new JButton("6");
		JButton digitalBtn7=new JButton("7");
		JButton digitalBtn8=new JButton("8");
		JButton digitalBtn9=new JButton("9");
		//面板中添加按钮
		digitalJPanel.add(digitalBtn7);
		digitalJPanel.add(digitalBtn8);
		digitalJPanel.add(digitalBtn9);
		digitalJPanel.add(digitalBtn4);
		digitalJPanel.add(digitalBtn5);
		digitalJPanel.add(digitalBtn6);
		digitalJPanel.add(digitalBtn1);
		digitalJPanel.add(digitalBtn2);
		digitalJPanel.add(digitalBtn3);
		digitalJPanel.add(digitalBtn0);
		//指定面板的布局为GridLayout，4行4列，间隙为5
		digitalJPanel.setLayout(new GridLayout(4,4,5,5));
		digitalJPanel.setBackground(Color.white);    //设置背景色
		jFrame.add(digitalJPanel);    //添加面板到容器

		//JPanel symbolJPanel=new JPanel();

		//jFrame.add(symbolJPanel);

		jFrame.setBounds(300,200,300,150);    //设置容器的大小
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
