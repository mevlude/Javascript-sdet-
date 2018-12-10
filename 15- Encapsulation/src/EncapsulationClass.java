
public class EncapsulationClass {

	public static void main(String[] args) {
		System.out.println(load(8,9,45));
		System.out.println(load(96,52));
		System.out.println(load(8));
		
		
	}
	
	public static int load(int a,int b, int c) {
		return (a+b+c);
		
	}
	public static int load(int a, int b) {
		return(a-b);
	}
	public static int load(int a) {
		return(a);

	}

}
