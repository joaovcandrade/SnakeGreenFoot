// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cobrona extends Actor
{

    /**
     * Act - do whatever the Cobrona wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if(Greenfoot.isKeyDown("left")){
            if(this.getRotation() != 180 && this.getRotation() != 0){
                setRotation(180);
            }
        } else if(Greenfoot.isKeyDown("right")){
            if(this.getRotation() != 180 && this.getRotation() != 0){
                setRotation(0);
            }
        } else if(Greenfoot.isKeyDown("down")){
            if(this.getRotation() != 90 && this.getRotation() != 270){
                setRotation(90);
            }
        } else if(Greenfoot.isKeyDown("up")){
            
            if(this.getRotation() != 90 && this.getRotation() != 270){
            setRotation(270);
            }
        }
    }
}
