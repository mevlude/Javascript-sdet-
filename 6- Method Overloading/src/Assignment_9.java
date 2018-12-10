
public class Assignment_9 {

	public static void main(String[] args) {
		area(5.0);
		area(-1);
		area(5.0, 4.0);
		area(-1.0, 4.0);
	}
	public static double area(double radius) {
		if(radius<0) {
			System.out.println(-1);
			return -1;
		}else {
			double a=radius*radius*3.14159;
			System.out.println(a);
			return a;
		}
	}
	public static double area(double x,double y) {
		if(x<0||y<0) {
			System.out.println(-1);
			return -1;
		}else {
			double z=x*y;
			System.out.println(z);
			return z;
		}
	}

}
