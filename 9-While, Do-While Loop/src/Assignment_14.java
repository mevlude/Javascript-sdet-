
public class Assignment_14 {

	public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){
        if(number<0){
            number=number*(-1);
        }
        int reverse=0;
        int copyOfNumber=number;
        String newNumber="";
        while(number>0){
            int lastDigit=number%10;
            newNumber=newNumber+lastDigit;
            number=number/10;

        }
        reverse=Integer.parseInt(newNumber);
        if(reverse==copyOfNumber){
            return true;
        }else {
            return false;
        }
    }

}
