import java.util.Arrays;

public class Assignment_20 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));

		reverse(arr);

		System.out.println(Arrays.toString(reversedArr));

	}
	
	static int[] arr= {1,2,3,4,5,6,7};
	static int[] reversedArr=arr;
	
	public static void reverse(int[] arr) {
			
		int temp;
		int start=0;
		int end=reversedArr.length-1;
		while(start<end) {
			temp=reversedArr[start];
			reversedArr[start]=reversedArr[end];
			reversedArr[end]=temp;
			
			start++;
			end--;
		}
	}
}