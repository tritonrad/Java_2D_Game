package main;

import main.object.OBJ_Chest;
import main.object.OBJ_Door;
import main.object.OBJ_Fire;
import main.object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;

    }
    public void setObject() {
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 12 * gp.tileSize;
        gp.obj[0].worldY = 10 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 79 * gp.tileSize;
        gp.obj[1].worldY = 58 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 27 * gp.tileSize;
        gp.obj[2].worldY = 11 * gp.tileSize;

        gp.obj[3] = new OBJ_Key();
        gp.obj[3].worldX = 11 * gp.tileSize;
        gp.obj[3].worldY = 49 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 16 * gp.tileSize;
        gp.obj[4].worldY = 10 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 27 * gp.tileSize;
        gp.obj[5].worldY = 13 * gp.tileSize;

        gp.obj[6] = new OBJ_Door();
        gp.obj[6].worldX = 11 * gp.tileSize;
        gp.obj[6].worldY = 45 * gp.tileSize;

        gp.obj[7] = new OBJ_Door();
        gp.obj[7].worldX = 11 * gp.tileSize;
        gp.obj[7].worldY = 69 * gp.tileSize;

        gp.obj[8] = new OBJ_Chest();
        gp.obj[8].worldX = 13 * gp.tileSize;
        gp.obj[8].worldY = 71 * gp.tileSize;


    }
}
