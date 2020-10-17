package ru.more02.ex27.Snake.View;

import ru.more02.ex27.Snake.Controller.Controller;
import ru.more02.ex27.Snake.Model.Fruit;
import ru.more02.ex27.Snake.Model.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Random;

public class Renderer extends JFrame {
    private final int WIDTH = 500;
    private final int HEIGHT = 300;
    private Snake snake;

    public int LevelConst;

    private Controller controller;
    public JPanel pamel1, panel2;
    public JButton[] ButtonBody = new JButton[200];
    public JButton bonusfood;
    public JTextArea textArea;
    public Fruit fruit;
    public int score;
    public Random random = new Random();
    public JMenuBar mybar;
    public JMenu game, help, levels;

    public void initializeValues() {
        score = 0;
    }

    public Renderer(Controller controller) {
        super("Snake: Demo");
        this.controller = controller;
        snake = controller.getSnake();

        fruit = new Fruit();
        setBounds(200, 200, 506, 380);
        //creatbar();
        creatbar(controller.getViewListener());
        initializeValues();
        // GUI
        pamel1 = new JPanel();
        panel2 = new JPanel();
        // Scoreboard
        setResizable(false);
        textArea = new JTextArea("Счет : " + score);
        textArea.setEnabled(false);
        textArea.setBounds(400, 400, 100, 100);
        textArea.setBackground(Color.GRAY);
        // Eating and growing up
        bonusfood = new JButton();
        bonusfood.setEnabled(false);
        //
        createFirstSnake();

        pamel1.setLayout(null);
        panel2.setLayout(new GridLayout(0, 1));
        pamel1.setBounds(0, 0, WIDTH, HEIGHT);
        pamel1.setBackground(Color.GRAY);
        panel2.setBounds(0, HEIGHT, WIDTH, 30);
        panel2.setBackground(Color.black);

        panel2.add(textArea); // will contain score board
        // end of UI design
        getContentPane().setLayout(null);
        getContentPane().add(pamel1);
        getContentPane().add(panel2);
        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public void createFirstSnake() {

        for (int i = 0; i < 3; i++) {
            ButtonBody[i] = new JButton(" " + i);
            ButtonBody[i].setEnabled(false);
            pamel1.add(ButtonBody[i]);
            ButtonBody[i].setBounds(snake.x[i], snake.y[i], 10, 10);
            snake.x[i + 1] = snake.x[i] - 10;
            snake.y[i + 1] = snake.y[i];
        }
    }

    // Creating of menu bar
    public void creatbar() {
        mybar = new JMenuBar();

        game = new JMenu("Game");
        JMenuItem newgame = new JMenuItem("New Game");
        JMenuItem exit = new JMenuItem("Exit");
        newgame.addActionListener(e -> reset());

        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        game.add(newgame);
        game.addSeparator();
        game.add(exit);

        mybar.add(game);
        levels = new JMenu("Level");
        JMenuItem easy = new JMenuItem("Easy");
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LevelConst = 0;

            }
        });

        JMenuItem middle = new JMenuItem("Medium");
        middle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LevelConst = 1;

            }
        });
        JMenuItem hard = new JMenuItem("Hard");
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LevelConst = 2;

            }
        });
        levels.add(easy);
        levels.addSeparator();
        levels.add(middle);
        levels.addSeparator();
        levels.add(hard);
        mybar.add(levels);
        help = new JMenu("Help");

        JMenuItem creator = new JMenuItem("There must be a button");

        creator.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(pamel1, "Random text");

            }
        });

        help.add(creator);
        mybar.add(help);

        setJMenuBar(mybar);
    }

    public void creatbar(PropertyChangeListener listener) {
        mybar = new JMenuBar();
        mybar.addPropertyChangeListener(listener);//add listener to menu bar

        game = new JMenu("Game");
        JMenuItem newgame = new JMenuItem("New Game");
        JMenuItem exit = new JMenuItem("Exit");
        newgame.addActionListener(e -> reset());

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        game.add(newgame);
        game.addSeparator();
        game.add(exit);

        mybar.add(game);
        levels = new JMenu("Level");
        JMenuItem easy = new JMenuItem("Easy");
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mybar.firePropertyChange("Level", LevelConst, 0); //use listener
                LevelConst = 0;
            }
        });

        JMenuItem middle = new JMenuItem("Medium");
        middle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mybar.firePropertyChange("Level", LevelConst, 1);
                LevelConst = 1;
            }
        });
        JMenuItem hard = new JMenuItem("Hard");
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mybar.firePropertyChange("Level", LevelConst, 2);
                LevelConst = 2;
            }
        });
        levels.add(easy);
        levels.addSeparator();
        levels.add(middle);
        levels.addSeparator();
        levels.add(hard);
        mybar.add(levels);
        help = new JMenu("Help");

        JMenuItem creator = new JMenuItem("There must be a button");

        creator.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(pamel1, "Random text");

            }
        });

        help.add(creator);
        mybar.add(help);

        setJMenuBar(mybar);
    }


    void reset() {
        initializeValues();
        pamel1.removeAll();

        controller.stopGame();

        createFirstSnake();
        textArea.setText("Score: " + score);

        controller.startGame();
    }


    void growup() {
        ButtonBody[snake.getLength()] = new JButton(" " + snake.getLength());
        ButtonBody[snake.getLength()].setEnabled(false);
        pamel1.add(ButtonBody[snake.getLength()]);
        ButtonBody[snake.getLength()].setBounds(snake.getPointBody()[snake.getLength() - 1].x, snake.getPointBody()[snake.getLength() - 1].y, 10, 10);
        snake.setLength(snake.getLength() + 1);
    }

    public void moveForward() {
        for (int i = 0; i < snake.getLength(); i++) {
            snake.getPointBody()[i] = ButtonBody[i].getLocation();
        }

        snake.x[0] += snake.getDirectionX();
        snake.y[0] += snake.getDirectionY();
        ButtonBody[0].setBounds(snake.x[0], snake.y[0], 10, 10);

        for (int i = 1; i < snake.getLength(); i++) {
            ButtonBody[i].setLocation(snake.getPointBody()[i - 1]);
        }

        if (snake.x[0] == WIDTH) {
            controller.stopGame();
        } else if (snake.x[0] == 0) {
            controller.stopGame();
        } else if (snake.y[0] == HEIGHT) {
            controller.stopGame();
        } else if (snake.y[0] == 0) {
            controller.stopGame();
        }

        createFruit();

        collisionFruit();
        pamel1.repaint();

    }

    private void collisionFruit() {
        if (fruit.isFood()) {
            if (fruit.getPoint().x == snake.x[0] && fruit.getPoint().y == snake.y[0]) {
                pamel1.remove(bonusfood);
                score += 1;
                growup();
                textArea.setText("Score: " + score);
                fruit.setFood(false);

            }
        }
    }

    private void createFruit() {
        if (!fruit.isFood()) {
            pamel1.add(bonusfood);
            bonusfood.setBounds((10 * random.nextInt(50)), (10 * random.nextInt(25)), 10,
                    10);
            fruit.setPoint(bonusfood.getLocation());
            fruit.setFood(true);
        }
    }
}