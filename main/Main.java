package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window =  new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Fire Boy adventures");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); //sized to fit the preferred size and layouts of its subcomponents (=GamePanel)

        window.setLocationRelativeTo(null); //displayed at center of the screen
        window.setVisible(true);

        gamePanel.setUpGame();
        gamePanel.startGameThread();

    }
}
