package workBrunch;

import graphic_Interface.Graphic_ilement;

public class Rascodirovanie {
	public Rascodirovanie(){}
	
	public Rascodirovanie(RusAlfavit rus,String codeString) {
		rascodir_met(codeString);
	}
	  public char[] rascodir_met(String codeString){
		RusAlfavit rusAlfavit = new RusAlfavit();
	    codeString = codeString.toLowerCase();
		char[] codeChar = codeString.toCharArray();
		char[] rus = rusAlfavit.getRusAlfavit();
		CodeAlfavit codeAlfavit = new CodeAlfavit(Graphic_ilement.name_code);
		char[] codeAlfavitChar = codeAlfavit.getCodeAlfavit();
		char[] rusText = new char[codeChar.length];
		
		
			for (int i= 0; i< codeChar.length; i++ ){
			
				if(codeChar[i]== ' '){
				Sdvig.sdvig ++;
				codeAlfavitChar = Sdvig.sootvet(rus,codeAlfavitChar);
		
			}
			
		
			
			else{
			
			     for (int j= 0; j<codeAlfavitChar.length; j++){
			    	  
			         if (codeChar[i] == codeAlfavitChar[j]){
				
			           rusText[i] = rus[j];
				
			         }
		
		         } 
			 }
		}
			System.out.println(rusText);
		return(rusText);
		
	
	}

}
