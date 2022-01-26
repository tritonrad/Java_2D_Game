package main;


import entity.Player;
import main.object.SuperObject;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    //Screen settings (scale to size)
    final int originalTileSize = 16; //16x16 tiles
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; //48*48 tile
    public final int maxScreenCol = 25;
    public final int maxScreenRow = 20;
    public final int screenWidth = tileSize * maxScreenCol;  //768 pixels
    public final int screenHeight = tileSize * maxScreenRow; //576 pixels

    //World settings
    public final int maxWorldCol = 85;
    public final int maxWorldRow = 84;
    public final int worldWidth = maxWorldCol * tileSize;
    public final int worldHeight = maxWorldRow * tileSize;

    //FPS
    int FPS = 55;


    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread; //when we want to repeat process over and over again thread is useful
    public CollisionChecker colChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public Player player = new Player(this,keyH);
    public SuperObject obj[] = new SuperObject[10];



    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //using double buffer improves game rendering performance
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    public void setUpGame(){
        aSetter.setObject();

    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update(){
        player.update();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g; //change g to g2 class
        //tile
        tileM.draw(g2);
        //main.object
        for(int i =0; i <obj.length; i++){
            if(obj[i] != null) {
                obj[i].draw(g2, this);
            }
        }


        //player
        player.draw(g2);


        g2.dispose();
    }
}


