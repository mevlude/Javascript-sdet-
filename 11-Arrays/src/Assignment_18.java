import java.util.Arrays;
import java.util.Scanner;


public class Assignment_18 {

	public static void main(String[] args) {
		getIntegers(6);
		printArray();
		sortIntegers();		
	}
	static int[] copyArr;
	public static int[] getIntegers(int n) {
		Scanner scanner=new Scanner(System.in);
		
		int[] arr=new int[n];		
		System.out.println("Enter "+n+" integers");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		copyArr=arr;
		return arr;
	}
	public static void printArray() {
		System.out.println("The array is : "+Arrays.toString(copyArr));	
	}
	
	public static int[] sortIntegers() {
		for(int i=0;i<copyArr.length;i++) {
			for(int j=i+1;j<copyArr.length;j++) {
				if(copyArr[i]<copyArr[j]) {
					int temp=copyArr[i];
					copyArr[i]=copyArr[j];
					copyArr[j]=temp;
				}
			}			
		}
		System.out.println("The sorted array is : "+Arrays.toString(copyArr));
		return copyArr;
	}
	
}
