
public class AritmeticOperators {

	public static void main(String[] args) {
		int i1=12;
		int i2=5;
		float f1=15.5f;
		double d1=20.5;
		String msg="Hello";
		
		int res1=i1+i2;
		float res2=i1+f1;//int+float=float
		double res3=i2+d1; //int+double=double
		String res4=msg+f1;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println("------------------------");
		
		byte b1=12;//implicit casting-java does this casting-
		int i5=12;
		byte b2=20;
//The result of an expression involving anything int-sized 
//or smaller variable is always an int. If you add two bytes together, 
//you will get an int. And in case of aritmetic addition, multiplication,
//substruction and division of integral variables(byte or short) compile
//process the value as int, so you need to cast it.
		
		
		byte resByte=(byte)(b1+b2);
		byte resByte1=20+12;
		byte res7=126+1;
		int res8=(int)(126+19);
		System.out.println(res8);


	}

}
