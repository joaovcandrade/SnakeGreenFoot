// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Cabeca extends Cobra
{
    private boolean comeu;
    public Cabeca(){
        super(true);
        this.comeu = false;
    }
    
    public void act()
    {      
        moveSnake(); //move a cobra   
        if(isTouching(Comida.class)){ //caso toque na comida
            removeTouching(Comida.class);  //remove comida  pra n ficar cirando comidas em loop          
            worldSnake world = (worldSnake)getWorld();            
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
        move(1);
        //Implementar Delay
    }
}
