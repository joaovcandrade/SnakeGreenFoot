// WARNING: This file is auto-generated and any changes to it will be overwritten
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cobra extends Actor
{
    public Cobra(boolean cabeca) 
    {
        GreenfootImage cabecinha = new GreenfootImage("images/cabeca.png"); //inicializa cabeça da cobra
        GreenfootImage corpo = new GreenfootImage("images/corpo.png"); //inicializa corpo da cobra
        
        //seta imagem de acordo com a necessidade
        if(cabeca)setImage(cabecinha);
        else setImage(corpo);
    }
}
