package paint.PaintAssignment;



import java.awt.BorderLayout;

import javax.swing.*;


public class MenuFrame extends Frame {

	//private JMenuItem MainMenu;
	JMenuBar MenuBar;
	JMenu Menu1;
	JMenu Menu2;
	JMenu Menu3;
	JMenuItem[] MenuItems1;
	JMenuItem[] MenuItems2;
	JMenuItem[] MenuItems3;
	MenuListener Actions;
	GraphicsPanel Panel;
	
	InputListener MouseWork;
	Status status;
	int MenuCount = 0;
	int ItemCount = 0;
	
	public MenuFrame(){
		MenuBar = new JMenuBar();
		//Menus = new JMenu[8];
		MenuItems1 = new JMenuItem[10];
		MenuItems2 = new JMenuItem[10];
		MenuItems3 = new JMenuItem[10];
		
		
		
	    this.setJMenuBar(MenuBar);
		Menu1 = new JMenu("Shape");
		Menu2 = new JMenu("Colour");
		Menu3 = new JMenu("Options");
		MenuItems1[0] =  new JMenuItem("Pencil");
		MenuItems1[1] =  new JMenuItem("Line");
		MenuItems1[2] =  new JMenuItem("Rectangle");
		MenuItems1[3] =  new JMenuItem("Filled Rectangle");
		MenuItems1[4] =  new JMenuItem("Circle");
		MenuItems1[5] =  new JMenuItem("Filled Circle");
		
		MenuItems2[0] =  new JMenuItem("Black");
		MenuItems2[1] =  new JMenuItem("White");
		MenuItems2[2] =  new JMenuItem("Red");
		MenuItems2[3] =  new JMenuItem("Blue");
		MenuItems2[4] =  new JMenuItem("Green");
		MenuItems2[5] =  new JMenuItem("Purple");
		MenuItems2[6] =  new JMenuItem("Pink");
		MenuItems2[7] =  new JMenuItem("Orange");
		MenuItems2[8] =  new JMenuItem("Yellow");
		
		MenuItems2[9] =  new JMenuItem("Fill With Selected Colour");
		
		
		
		MenuBar.add(Menu1);
		MenuBar.add(Menu2);
		
	    
	    
	    
	    
		status = new Status();
		status.setShape("Pencil");
		status.setColour("Black");
		Panel = new GraphicsPanel(status);
		Actions = new MenuListener(this, status);
		
		MouseWork = new InputListener(Panel, status);
		Panel.addMouseListener(MouseWork);
		Panel.addMouseMotionListener(MouseWork);
		
		for (int i =0; i <6 ; i++)
		{
			Menu1.add(MenuItems1[i]);
			MenuItems1[i].addActionListener(Actions);		
		}
		
		for (int i =0; i <9 ; i++)
		{
			Menu2.add(MenuItems2[i]);
			MenuItems2[i].addActionListener(Actions);
		}
		
		Menu2.addSeparator();
		Menu2.add(MenuItems2[9]);
		MenuItems2[9].addActionListener(Actions);
		
		
	    this.getContentPane().add(Panel,BorderLayout.CENTER);
	    this.getContentPane().add(status,BorderLayout.SOUTH);
	    
	}
	
	
	
	
	
}
