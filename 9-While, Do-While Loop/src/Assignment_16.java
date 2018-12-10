
public class Assignment_16 {

		public static void main(String[] args) {
			
			System.out.println(getEvenDigitSum(123456789));
			System.out.println(getEvenDigitSum(252));
			System.out.println(getEvenDigitSum(-22));
			
		}
		
		public static int getEvenDigitSum(int number) {
			
			if(number<10) {
				return -1;
			}
			
			int sum=0;
			while(number>0) {
				int digit=number%10; 
				if(digit%2==0) {
				sum=sum+digit;       
				}
				number=number/10;    
				
			}
			return sum;
		}
	

}
