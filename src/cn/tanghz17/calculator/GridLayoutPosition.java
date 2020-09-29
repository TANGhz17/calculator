package cn.tanghz17.calculator;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    public GridLayoutPosition(){
        Container digitalContainer = getContentPane();
        setLayout(new GridLayout(4,4,1,1));
        for (int i = 0;i<10;i++){
            digitalContainer.add(new JButton(""+(9-i)));
        }

        setSize(400,300);
        setTitle("TANGhz17计算器");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
