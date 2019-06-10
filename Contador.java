import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    private int pontos;
    private String prefixo = "Pontos: ";
    
    public Contador(){
        this.pontos = -1;
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void aumentarPontos(){
        pontos++;
        updateImage();
    }
    public void updateImage()
    {
        GreenfootImage text = new GreenfootImage(prefixo + pontos,
                                                 30, Color.BLACK,
                                                 new Color(0,0,0,0));
        
        setImage(text);
    }    
}
