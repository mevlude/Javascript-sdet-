
public class Assignment_7 {

	public static void main(String[] args) {
		hasTeen(9,99,19);
		hasTeen(23,15,42);
		hasTeen(22,23,34);
	}

	public static boolean hasTeen(int age1,int age2,int age3) {
		if((age1>=13&&age1<=19)||(age2>=13&&age2<=19)||(age3>=13&&age3<=19)) {
			System.out.println(true);
			return true;
		}else {
			System.out.println(false);
			return false;
		}
		
	}

}
