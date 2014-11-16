package paint.PaintAssignment;

import java.awt.*;
import java.awt.Window;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {

	private MenuFrame Component;
	Status StatPanel;

	public MenuListener(MenuFrame Comp, Status s) {
	    Component = Comp;
	    StatPanel = s;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		String actionCommand = evt.getActionCommand();
		if(actionCommand.equals("Pencil")){
		    StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Line")){
			StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Rectangle")){
			StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Filled Rectangle")){
			StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Circle")){
			StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Filled Circle")){
			StatPanel.setShape(actionCommand);
		    }
		else if (actionCommand.equals("Fill With Selected Colour")){
			StatPanel.Clear = "Clear";
	    }
		
		
		if(actionCommand.equals("Black")){
		    StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("White")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Red")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Blue")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Green")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Purple")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Pink")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Orange")){
			StatPanel.setColour(actionCommand);
		    }
		else if (actionCommand.equals("Yellow")){
			StatPanel.setColour(actionCommand);
		    }
		
	}
	
}
