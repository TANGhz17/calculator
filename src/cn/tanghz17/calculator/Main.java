package cn.tanghz17.calculator;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
	    JFrame jf=new JFrame("TANGhz17计算器");
	    jf.setBounds(300,100,400,200);
	    JPanel jp=new JPanel();
	    JLabel jl=new JLabel("TANGhz17计算器");
	    jp.setBackground(Color.white);
	    jp.add(jl);
	    jf.add(jp);
	    jf.setVisible(true);
    }
}
