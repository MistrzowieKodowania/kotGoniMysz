import greenfoot.*;

public class Kot extends Actor
{
    GreenfootImage image;
    public Kot(){
       image = getImage();
       image.scale(image.getWidth() * 2, image.getHeight() * 2);
       setImage(image);
    }
    
    public void act() 
    {
       Podworko swiat = (Podworko) getWorld();
       turnTowards(swiat.myszka.getX(), swiat.myszka.getY());
       move(2);
       if (isTouching(Mysz.class)) {
           setLocation(swiat.myszka.getX(), swiat.myszka.getY());
           removeTouching(Mysz.class);
           image.scale(image.getWidth() * 2, image.getHeight() * 2);
           setImage(image);
           Greenfoot.stop();
        }
    }    
}
