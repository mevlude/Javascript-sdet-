import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {
		int myIntValue=10;
		int anotherIntvalue=myIntValue;
		
		System.out.println("myIntValue: "+myIntValue);
		System.out.println("anotherIntValue: "+anotherIntvalue);
		System.out.println("------------------");

		anotherIntvalue=anotherIntvalue+1;
		
		System.out.println("myIntValue: "+myIntValue);
		System.out.println("anotherIntValue: "+anotherIntvalue);
		System.out.println("------------------");
		
		
		int[] myIntArray=new int[5];
		int[] anotherArray=new int[5];
		
		System.out.println("myIntArray: "+ Arrays.toString(myIntArray));
		System.out.println("anotherArray: "+ Arrays.toString(anotherArray));
		System.out.println("-----------------------------------------");

		anotherArray[0]=1;
		
		System.out.println("myIntArray: "+ Arrays.toString(myIntArray));
		System.out.println("anotherArray: "+ Arrays.toString(anotherArray));

	}

}
