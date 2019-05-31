import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida extends Actor
{    
    public Comida(){
        GreenfootImage img = new GreenfootImage(20, 20);        
        img.setColor(Color.RED);
        img.fill();
        setImage(img); 
    }
}