import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2 = {1,20,30,4,5};
		
		System.out.println(myIntArray[2] + "|" + myIntArray2[4]);
		
		System.out.println("------------------");
		
		int[] myIntegers=getIntegers(3);
		System.out.println(myIntegers);
		System.out.println(Arrays.toString(myIntegers));

		
	}
	
	//create an method - getIntegers
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter" + number  + " integer values");
		int[] values = new int[number];
		
		for(int i=0;i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		return values;
		
	}
	
	//method  
		int[] intArray =[125,2,48,4];
		
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}	

