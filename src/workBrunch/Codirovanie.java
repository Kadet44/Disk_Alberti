package workBrunch;

import graphic_Interface.Graphic_ilement;

public class Codirovanie {
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
		

		
		for (int i= 0; i< ArrayTexst.length; i++ ){
			
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
