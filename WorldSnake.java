import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class WorldSnake extends World{    
    Fila fila;
    
    public WorldSnake(){    
        //Malha de fundo 
        super(30, 30, 20); 
        GreenfootImage img = new GreenfootImage("Fundo.png");
        //img.drawRect(0,0,20,20);   
        setBackground(img);
        
        //Coloca a cobra
        fila = new Fila();  
        addObject(new Cabeca(), 10, 10); //adiciona cabeça
        addCorpo(9, 10);
        addCorpo(8, 10);
        addComida();
    }
    
    public void resetGame(){
        fila = new Fila();
        Cabeca cabeca = getObjects(Cabeca.class).get(0);
        removeObject(cabeca);
        
        List<Corpo> corpos = getObjects(Corpo.class);
        for(Corpo c : corpos){
            removeObject(c);
        }
        
        addObject(new Cabeca(), 10, 10); //adiciona cabeça
        addCorpo(9, 10);
        addCorpo(8, 10);
    }
    
    public void addCorpo(int x, int y){ //x e y posicao cabeca
        Corpo c = new Corpo();
        fila.enfileirar(c);
        addObject(c, x, y);
    }
    
    public void addComida(){
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Comida(), x, y);
    }
    
    public void moveCobra(int x, int y){ 
        int xAux = x;
        int yAux = y;
        Corpo c = fila.getPrimeiro();
        for(int i = 0; i < fila.getSize(); i++){
            xAux = c.getX();
            yAux = c.getY();
            c.setPosition(x, y);
            c = c.getProximo();
            x = xAux;
            y = yAux;
        }
    }
}