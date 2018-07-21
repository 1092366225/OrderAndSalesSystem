/*
 * Created by JFormDesigner on Fri Jul 20 17:00:38 CST 2018
 */

package com.sduwh.sz.UI;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author real
 */
public class test3 extends JInternalFrame {
    public test3() {
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

        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("jfshf");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(240, 80), button1.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
