PaintApp
========

Paint Assignment Made with Java Swing

Paint Assignment
The PaintAssignment GUI program is a paint program with mouse functionality of point, click and drag to draw a picture. The program has the ability to allow the user to draw using different shapes (Pencil, Line, Rectangle, Filled Rectangle, Circle, Filled Circle) and use various colours to draw these shapes (Black, White, Red, Green, Blue, Purple, Pink, Orange, Yellow). A user can also chose to clear the screen with a chosen colour.

Features
On selecting the application, a blank white canvas screen is displayed with default pencil shape selected and default black colour selected; (Fig 1.)
 
![Alt text](https://raw.githubusercontent.com/andydaly/PaintApp/master/Pics/screen1.png)

To change to a different shape, select Shape menu tab and chose desired shape to draw with; (Fig 2.)
 
![Alt text](https://raw.githubusercontent.com/andydaly/PaintApp/master/Pics/screen8.png)


To change to a different colour other than default black, select Colour menu tab and chose desired colour, this tab also provides the option to clear the screen with the current selected colour; (Fig. 3)

![Alt text](https://raw.githubusercontent.com/andydaly/PaintApp/master/Pics/screen9.png) 

Any shape selected from the shape menu tab can be drawn onto the canvas; (Fig 4. With Rectangle drawn)
 
![Alt text](https://raw.githubusercontent.com/andydaly/PaintApp/master/Pics/screen4.png)

Additional option, Right-clicking displays help options.

Classes:

- Frame.java; Typical Simple frame class, extends JFrame, used for applications frame can use methods to change frame size, frame location, bool if frame hidden etc.

- GraphicsPanel.java; Graphics Panel class extends JPanel, used for the panel in which the drawable graphics are to be displayed. Uses a Draw method to be called by InputListener class which takes input of coordinates X1 and Y1 for simple first coordinate and X2 and Y2 for the end of a drag coordinate.

- InputListener.java; InputListener is the mouse listener class which extends MouseListener and MotionMouseListener, this class is for mouse options such as drawing the shapes and doing dragging to display certain shapes, also updates status panel to show current mouse coordinates.

- Interaction.java; Interaction class is for holding all currently drawn graphics on screen.

- MainDriver.java; This holds the main method.

- MenuFrame.java; This is main class called from main method, it extends Frame.java class, holds all other classes and used for the creation of the menus and menu items.

- MenuListener.java; Extends ActionListener, this is the menu action listener class and implements for whatever is selected in the menu items, uses the status panel to implement actions.

- Shape.java; This class for drawing all shapes, it takes in the coordinates from the inputlistener and the current shape from the status panel and draws the shape.
 
- Status.java; Extends JPanel, this is the status panel which displays information on what shape is selected, what colour is selected, and current cursor coordinates. 
