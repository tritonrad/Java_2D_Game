package main.object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Fire extends SuperObject{
    public OBJ_Fire(){
        name = "Fire";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/Objects/fire00.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}