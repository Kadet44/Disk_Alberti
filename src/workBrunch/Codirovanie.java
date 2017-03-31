package workBrunch;

import javax.swing.JFrame;

import graphic_Interface.Graphic_ilement;
import graphic_Interface.Warning;

public class Codirovanie {
	public static boolean is_select;
	public Codirovanie(){}
	
	public Codirovanie(String codeString) {
		codirovanie_met(codeString);
	}
		public char[] codirovanie_met(String text){
		RusAlfavit rusAlfavit = new RusAlfavit();
		char[] rus = rusAlfavit.getRusAlfavit();
		CodeAlfavit codeAlfavit = new CodeAlfavit(Graphic_ilement.name_code);
		char[] code = codeAlfavit.getCodeAlfavit();
		
	
		text = text.toLowerCase();	
		char[] ArrayTexst = text.toCharArray();
		char[] codeText = new char[ArrayTexst.length];// переменная для закодированной строки 
		

		char[] mas_char_figure ={'0','1','2','3','4','5','6','7','8','9'};
		
		for (int i= 0; i< ArrayTexst.length; i++){
			
			if(!is_select){
					for(char a: mas_char_figure){
							if(ArrayTexst[i] == a){
							System.out.println("A Я нашел цифру");
							Warning warning = new Warning();
						    }
					}
			}
			
			if(ArrayTexst[i]== ' '){
				Sdvig.sdvig ++;
				code = Sdvig.sootvet(rus,code);
				codeText[i] = ' ';
			}
			
			
		
			
			else{
			
			     for (int j= 0; j<rus.length; j++){
			    	  
			         if (ArrayTexst[i] == rus[j]){
				   
			           codeText[i] = code[j];
				
			         }
		
		         } 
			 }
		}
		System.out.println(codeText);
		return codeText;
	}

}
