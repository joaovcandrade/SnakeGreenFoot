import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);   
        setBackground("images/menu.png");
        setText("Snake", 100, this.getWidth()/3, this.getHeight()/10 );
        setText("Pressione Enter ou Espaço para iniciar", 40 , 25, this.getHeight()-50);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new WorldSnake());
    }
    
    public void setText(String title ,int tam,  int posX, int posY){
      GreenfootImage img = new GreenfootImage(title, tam, null, null);
      this.getBackground().drawImage( img, posX, posY);
    }

}
