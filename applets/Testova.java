import java.applet.*;
import java.awt.*;

public class Testova extends Applet
{   Ovale r1,r2;

public void init()
{   setBackground(Color.lightGray);
     r1= new Ovale(getGraphics(),10,20,100,50);
     r2= new Ovale(getGraphics(),10,80,60,60,Color.red);}

public void paint(Graphics g)
{   int x = r1.surface();    g.drawString(""+x,250,100);
     r1.dessine();
     r2.dessine();
     r1.tourne();
     r1.bouge(180,100);
     r1.dessine();
     r2.bouge(20,30);
     r2.col = Color.blue;
     r2.change(20,40);
     r2.dessine();}
} 