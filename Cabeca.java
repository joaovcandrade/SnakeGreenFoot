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
    
    public void act()
    {      
        moveSnake(); //move a cobra   
        if(isTouching(Comida.class)){ //caso toque na comida
            removeTouching(Comida.class);  //remove comida  pra n ficar cirando comidas em loop          
            WorldSnake world = (WorldSnake)getWorld();            
            world.addComida(); 
            comeu = true; 
        }     
    }
    
    //Movimenta a cobra de acordo com os botoes
    public void moveSnake(){        
        speedDelay(); //ativa o delay pra cobra ir devagar  
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        } else if(Greenfoot.isKeyDown("right")){           
            setRotation(0);            
        } else if(Greenfoot.isKeyDown("down")){            
            setRotation(90);            
        } else if(Greenfoot.isKeyDown("up")){ 
            setRotation(270);            
        }
        //Passa posicao pra cauda
    }
    
    //executa o if SPEED vezes, dando um atraso na movimentação da cobra, senao ela corre
    // loucamente.
    public void speedDelay(){ //
        if(speed < 0){
            speed = 10;
            WorldSnake world = (WorldSnake)getWorld(); 
            int x = getX();
            int y = getY();
             //implementar movecobra
            if (comeu == true){
                world.addCorpo(x, y);
                speedDelay += 0.05;
                comeu = false;
            }
            move(1);            
        }else{
            speed -= speedDelay;
        }
    }
}
