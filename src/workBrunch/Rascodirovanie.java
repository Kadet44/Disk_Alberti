package workBrunch;

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
		CodeAlfavit codeAlfavit = new CodeAlfavit();
		char[] codeAlfavitChar = codeAlfavit.getCodeAlfavit();
		char[] rusText = new char[codeChar.length];
		
		
			for (int i= 0; i< codeChar.length; i++ ){
			
				if(codeChar[i]== ' '){
				Sdvig.sdvig ++;
				codeAlfavitChar = Sdvig.sootvet(rus,codeAlfavitChar);
			/*	System.out.println("-----------------");
				System.out.println(text);
				System.out.println(rus);
				System.out.println(code);
				
				System.out.println("");
				
			    System.out.println("Сдвиг +1");*/
			}
			
		
			
			else{
			
			     for (int j= 0; j<codeAlfavitChar.length; j++){
			    	  
			         if (codeChar[i] == codeAlfavitChar[j]){
				     //CodeTexst[i] = codeAlfavit.sootv(j,sdvig);
			           rusText[i] = rus[j];
				
			         }
		
		         } 
			 }
		}
			System.out.println(rusText);
		return(rusText);
		
		// TODO Auto-generated constructor stub
	}

}
