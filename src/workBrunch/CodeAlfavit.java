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

	public CodeAlfavit() {
		this.formCode();
	
	}
	
	private void formCode(){ //Генерация начального кодирующего алф. сделать не по порядку алфавита 
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
