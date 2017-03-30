package workBrunch;

public class Codirovanie {
	public Codirovanie(){}
	
	public Codirovanie(String codeString) {
		codirovanie_met(codeString);
	}
		public char[] codirovanie_met(String text){
		RusAlfavit rusAlfavit = new RusAlfavit();
		char[] rus = rusAlfavit.getRusAlfavit();
		CodeAlfavit codeAlfavit = new CodeAlfavit();
		char[] code = codeAlfavit.getCodeAlfavit();
		
	
		text = text.toLowerCase();	
		char[] ArrayTexst = text.toCharArray();
		char[] codeText = new char[ArrayTexst.length];// переменная для закодированной строки 
		
		//System.out.println(ArrayTexst.length);
		
//		System.out.println(ArrayTexst[5]);
		
		for (int i= 0; i< ArrayTexst.length; i++ ){
			
			if(ArrayTexst[i]== ' '){
				Sdvig.sdvig ++;
				code = Sdvig.sootvet(rus,code);
				codeText[i] = ' ';
			}
			
		
			
			else{
			
			     for (int j= 0; j<rus.length; j++){
			    	  
			         if (ArrayTexst[i] == rus[j]){
				     //CodeTexst[i] = codeAlfavit.sootv(j,sdvig);
			           codeText[i] = code[j];
				
			         }
		
		         } 
			 }
		}
		System.out.println(codeText);
		return codeText;
	}

}
