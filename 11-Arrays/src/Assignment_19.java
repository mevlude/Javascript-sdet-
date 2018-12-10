import java.util.Scanner;

public class Assignment_19 {

    public static void main(String[] args) {
        int[] newArray=readIntegers(5);
        int min=findMin(newArray);
        System.out.println("Min="+min);
    }
    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter "+count+" integers");
        for(int i=0;i<count;i++) {

            boolean bool = scanner.hasNextInt();
            if(bool) {
                int number=scanner.nextInt();
                myArray[i]=number;
            }else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        return myArray;
    }

    public static int findMin(int[] myArray) {
       int min=myArray[0];
        for(int j=0;j<myArray.length;j++) {
            if(myArray[j]<min) {
                min=myArray[j];
            }
        }
       return min;
    }
}