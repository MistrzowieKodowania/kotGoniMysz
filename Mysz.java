import greenfoot.*;

public class Mysz extends Actor
{
    MouseInfo myszKomp;
    int mx;
    int my;
    public void act() 
    {
     myszKomp = Greenfoot.getMouseInfo();
     if(myszKomp != null){
       mx = myszKomp.getX();
       my = myszKomp.getY();
       turnTowards(mx, my);
       move(5);
     }   
    }    
}
