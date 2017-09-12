package random;

public class all_dates_of_year {
	
	public static void print_all(int yr){
		boolean Lp_yr = ( yr%400 == 0 ||( yr%4 == 0 && yr%100 != 0 ))?true:false;
		
		for ( int month = 1; month <= 12 ; month++){
			for(int date = 1; date<=31;date++){
				if (date>28 && month==2 && !Lp_yr || date >29 && month==2 && Lp_yr){
					break;
				}
				if (date > 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
					break;
				}
				System.out.println(yr + "-" + month + "-" + date);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_all(2017);

	}

}
