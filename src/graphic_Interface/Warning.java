package graphic_Interface;

import java.awt.Point;

import javax.swing.JFrame;


public class Warning {
  static Point loc_frame;
  private int x  = (int) loc_frame.getX();
  private int y = (int) loc_frame.getY();



public static Point getLoc_frame() {
	return loc_frame;
}




public static void setLoc_frame(Point loc_frame) {
	Warning.loc_frame = loc_frame;
	
}

public Warning() {
	  JFrame warning_frame = new JFrame("Внимание!!!");
		warning_frame.setSize(300, 150);
		warning_frame.setLocation(x+150, y+50);
		//warning_frame.setLocation(loc_frame);
		warning_frame.setVisible(true);
}
}
