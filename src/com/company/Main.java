package com.company;

import javax.swing.*;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {
        JTextField jTextField = new JTextField(10);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add(jTextField);
        frame.pack();
        frame.setVisible(true);
        KeyCapture keyCapture = new KeyCapture();
        jTextField.addKeyListener(keyCapture);
    }
}
