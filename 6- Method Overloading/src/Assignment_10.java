
public class Assignment_10 {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
	public static void printYearsAndDays(long min) {
		if(min<0) {
			System.out.println("Invalid value");
		}else {
			long hour=min/60;
			long day=hour/24;
			long year=day/365;
			day=day%365;
			
			System.out.println(min+" min = "+year+" y and "+day+" d.");
				
		}
	}

}
