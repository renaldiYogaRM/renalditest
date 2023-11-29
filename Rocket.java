import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 10;
    public void act()
    {
        World w = getWorld();
        move(speed);
        if (isTouching(Rocket.class))
        {
            setImage("smiley5.png");
            speed = 0;
        }
        if (isAtEdge())
        {
            setRotation(getRotation()-90);
            turn(17);
        }
    }
    public Rocket()
    {
        GreenfootImage img = this.getImage();
        img.scale(65,55);
        this.setImage(img);
    }
}