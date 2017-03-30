package graphic_Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {
	
	static Graphic_ilement codirovanie;
	static Graphic_ilement Rascodirovanie;
	
	public static void main(String[] args) {
		
	
	codirovanie = new Graphic_ilement("Кодировать",true);
    Rascodirovanie = new Graphic_ilement("Декодировать",false);
  
    codirovanie.setVisible(true);
    
    JRadioButton radiob2_cod = codirovanie.getRadiob2();
    JRadioButton radiob2_decod = Rascodirovanie.getRadiob2();
	JRadioButton radiob1_cod = codirovanie.getRadiob1();
	JRadioButton radiob1_decod = Rascodirovanie.getRadiob1();
	radiob1_cod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  if(radiob1_cod.isSelected()) 
			  
			  Rascodirovanie.setVisible(false);
			  System.out.println("radiob1_cod");
			}
		});
		
	
	radiob2_cod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				codirovanie.setVisible(false);
				Rascodirovanie.setVisible(true);
				radiob2_decod.setSelected(true);

		    	System.out.println("radiob2_cod");
				
				
				
				
			}
		});
		
	
	radiob1_decod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  if(radiob1_decod.isSelected()) 
			  codirovanie.setVisible(true);
			  Rascodirovanie.setVisible(false);
			  radiob1_cod.setSelected(true);
			  System.out.println("radiob1_decod");
			}
		});
		
		
	radiob2_decod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Rascodirovanie.setVisible(true);
				codirovanie.setVisible(false);
				
				System.out.println("radiob2_decod");
				
			}
		});
		
		
		

	codirovanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Rascodirovanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}