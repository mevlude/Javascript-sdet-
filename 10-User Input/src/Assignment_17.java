import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
    	
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integers");
        int num=scanner.nextInt();
        boolean bool=scanner.hasNextInt();
        if(bool){
            int min=num;
            int max=num;
            while(bool){
                num=scanner.nextInt();
                bool=scanner.hasNextInt();
                if(max<num){
                    max=num;
                }
                if(min>num){
                    min=num;
                }
            }
            System.out.println("The Maximum value = "+max+"\nThe Minimum value = "+min);

         }else {
            System.out.println("Not an integer");
        }

     
    }
}
