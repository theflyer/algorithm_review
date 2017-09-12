package random;

public class seed {
	
	public static int dig_prod(int x){
		if (x < 10){
			return x;
		}
		int prod = (x%10)*dig_prod(x/10);
		
		return prod;
		
	}
	
	public static void find_seed(int x){
		int n = x/2;
		int m ;
		for (int i = 0 ; i  < n; i++){
			m = i * dig_prod(i);
			if (m == x){
				System.out.println(i);
			}
			
			
		}
		System.out.println("done");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		find_seed(1716);

	}

}
