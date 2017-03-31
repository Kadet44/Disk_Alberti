package graphic_Interface;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	    warning_frame.addWindowListener(new WindowAdapter() {
	    	@Override
	    	public void windowClosing(WindowEvent e) {
	    		codirovanie.setEnabled(true);
	     		super.windowClosing(e);
	    	}
		});
		warning_frame.setSize(300, 150);
		warning_frame.setLocation(x+150, y+50);
		warning_frame.setResizable(false);
		warning_frame.setVisible(true);
		
		JLabel lebel = new JLabel("Включите цифры!");
		lebel.setBounds(73, 25, 200, 40);
		lebel.setFont(new Font("Verdana", Font.BOLD, 16));
		
		
		JPanel panel_warning = new JPanel();
		panel_warning.setLayout(null);
		JButton button_warning = new JButton("OK");
		button_warning.setBounds(110,80, 85, 30);
		button_warning.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				codirovanie.setEnabled(true);
				warning_frame.dispose();
			
				
			}
		});
		panel_warning.add(lebel);
		panel_warning.add(button_warning);
		warning_frame.add(panel_warning);
		
}
}
