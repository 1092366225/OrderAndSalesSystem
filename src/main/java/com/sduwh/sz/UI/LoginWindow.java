/*
 * Created by JFormDesigner on Fri Jul 20 17:16:01 CST 2018
 */

package com.sduwh.sz.UI;

import com.sduwh.sz.common.MyTextField;
import com.sduwh.sz.common.MyTextFieldBorder;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.painter.border.StandardBorderPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import static org.pushingpixels.substance.api.SubstanceLookAndFeel.*;


/**
 * @author real
 */
public class LoginWindow {
    public LoginWindow() {
        initComponents();
        //border
        account.setBorder(new MyTextFieldBorder());
        btnExit.setBorder(new MyTextFieldBorder());

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Login = new JFrame();
        account = new JTextField();
        pwd = new JTextField();
        btnLogin = new JButton();
        btnExit = new JButton();

        //======== Login ========
        {
            Container LoginContentPane = Login.getContentPane();
            LoginContentPane.setLayout(null);

            //---- account ----
            account.setBackground(Color.white);
            LoginContentPane.add(account);
            account.setBounds(105, 95, 180, account.getPreferredSize().height);
            LoginContentPane.add(pwd);
            pwd.setBounds(105, 140, 180, pwd.getPreferredSize().height);

            //---- btnLogin ----
            btnLogin.setText("\u767b\u5f55");
            LoginContentPane.add(btnLogin);
            btnLogin.setBounds(105, 185, 80, 30);

            //---- btnExit ----
            btnExit.setText("\u9000\u51fa");
            LoginContentPane.add(btnExit);
            btnExit.setBounds(205, 185, 79, 30);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < LoginContentPane.getComponentCount(); i++) {
                    Rectangle bounds = LoginContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = LoginContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                LoginContentPane.setMinimumSize(preferredSize);
                LoginContentPane.setPreferredSize(preferredSize);
            }
            Login.pack();
            Login.setLocationRelativeTo(Login.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        pwd.setMargin(new Insets(0, 20, 0, 0));
        Login.setVisible(true);



    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame Login;
    private JTextField account;
    private JTextField pwd;
    private JButton btnLogin;
    private JButton btnExit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    public static void  main(String[] args){

        LoginWindow lw = new LoginWindow();



    }
}
