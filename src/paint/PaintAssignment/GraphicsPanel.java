package paint.PaintAssignment;

import java.awt.*;
import javax.swing.JPanel;



public class GraphicsPanel extends JPanel {

	//Graphics Draw;
	private Interaction Draw;
	Status StatPanel;
	public GraphicsPanel(Status s)
	{
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(500,400));
		Draw = new Interaction();
		StatPanel = s;
	
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
			
		if (StatPanel.Clear.equals("Clear"))
		{
			Draw.Clear();
			setBackground(Color.black);
			setBackground(StatPanel.TypeColour);
			StatPanel.Clear = "";
		}
		
		Draw.RePaint(g);
		
	}
	
	
	public void Draw(int X1, int Y1, int X2, int Y2)
	{
		Draw.DrawShape(new Shape(StatPanel.getShape(), StatPanel.TypeColour, X1, Y1, X2, Y2));
		repaint();
	}
	
	
	
}
