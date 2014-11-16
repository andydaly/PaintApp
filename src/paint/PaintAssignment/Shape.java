package paint.PaintAssignment;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	
	String ShapeType;
	Color ColourType;
	int x1, y1, x2, y2, x, y, w, h;
	
	public Shape(String Type, Color Colour, int X1, int Y1, int X2, int Y2){
		
		ShapeType = Type;
		ColourType = Colour;
		x1=X1;
		y1=Y1;
		x2=X2;
		y2=Y2;
		if (x1 >= x2) { 
	         x = x2;
	         w = x1 - x2;
	      }
	      else {          
	         x = x1;
	         w = x2 - x1;
	      }
	      if (y1 >= y2) {  
	         y = y2;
	         h = y1 - y2;
	      }
	      else {          
	         y = y1;
	         h = y2 - y1;
	      }
		
	}
	
	public void Draw(Graphics g){
		
		g.setColor(ColourType);
		
		if(ShapeType.equals("Pencil")){
		    g.drawLine(x1, y1, x1, y1);
		}
		else if(ShapeType.equals("Line")){
			g.drawLine(x1,y1,x2,y2);
		}
		else if(ShapeType.equals("Rectangle")){
			 g.drawRect(x, y, w, h);
		}
		else if(ShapeType.equals("Filled Rectangle")){
			 g.fillRect(x, y, w, h);
		}
		else if(ShapeType.equals("Circle")){
		      g.drawOval(x, y, w, h);
		}
		else if(ShapeType.equals("Filled Circle")){
		      g.fillOval(x, y, w, h);
		}	    
	}
}
