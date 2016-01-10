import greenfoot.*;

public class Podworko extends World
{
   Kot lemur;
   Mysz myszka;
   
    public Podworko()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        lemur = new Kot();
        myszka = new Mysz();
        
        addObject(lemur, 100, 300);
        addObject(myszka, 700, 300);
        
        
    }
//komentarz testowy git
}
