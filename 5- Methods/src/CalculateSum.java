
public class CalculateSum {

	public static void main(String[] args) {
		calculateSum(5, 8);
		System.out.println(calculateSum2(7,9));

	}
	
	public static void calculateSum(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static int calculateSum2(int x, int y) {
		
		int sum=x+y;
		return sum;
		
	}
	
}
