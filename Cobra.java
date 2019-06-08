// WARNING: This file is auto-generated and any changes to it will be overwritten
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cobra extends Actor
{
    public Cobra(boolean cabeca) 
    {
        GreenfootImage cabecinha = new GreenfootImage("Cabeca.png"); //inicializa cabeça da cobra
        GreenfootImage corpo = new GreenfootImage("Corpo.png"); //inicializa corpo da cobra
        
        //seta imagem de acordo com a necessidade
        if(cabeca)setImage(cabecinha);
        else setImage(corpo);
    }
}
