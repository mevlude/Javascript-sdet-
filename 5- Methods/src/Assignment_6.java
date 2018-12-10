
public class Assignment_6 {

	public static void main(String[] args) {
		hasEqualSum(1, 1, 1);
		hasEqualSum(1, 1, 2);
		hasEqualSum(1, -1, 0);
	}
	
	public static boolean hasEqualSum(int num1,int num2,int num3) {
		if(num3==num1+num2) {
			System.out.println(true);
			return true;
		}else {
			System.out.println(false);
			return false;
		}
	}

}
