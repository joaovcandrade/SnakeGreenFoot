import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class WorldSnake extends World{    
    Fila fila;
    private Contador contador;
    
    public WorldSnake(){    
        //Malha de fundo 
        super(20, 20, 30); 
        GreenfootImage img = new GreenfootImage("images/Background/b1.png");
        img.scale(60,60);   
        setBackground(img);
        this.contador = new Contador();
        //Coloca a cobra
        fila = new Fila();  
        start();
    }
    
    public void start(){
        addObject(new Cabeca(), 10, 10); //adiciona cabeça
        addObject(contador, 2, 0);
        addCorpo(9, 10);
        addCorpo(8, 10);
        addComida();
    }
    
    public void reset(){
        addObject(new GameOver(), getWidth()/2 , getHeight()/2);
        //List objects = getObjects(null);
        //removeObjects(objects); //remove todos os objetos do mundo
        //for(int i = 0; !fila.vazio(); i++){ //desenfilera
         //   fila.desenfileirar();
        //}        
        //start();
    }
    
    public void addCorpo(int x, int y){ //x e y posicao cabeca
        Corpo c = new Corpo();
        fila.enfileirar(c);
        addObject(c, x, y);
    }
    
    public void addComida(){
        int x, y;
        do{
             x = Greenfoot.getRandomNumber(getWidth());
             y = Greenfoot.getRandomNumber(getHeight());
        }while(getObjectsAt(x, y, null).size() > 0); //verifica se ha algum ator nesta posiçao.
        addObject(new Comida(), x, y);
        contador.aumentarPontos();
    }
    
    public void moveCobra(int x, int y, int rotation){ 
        int xAux = x;
        int yAux = y;
        int rotAux = rotation;
        Corpo c = fila.getPrimeiro();
        for(int i = 0; i < fila.getSize(); i++){
            xAux = c.getX();
            yAux = c.getY();
            rotAux = c.getRotation();
            c.setRotation(rotation);
            c.setPosition(x, y);
            c = c.getProximo();
            x = xAux;
            y = yAux;
            rotation = rotAux;
        }
    }
}