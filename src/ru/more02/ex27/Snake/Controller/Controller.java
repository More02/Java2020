package ru.more02.ex27.Snake.Controller;

import ru.more02.ex27.Snake.Model.Snake;
import ru.more02.ex27.Snake.View.Renderer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller implements KeyListener, ActionListener {
    private Renderer renderer;
    private Timer mainTimer;
    private Snake snake;

    public PropertyChangeListener getViewListener() {
        return new ViewListener();
    }

    public Controller() {
        snake = new Snake();
        renderer = new Renderer(this);

        this.renderer.addKeyListener(this);
        this.mainTimer = new Timer(150, this);

        mainTimer.start();
    }

    public void stopGame() {
        mainTimer.stop();
    }

    public void startGame() {
        mainTimer.start();
    }


    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void actionPerformed(ActionEvent arg0) {
        renderer.moveForward();
    }

    private class ViewListener implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {

            System.out.println("Level is "+ evt.getNewValue());
            //use level
        }
    }

    public Snake getSnake() {
        return snake;
    }
}