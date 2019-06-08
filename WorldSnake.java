import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WorldSnake extends World
{    
    Fila fila;
    
    public WorldSnake()
    {    
        //Malha de fundo 
        super(30, 30, 20); 
        GreenfootImage img = new GreenfootImage("Fundo.png");
        //img.drawRect(0,0,20,20);   
        setBackground(img);
        
        //Coloca a cobra
        fila = new Fila();        
        addObject(new Cabeca(), 10, 10); //adiciona cabeça
        addComida();
    }
    
    public void addCorpo(int x, int y){ //x e y posicao cabeca
        Corpo c = new Corpo();
        fila.enfileirar(c);
        addObject(c, x, y);
    }
    
    public void addComida(){
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Comida(), x , y);
    }
}