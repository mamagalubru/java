
class Ovale
{   private Graphics g;
     private int orx,ory,large,haut;
         private static float echelle=1.0f;
     public Color col;
     private boolean plein;

Ovale(Graphics appG,int x, int y, int l, int h) //constructeur 1
{   g=appG;
     orx=x; ory=y; large=l; haut=h;
     plein=false;}

Ovale(Graphics appG,int x, int y, int l, int h,Color couleur) //constructeur 2
{   g=appG;
     orx=x; ory=y; large=l; haut=h;
     plein=true; col=couleur;}

public void dessine()
{   if (plein){
        g.setColor(col); g.fillOval(orx,ory,large,haut);}
     g.setColor(Color.black);
     g.drawOval(orx,ory,large,haut);}

public void tourne()
{   int temp;
     temp=large; large=haut; haut=temp;}

public void bouge(int dx, int dy)
{   orx += dx;    ory += dy;}

public void change(int l, int h)
{   large = l;   this.haut = h;} //this est facultatif

public int surface()
{   int sur=(int)(large*haut*echelle);
     this.dessine();
     g.drawString(""+sur,orx+10,ory+20);
     return sur;}
}
