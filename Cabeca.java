
// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Cabeca extends Cobra
{
    private double speedDelay;
    private double speed;
    private boolean comeu;
    
    public Cabeca(){
        super(true);
        this.comeu = false;
        this.speed = 10;  
        this.speedDelay = 1;
    }
    
    public void act(){   
        if(isTouching(Comida.class)){ //caso toque na comida
            tocouComida();
        } else if(isTouching(Corpo.class)){
            morreu();
        } else {
            moveSnake(); //move a cobra   
        }
    }
    
    public void tocouComida(){
        WorldSnake world = (WorldSnake) getWorld();
        removeTouching(Comida.class);  //remove comida  pra n ficar cirando comidas em loop       
        world.addComida(); 
        comeu = true;
        moveSnake();
    }
    
    public void morreu(){
        WorldSnake world = (WorldSnake) getWorld();
        world.reset();
    }
    
    //Movimenta a cobra de acordo com os botoes
    public void moveSnake(){        
        if(Greenfoot.isKeyDown("left")){
            if(getRotation() != 0){
                setRotation(180);
            }
        } else if(Greenfoot.isKeyDown("right")){
            if(getRotation() != 180){
                setRotation(0);            
            }
        } else if(Greenfoot.isKeyDown("down")){
            if(getRotation() != 270){
                setRotation(90);            
            }
        } else if(Greenfoot.isKeyDown("up")){
            if(getRotation() != 90){
                setRotation(270);            
            }
        }
        speedDelay(); //ativa o delay pra cobra ir devagar  
    }
    
    //executa o if SPEED vezes, dando um atraso na movimentação da cobra, senao ela corre
    // loucamente.
    public void speedDelay(){ //
        if(speed < 0){
            speed = 10;
            int x = getX();
            int y = getY();
            
            WorldSnake world = (WorldSnake)getWorld(); 
            world.moveCobra(x, y);
            
            if (comeu == true){
                world.addCorpo(x, y);
                speedDelay += 0.1;
                comeu = false;
            }
            move(1);
        }else{
            speed -= speedDelay;
        }
    }
}
