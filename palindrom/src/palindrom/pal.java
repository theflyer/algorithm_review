package palindrom;

public class pal {
	
	public static void pal (String s){
		String p ="";
		for (int i = s.length()-1; i>=0; --i){
			p += s.charAt(i);
		}
		
		if (s.equals(p) && s.length()>=3){
			System.out.println(s);
		}
		

	
	}
	
   public static void find_pal(String s){
	   String x= "";
	   for(int i = 0 ; i < s.length() ; i ++){
		   //String x= "";
		   x+= s.substring(i, i+1);
		   //System.out.println(x);
		   pal(x);  
	   }
   }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cabbaabbacasdasdsdsdsdassadsadasdasadsadasda";
		find_pal(s);
		
		

	}

}
