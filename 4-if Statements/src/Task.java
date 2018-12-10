
public class Task {

	public static void main(String[] args) {
		
		byte marks=95;
		if(marks<60) {
			System.out.println("fail");
		}else if(marks>60 && marks<90) {
			System.out.println("pass");
		}else if(marks>90) {
			System.out.println("passed with distinction");
		}
	}
}
