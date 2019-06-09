    
    // WARNING: This file is auto-generated and any changes to it will be overwritten
    import lang.stride.*;
    import java.util.*;
    import greenfoot.*;
    
    public class Cabeca extends Cobra
    {
        private double speedDelay;
        private double speed;
        private boolean comeu;
        private GreenfootImage strikeAberto, strikeFechado;
        
        public Cabeca(){
        super(true);   
        strikeAberto = new GreenfootImage("images/sprite_0.png");
        strikeAberto.scale(30,30);
        strikeFechado = new GreenfootImage("images/sprite_1.png");
        strikeFechado.scale(30,30);
        this.comeu = false;
        this.speed = 10;  
        this.speedDelay = 1;
    }
    
    public void act(){   
        if(isTouching(Comida.class)){ //caso toque na comida
            //comer();
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
        haComida();
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
            WorldSnake world = (WorldSnake)getWorld(); 
            world.moveCobra(getX(), getY(), getRotation());            
            if (comeu == true){
                world.addCorpo(getX(), getY());
                speedDelay += 0.1;
                comeu = false;                
            }            
            move(1);
        }else{            
            speed -= speedDelay;
        }
     }
     
    public void haComida(){
        if(getNeighbours(4, false, Comida.class).size() > 0){
            abrirBoca();
        }else{
            fecharBoca();
        }        
    }
     
    public void abrirBoca(){        
        setImage(strikeAberto);
    }
    
    public void fecharBoca(){        
        setImage(strikeFechado);    
    }
}
