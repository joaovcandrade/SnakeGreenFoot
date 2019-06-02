import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class worldSnake extends World
{    
    Fila fila;
    
    public worldSnake()
    {    
        //Malha de fundo 
        super(30, 30, 20); 
        GreenfootImage img = new GreenfootImage(20,20);
        img.drawRect(0,0,20,20);
        setBackground(img);
        
        //Coloca a cabra
        fila = new Fila();        
        addObject(new Cobra(true), 10, 10); //adiciona cabeça
    }    
}