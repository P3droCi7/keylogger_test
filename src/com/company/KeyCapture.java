package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyCapture implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
