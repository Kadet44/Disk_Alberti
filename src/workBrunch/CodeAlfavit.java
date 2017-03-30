package workBrunch;

public class CodeAlfavit {
	private final int MAX_SDVIG = 32;
	private int n =0;
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
		/*switch (name_Code){
		
		case "abcd": this.formCodeLat();
		case "ʚʛʍʞ": this.formCodeIerog();
		}	*/
		formCodeIerog();
	
	}
	
	private void formCodeIerog(){
		codeAlfavit = new char[33];
		char[] code_Ierog = {'ʚ','ʛ','ʜ','ʝ','ʞ','ʠ','ʢ','ɕ','ȸ','ǂ','ƴ','×','ɣ','ɪ','ɫ','¥','ʌ','ʍ','ʀ','ɯ','ɱ','ʆ','ʉ','ʐ','ʔ','ʘ','ȴ','ƙ','ǯ','ȱ','ȓ','ȍ'};
		for (char a: code_Ierog){
			codeAlfavit[n] = a;
			n++;
		}
	}
	
	private void formCodeLat(){ //Генерация начального кодирующего алф. сделать не по порядку алфавита 
		codeAlfavit = new char[33];
		for(char i = 'a';i<='z';i++)
	    {
			codeAlfavit[n]=i;
		n++;
          
        }
		for (char i= 'а';i<= 'е';i++){
			
			codeAlfavit[n1] = i;
			n1++;
		}
	
		}

	
	
	

}
