package cn.tanghz17.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GridLayoutPosition extends JFrame {
    JTextField inputField =new  JTextField("");

    public GridLayoutPosition(String frameTitle){
        GridBagLayout gbaglayout=new GridBagLayout();           //创建GridBagLayout布局管理器
        GridBagConstraints constraints=new GridBagConstraints();

        constraints.fill=GridBagConstraints.BOTH;               //组件填充显示区域
        constraints.weightx=0.0;                                //恢复默认值
        constraints.gridwidth = GridBagConstraints.REMAINDER;   //结束行

        inputField.setEditable(false);
        inputField.setFont(new Font("黑体",Font.BOLD,16));
        gbaglayout.setConstraints(inputField, constraints);
        add(inputField);
        constraints.weightx=0.5;    // 指定组件的分配区域
        constraints.weighty=0.2;
        constraints.gridwidth=1;

        makeButton("7",gbaglayout,constraints);
        makeButton("8",gbaglayout,constraints);
        makeButton("9",gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;    //结束行
        makeButton("/",gbaglayout,constraints);
        constraints.gridwidth=1;    //重新设置gridwidth的值

        makeButton("4",gbaglayout,constraints);
        makeButton("5",gbaglayout,constraints);
        makeButton("6",gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("*",gbaglayout,constraints);
        constraints.gridwidth=1;

        makeButton("1",gbaglayout,constraints);
        makeButton("2",gbaglayout,constraints);
        makeButton("3",gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("-",gbaglayout,constraints);
        constraints.gridwidth=1;

        makeButton("=",gbaglayout,constraints);
        makeButton("0",gbaglayout,constraints);
        makeButton(".",gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("+",gbaglayout,constraints);
        constraints.gridwidth=1;

        setLayout(gbaglayout);                  //使用GridBagLayout布局管理器
        setSize(400,200);
        setTitle(frameTitle);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void makeButton(String title, GridBagLayout gridBagLayout, GridBagConstraints constraints){
        JButton button=new JButton(title);    //创建Button对象
        button.setFont(new Font("黑体",Font.BOLD,16));    //修改字体
        gridBagLayout.setConstraints(button,constraints);
        button.addActionListener(new AbstractAction() {         //按钮点击监控触发事件
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputFieldText = inputField.getText();
                inputField.setText(inputFieldText+title);       //改变inputField内容
            }
        });
        add(button);
    }
    public void clickButton(){

    }
}
