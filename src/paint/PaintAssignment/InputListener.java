package paint.PaintAssignment;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class InputListener implements MouseListener, MouseMotionListener {

	private GraphicsPanel Panel;
	private Status status;
	public boolean Dragging;
	int StartX, StartY;
	Frame Information;
	
	public InputListener(GraphicsPanel GP, Status s)
	{
		Panel = GP;
		status = s;
	}
	  
	@Override
	public void mousePressed(MouseEvent e) {
		
		if (!Dragging)
		{
			StartX = e.getX();
			StartY = e.getY();
			Dragging = true;
		}
		
		if(SwingUtilities.isRightMouseButton(e)) //left mouse button
	    {
			JFrame frame = new JFrame("Help");
			JOptionPane.showMessageDialog(frame, "<html>Drawing Shapes are included in Shape Menu Tab.<br>" +
					"Colour options are included in Colour Menu Tab.<br>" +
					"To Clear Screen, select 'Fill With Selected Colour' in Colour Menu Tab.</html>");
					
					
			
	    }
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (Dragging)
		{
			if(SwingUtilities.isLeftMouseButton(e)) //left mouse button
		    {
				
		    
				if (status.getShape().equals("Pencil"))
				{
					Panel.Draw(e.getX(),e.getY(), e.getX(),e.getY());
				}
				Panel.Draw(StartX, StartY, e.getX(),e.getY());
			
				Dragging = false;
		    }
		}
		
	}
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		
		if (Dragging)
		{
			if(SwingUtilities.isLeftMouseButton(e)) //left mouse button
		    {
				if (status.getShape().equals("Pencil"))
				{
					Panel.Draw(e.getX(),e.getY(), e.getX(),e.getY());
				}
		    }
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		status.Position(e.getX(), e.getY());
		
	}
	  
	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mouseClicked(MouseEvent arg0) {}
	
}
