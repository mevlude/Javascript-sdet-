
public class Task1 {

	public static void main(String[] args) {
		double d1=20d;
		double d2=80d;
		
		double res1 = (d1+d2)*25;
		double res2 = res1%40;
		
		boolean res3 = res2<=20;
		System.out.println(res3);
		System.out.println("remainder is "+res2);
	}

}
