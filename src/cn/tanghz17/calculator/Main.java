package cn.tanghz17.calculator;

import javax.swing.*;

public class Main {
    private static void calculatorGUI(){
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //创建窗口frame
        JFrame frame = new JFrame("TANGhz17计算器");
        //窗口大小
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton zero = new JButton("0");
        frame.getContentPane().add(zero);

        JButton one = new JButton("1");
        frame.getContentPane().add(one);

        JButton two = new JButton("2");
        frame.getContentPane().add(two);

        //显示窗口
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
	// write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                calculatorGUI();
            }
        });
    }
}
