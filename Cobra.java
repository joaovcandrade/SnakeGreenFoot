// WARNING: This file is auto-generated and any changes to it will be overwritten
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cobra extends Actor
{
    public Cobra(boolean cabeca) 
    {
        GreenfootImage img = new GreenfootImage(20,20);
        img.setColor((cabeca)? Color.YELLOW : Color.BLACK); //escolhe a cor
        img.fill(); //preenche o quadrado de preto
        setImage(img); //troca a cobra pela imagem
    }
}
