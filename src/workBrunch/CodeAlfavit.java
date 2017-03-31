package workBrunch;

public class CodeAlfavit {
	private final int MAX_SDVIG = 32;
	private int n =0;
	private int I_n =0;
	private int n1=26;
	private char[] codeAlfavit; 
	public static boolean is_select;
	public char[] getCodeAlfavit() {
		return codeAlfavit;
	}


	private char[] codeAlfavitSdvig;
	
	public char getCodeAlfavitSdvig(int i) {
		return codeAlfavitSdvig[i];
	}

	public CodeAlfavit(String name_Code) {
		System.out.println("Code_alfasbit is selected = " + is_select);
		
		 if (name_Code == "abcd"){
				if(is_select){this.formCodeLat_figure();}
				else{this.formCodeLat();}
		 }
		
		 if (name_Code == "Ieroglif"){  
		 		if(is_select){this.formCodeIerog_figure();}
				else{this.formCodeIerog();}
		 }
	}
		
	
	
	private void formCodeLat_figure(){
		codeAlfavit = new char[43];
		char[] code_Lat ={'v','w','1','x','m','t','u','z','y','2','3','n','o','p','l','s','q','r','4','i','c','j','d','e','k','a','g','f','b','h','5','6','ʚ','ʛ','ʜ','ʝ','ʞ','ʠ','ʢ','ɕ','ȸ','ǂ'};
		for(char i:code_Lat)		
	    {
			//System.out.print(i);
			codeAlfavit[n]=i;
		n++;
	    }
		
	}
	
	private void formCodeIerog_figure(){
		codeAlfavit = new char[43];
		char[] code_Ierog = {'ʚ','ʛ','5','ʜ','ʝ','9','ʞ','0','ʠ','ʢ','3','ɕ','ȸ','1','ǂ','ƴ','2','×','ɣ','ɪ','ɫ',7,'¥','4','ʌ','ʍ','ʀ','ɯ','ɱ','ʆ','ʉ','ʐ','6','ʔ','ʘ','ȴ','ƙ','ǯ','ȱ','ȓ','8','ȍ'};
		for (char a: code_Ierog){
			codeAlfavit[I_n] = a;
			I_n++;
		}
		
	}
	
	private void formCodeIerog(){
		codeAlfavit = new char[33];
		char[] code_Ierog = {'ʚ','ʛ','ʜ','ʝ','ʞ','ʠ','ʢ','ɕ','ȸ','ǂ','ƴ','×','ɣ','ɪ','ɫ','¥','ʌ','ʍ','ʀ','ɯ','ɱ','ʆ','ʉ','ʐ','ʔ','ʘ','ȴ','ƙ','ǯ','ȱ','ȓ','ȍ'};
		for (char a: code_Ierog){
			codeAlfavit[I_n] = a;
			I_n++;
		}
	}
	
	private void formCodeLat(){ //Генерация начального кодирующего алф. сделать не по порядку алфавита 
		codeAlfavit = new char[33];
		char[] code_Lat ={'v','w','1','x','m','t','u','z','y','2','3','n','o','p','l','s','q','r','4','i','c','j','d','e','k','a','g','f','b','h','5','6'};
		for(char i:code_Lat)		
	    {
			//System.out.print(i);
			codeAlfavit[n]=i;
		n++;
	    }
        /*
		for (char i= 'а';i<= 'е';i++){
			
			codeAlfavit[n1] = i;
			n1++;
		}
		*/
	
		}

	
	
	

}
