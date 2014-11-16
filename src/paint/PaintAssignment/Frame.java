package paint.PaintAssignment;

import javax.swing.JFrame;


public class Frame extends JFrame {

	
	public Frame()
	{
		this.setSize(200,200);
	    this.setLocation(200,200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public Frame(int SizeX, int SizeY, int LocX, int LocY, boolean Visible, String Title)
	  {
	     this.setSize(SizeX,SizeY);
	     this.setLocation(LocX,LocY);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setVisible(Visible);
	     this.setTitle(Title);
	  }

	  public void Title(String Text){
		 this.setTitle(Text);
	  }
	  
	  public void Size(int X, int Y)
	  {
		  this.setSize(X,Y);
	  }
	  
	  public void Location(int X, int Y){
		  this.setLocation(X, Y);
	  }
	
	  public void Show(){
	    this.setVisible(true);
	    
	  }

	  public void Hide(){
	    this.setVisible(false);
	  }
	
	
}
