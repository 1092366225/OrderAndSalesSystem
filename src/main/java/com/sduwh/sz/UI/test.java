package com.sduwh.sz.UI;

import javax.swing.*;

public class test extends JInternalFrame {
    private JRadioButton radioButton1;
    private JButton button1;
    private JTextArea djsjfsjfjjsjfjsfj11TextArea;

    public test(){
        //父类 JInternalFrame 的构造方法
        //注意 JInternalFrame 类型的子窗口，默认构造方法没有最大、最小化以及关闭按钮，不能改变窗口大小
        super("学生信息");
        //this.setSize(100,100);

        //注意此处为子窗口关闭按钮设置的关闭类型，点关闭按钮时销毁子窗口，而不是退出程序
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //由于默认构造方法没有最大、最小化以及关闭按钮，不能改变窗口大小
        //如果希望子窗口可以最大最小化等，可以用类似下面的方法进行设置
        //当然也可以直接用带多个参数的构造方法直接设置这些值，具体自己查
        setMaximizable(true);	//标题栏有最大化按钮
        setIconifiable(true);	//标题栏有最小化按钮
        setClosable(true);		//标题栏有关闭按钮
        setResizable(true);		//可以改变大小
        button1.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
