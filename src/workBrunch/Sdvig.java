package workBrunch;

public class Sdvig {
	static int sdvig= 0 ;


	public static char[] sootvet(char[] rus, char[] code) {
		final int SDVIG_CONST = 1;
		 
	 if (sdvig == 33){sdvig =0;}
		char[] codeNew = code.clone();
		for (int i = 0; i < rus.length-1;i++){
		codeNew[i+SDVIG_CONST]=code[i];
			
		}
						
	  codeNew[0] = code[code.length-2];
	  codeNew[rus.length-1] = ' ';
				
		System.out.println(sdvig);
	  return codeNew;
		
	}
	
	  
   

}
