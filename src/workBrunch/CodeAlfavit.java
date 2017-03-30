package workBrunch;

public class CodeAlfavit {
	private final int MAX_SDVIG = 32;
	private int n =0;
	private int I_n =0;
	private int n1=26;
	private char[] codeAlfavit; 
	
	public char[] getCodeAlfavit() {
		return codeAlfavit;
	}


	private char[] codeAlfavitSdvig;
	
	public char getCodeAlfavitSdvig(int i) {
		return codeAlfavitSdvig[i];
	}

	public CodeAlfavit(String name_Code) {
		
		if (name_Code == "abcd"){this.formCodeLat(); }
		if (name_Code == "Ieroglif"){  this.formCodeIerog(); 	}
		
	
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
