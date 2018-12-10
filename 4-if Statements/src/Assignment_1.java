
public class Assignment_1 {

	public static void main(String[] args) {

		int income=120_000_000;
		double taxRatio;
		double tax = 0;
		
		if(income<=150_000_000) {
			taxRatio=0.25;
			tax=income*taxRatio;
		}else if(income<=300_000_000) {
			taxRatio=0.30;
			tax=income*taxRatio;
		}else if(income<=600_000_000) {
			taxRatio=0.35;
			tax=income*taxRatio;
		}else if(income<=1_200_000_000) {
			taxRatio=0.40;
			tax=income*taxRatio;
		}else if(income>1_200_000_000) {
			taxRatio=0.50;
			tax=income*taxRatio;
		}
		
		System.out.println("For "+income+" $ salary, the tax amount is "+tax+" $.");
	}

}
