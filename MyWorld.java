import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,408,190);
        rocket.setLocation(306,255);
        Rocket rocket2 = new Rocket();
        addObject(rocket2,194,152);
        rocket2.setRotation(90);
        rocket2.setRotation(-180);
    }
    
}
