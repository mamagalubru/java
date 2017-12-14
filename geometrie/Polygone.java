import java.awt.*;
import java.awt.geom.*; 

class Polygone extends Polygon {
	
	public String toString() {
		String resultat="[";
		for (int i=0;i<npoints;i++)
		    resultat=resultat+"("+xpoints[i]+","
					           +ypoints[i]+")";
		resultat=resultat+"]";
		return resultat;
		}
		
	public double perimetre() {
		if (npoints<2) return 0;
		else {double p=0;
			for (int i=1;i<npoints;i++)
			   p=p+Point2D.distance(
			              xpoints[i],
			              ypoints[i],
			              xpoints[i-1],
			              ypoints[i-1]);
			   p=p+Point2D.distance(
				      xpoints[0],
			              ypoints[0],
			              xpoints[npoints-1],
			              ypoints[npoints-1]);
			return p;
			}
		}	
		
	public static void main(String args[]) {
		Polygone p = new Polygone();
		p.addPoint(0,0);
		p.addPoint(1,1);
		p.addPoint(1,0);
		System.out.println(p);
		System.out.println(p.perimetre());
		}
	
	
	}