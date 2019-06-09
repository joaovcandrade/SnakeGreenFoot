// WARNING: This file is auto-generated and any changes to it will be overwritten
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cobra extends Actor
{
    public Cobra(boolean cabeca) 
    {
        
        //seta imagem de acordo com a necessidade
        if(cabeca){
           GreenfootImage cabecinha = new GreenfootImage("images/sprite_1.png"); //inicializa cabeça da cobra
           cabecinha.scale(30,30);
           setImage(cabecinha);
        }else{
           GreenfootImage corpo = new GreenfootImage("images/sprite_2.png"); //inicializa corpo da cobra
           corpo.scale(30,30);
           setImage(corpo);
        }
    }
}
