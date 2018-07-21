package com.sduwh.sz.UI;

import com.sduwh.sz.common.MDIDesktopPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private MDIDesktopPane desktop = new MDIDesktopPane();
    private JScrollPane scrollPane = new JScrollPane();
    public  static void main(String[] args){
        MainWindow mw = new MainWindow();
        mw.setSize(300,200);
        mw.setLocation(300,200);
        mw.setVisible(true);
    }
    public MainWindow(){
        desktop.setBackground(Color.lightGray);
        desktop.add(new test3());
        scrollPane.getViewport().add(desktop);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
