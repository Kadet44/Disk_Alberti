package workBrunch;

public class RusAlfavit {
    private int n =0;
	private char[] rusAlfavit;
    public RusAlfavit() {
		
	rusAlfavit = new char[33];
	 
		for(char i = 'а';i<='я';i++)
		    {
			rusAlfavit[n]=i;
			n++;
	           
	        }
	}
    public char[] getRusAlfavit(){
    	return rusAlfavit;
    }
    public void printAlfavit(){
    	System.out.println(rusAlfavit);
    }
}
