package paint.PaintAssignment;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Status extends JPanel {

	
	private JLabel Shape = new JLabel("");
	private JLabel Colour = new JLabel("");
	private JLabel XPos     = new JLabel("0", JLabel.RIGHT);
	private JLabel YPos     = new JLabel("0", JLabel.RIGHT);
	private String ShapeType;
	private String ColourType;
	public String Clear = "";
	public String Fill = "";
	public Color TypeColour;
	
	public Status()
	{
		this.setLayout(new GridLayout(1,4));
		this.add(Shape);
		this.add(Colour);
	    this.add(XPos);
	    this.add(YPos);
	    
		
	}
	
	public void setShape(String Type)
	{
		ShapeType = Type;
		Shape.setText(ShapeType);
	}
	
	public String getShape()
	{
		return ShapeType;
	}
	
	public void setColour(String Type)
	{
		ColourType = Type;
		Colour.setText(ColourType);
		if (ColourType.equals("Black"))
			TypeColour = Color.black;
		else if (ColourType.equals("White"))
			TypeColour = Color.white;
		else if (ColourType.equals("Red"))
			TypeColour = Color.red;
		else if (ColourType.equals("Blue"))
			TypeColour = Color.blue;
		else if (ColourType.equals("Green"))
			TypeColour = Color.green;
		else if (ColourType.equals("Purple"))
			TypeColour = Color.magenta;
		else if (ColourType.equals("Pink"))
			TypeColour = Color.pink;
		else if (ColourType.equals("Orange"))
			TypeColour = Color.orange;
		else if (ColourType.equals("Yellow"))
			TypeColour = Color.yellow;
		
		
		
	}
	
	public String getColour()
	{
		return ColourType;
	}
	
	
	
	public void Position(int X, int Y){
	    XPos.setText("X: "+X);
	    YPos.setText("Y: "+Y);
	}
	
	
}
