package paint.PaintAssignment;

import java.awt.Graphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Interaction  {
	
	//Point p;
	//List<Shape> Drawables;
	Vector Drawables;
	
	
	public Interaction()
	{
		
		Drawables = new Vector();
		//Drawables.add(new Point(120,40));
	}
	
	public void DrawShape(Shape p)
	{
		Drawables.add(p);
		
	}
	
	
	public void RePaint(Graphics g)
	{
		Shape j;
		for (int i = 0; i < Drawables.size(); i++)
		{
			j = (Shape)(Drawables.get(i));
			j.Draw(g);
		
		}
		
	}
	
	public void Clear()
	{
		Drawables.clear();
	}
}
