package com.games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;

public class Game extends Arma implements KeyListener, MouseListener {

    private String event_e = " ";
    private Frame window;
    private Arma guns;
    private Label label, label2;

    public Game() {
        guns = new Arma();
        window = new Frame("Shooter Game");

        window.setLayout(new FlowLayout());
        window.setSize(400, 400);
        label = new Label("Look, shoot and reload", Label.CENTER);
        label2 = new Label();
        window.add(label);
        window.add(label2);
        window.setVisible(true);

        window.addKeyListener(this);
        window.addMouseListener(this);
    }

    //Will be invoked when the key is typed, pressed and released
    @Override
    public void keyTyped(KeyEvent typed) {
        event_e = "The Key Typed was: " + typed.getKeyChar();
    }

    @Override
    public void keyPressed(KeyEvent pressed) {
        print("The key Pressed: " + pressed.getKeyChar());

        if (pressed.getKeyChar() == 'r') {
            guns.recharge();
        } else {
            print("Undefined key");
        }
    }

    @Override
    public void keyReleased(KeyEvent released) {
        event_e = "The key Released was: " + released.getKeyChar();
    }

    /*
    --------------------------------------------------------------------
    */

    //Invoked when the mouse key is clicked, entered, exited, pressed and released.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            guns.shoot();
        }
    }

    @Override
    public void mouseEntered(MouseEvent entered) {
        event_e += "The mouse enters a component.    ";
        /*label2.setText(event_e);
        window.setVisible(true);*/
    }

    @Override
    public void mouseExited(MouseEvent exited) {
        event_e += "The mouse comes out of a component.   ";
        /*label2.setText(event_e);
        window.setVisible(true);*/
    }

    @Override
    public void mousePressed(MouseEvent pressed) {
        if (SwingUtilities.isRightMouseButton(pressed)) {
            guns.zoomIncreased();
        }
    }

    @Override
    public void mouseReleased(MouseEvent released) {
        if (SwingUtilities.isRightMouseButton(released)) {
            guns.zoomDecreased();
        }
    }

    /*
    -------------------------------------------------------------------
    */

    private void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        new Game();
    }
}