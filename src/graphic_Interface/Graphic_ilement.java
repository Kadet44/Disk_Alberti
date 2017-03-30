package graphic_Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import workBrunch.Codirovanie;
import workBrunch.Rascodirovanie;
import workBrunch.RusAlfavit;

public class Graphic_ilement extends JFrame { 
	
	private JPanel buttonPanel;
	private static final int DEFAUL_WIDTH = 600;
	private static final int DEFAUL_HEIGHT = 270;
	private String text;
	boolean metka_code;
	 JButton button_action;
	 JTextArea textFieldRus;
	 public JRadioButton getRadiob1() {
		return radiob1;
	}

	public void setRadiob1(JRadioButton radiob1) {
		this.radiob1 = radiob1;
	}

	public JRadioButton getRadiob2() {
		return radiob2;
	}

	public void setRadiob2(JRadioButton radiob2) {
		this.radiob2 = radiob2;
	}

	JRadioButton radiob1;
	JRadioButton radiob2;
	
	public String getTextFieldRus() {
		return textFieldRus.getText();
	}

	public JTextArea getTextFieldCode() {
		return textFieldCode;
	}

	private JTextArea textFieldCode;
	
	public JButton getButton_action() {
		return button_action;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Graphic_ilement(String button_text,boolean metka_code) {
		this.metka_code = metka_code;
		setSize(DEFAUL_WIDTH, DEFAUL_HEIGHT);
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
		int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
		this.setBounds(x, y, this.getWidth(), this.getHeight());
		setResizable(false);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		
	    textFieldRus = new JTextArea();
		textFieldCode  = new JTextArea();
		
		JScrollPane scroll_rus = new JScrollPane(textFieldRus);
		JScrollPane scroll_code = new JScrollPane(textFieldCode);
		
		scroll_rus.setBounds(15, 25, 420, 80);
		scroll_code.setBounds(15, 120, 420, 80);
		
	
		buttonPanel.add(scroll_rus );
		buttonPanel.add(scroll_code);
			
		button_action = new JButton(button_text);
		 radiob1 = new JRadioButton("Закодировать");
		 radiob2 = new JRadioButton("Декодировать");
		button_action.setBounds(450, 28, 120, 35);
		
		ButtonGroup button_group = new ButtonGroup();
		if (this.metka_code){
			button_action.addActionListener(new Listener_codirovanie());
			radiob1.setSelected(true);
		
		}
		else{
			radiob2.setSelected(true);
			button_action.addActionListener(new Listener_rascodirovanie());
		}
		buttonPanel.add(button_action);
		
	
		
		
		
		radiob1.setBounds(450, 120, 150, 30);
		radiob2.setBounds(450, 150, 150, 30);
		button_group.add(radiob1);
		button_group.add(radiob2);
		buttonPanel.add(radiob1);
		buttonPanel.add(radiob2);
		
		
		add(buttonPanel);
	
	
	}
	
	
	class Listener_codirovanie implements ActionListener {
	

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 Codirovanie codirovanie = new Codirovanie();
			 char[] str = codirovanie.codirovanie_met(textFieldRus.getText());
	       
			 String stroka = String.valueOf(str);
			 textFieldCode.setText(stroka);
			// TODO Auto-generated method stub
			
		}

	}
	class Listener_rascodirovanie implements ActionListener {
	

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 Rascodirovanie rascodirovanie = new Rascodirovanie();
			 char[] decor_char = rascodirovanie.rascodir_met(textFieldRus.getText());
			 String decor_string = String.valueOf(decor_char);
			 textFieldCode.setText(decor_string);
	
  }
	    }
	class Listener_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
