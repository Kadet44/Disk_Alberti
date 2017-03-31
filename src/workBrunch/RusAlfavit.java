package workBrunch;

public class RusAlfavit {
    private int n =0;
    private int n_figure =0;
	private char[] rusAlfavit;
	public static boolean is_select;
    public RusAlfavit() {
    	System.out.println("RusAlf =" + is_select);
		
	rusAlfavit = new char[43];
	 char[] rus_char_figure ={'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р',
			 'с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я',
			 '0','1','2','3','4','5','6','7','8','9'};
	 
	 
	 char[] rus_char ={'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р',
			 'с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
	 
		for(char i:rus_char_figure){
			rusAlfavit[n]=i;
			n++;
	           
	        }
	
		System.out.println(rusAlfavit);
	}
    public char[] getRusAlfavit(){
    	return rusAlfavit;
    }
    public void printAlfavit(){
    	System.out.println(rusAlfavit);
    }
}
