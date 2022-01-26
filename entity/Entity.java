package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity {

    public int worldX,worldY;
    public int speed;

    public BufferedImage down1, down2, left1, left2, right1, right2, up1, up2;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
    public int solidAreaDefaultX, solidAreaDefaultY;

    public Rectangle solidArea;
    public boolean collisionOn = false;

}
