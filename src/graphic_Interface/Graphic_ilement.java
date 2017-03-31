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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import workBrunch.CodeAlfavit;
import workBrunch.Codirovanie;
import workBrunch.Rascodirovanie;
import workBrunch.RusAlfavit;

public class Graphic_ilement extends JFrame { 
	
	private JPanel buttonPanel;
	private static final int DEFAUL_WIDTH = 600;
	private static final int DEFAUL_HEIGHT = 270;
	int x;
	int y;
	private String[] var_coda = { "abcd","Ieroglif"};
	public static String name_code;
	private String text;
	boolean metka_code;
	JButton button_action;
	JTextArea textFieldRus;
	JComboBox comboBox;
	private JCheckBox checkbox;
	
	 public void setCheckbox(boolean is_selected) {
		this.checkbox.setSelected(is_selected);
	}

	public JCheckBox getCheckbox() {
		return checkbox;
	}

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
		 x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
		 y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
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
		
	    checkbox = new JCheckBox("Цифры");
	    checkbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			CodeAlfavit.is_select = checkbox.isSelected();
			RusAlfavit.is_select = checkbox.isSelected();
			Codirovanie.is_select = checkbox.isSelected();
			System.out.println("Graphic_inter = "+checkbox.isSelected());
				
			}
		});
		checkbox.setBounds(450, 65, 150, 30);
		buttonPanel.add(checkbox);
		
	    comboBox = new JComboBox(var_coda);
		comboBox.setBounds(450, 115, 135,30);
		buttonPanel.add(comboBox);
		
		
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
		
	
	
		
		radiob1.setBounds(450, 150, 150, 30);
		radiob2.setBounds(450, 170, 150, 30);
		button_group.add(radiob1);
		button_group.add(radiob2);
		buttonPanel.add(radiob1);
		buttonPanel.add(radiob2);
		
		
		add(buttonPanel);
	
	
	}
	
	
	class Listener_codirovanie implements ActionListener {
	

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 name_code = (String) comboBox.getSelectedItem();
			 System.out.println(name_code);
			 Warning.setLoc_frame(Graphic_ilement.this.getLocation());// установка расположения окна для warning
			 Codirovanie codirovanie = new Codirovanie(Graphic_ilement.this);
			 char[] str = codirovanie.codirovanie_met(textFieldRus.getText());
	       
			 String stroka = String.valueOf(str);
			 textFieldCode.setText(stroka);
			
			
		}

	}
	class Listener_rascodirovanie implements ActionListener {
	

		
		@Override
		public void actionPerformed(ActionEvent e) {
			 name_code = (String) comboBox.getSelectedItem();
			 System.out.println(name_code);
			 Rascodirovanie rascodirovanie = new Rascodirovanie();
			 char[] decor_char = rascodirovanie.rascodir_met(textFieldRus.getText());
			 String decor_string = String.valueOf(decor_char);
			 textFieldCode.setText(decor_string);
	
  }
	    }
	class Listener_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

}
