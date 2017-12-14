import java.awt.geom.*; 

class Triangle extends Polygone{
	
public Triangle (Point2D p1,Point2D p2,Point2D p3)
		{
		 super();
		 addPoint((int)p1.getX(),(int)p1.getY());	
		addPoint((int)p2.getX(),(int)p2.getY());	
		addPoint((int)p3.getX(),(int)p3.getY());		
		 }
		 
public void addPoint(int x, int y) {
	if (npoints<3) super.addPoint(x,y);
	} 		 

public static void main(String args[]) {
	Triangle t=new Triangle(
	                    new Point2D.Double(0,0),
			    new Point2D.Double(1,1),
			    new Point2D.Double(1,0));
	System.out.println(t+":"+t.perimetre());
	}
		 
	}
