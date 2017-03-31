package graphic_Interface;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


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

public Warning(Graphic_ilement codirovanie) {
	   codirovanie.setEnabled(false);
	   JFrame warning_frame = new JFrame("Внимание!!!");
		warning_frame.setSize(300, 150);
		warning_frame.setLocation(x+150, y+50);
		warning_frame.setResizable(false);
		//warning_frame.setLocation(loc_frame);
		warning_frame.setVisible(true);
		
		JPanel panel_warning = new JPanel();
		panel_warning.setLayout(null);
		JButton button_warning = new JButton("OK");
		button_warning.setBounds(110,80, 85, 30);
		button_warning.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				codirovanie.setEnabled(true);
				warning_frame.dispose();
				//warning_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		panel_warning.add(button_warning);
		warning_frame.add(panel_warning);
		
}
}
