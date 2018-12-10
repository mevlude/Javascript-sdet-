
public class Assignment_15 {
	
	 public static void main(String argc[]) { 
	        System.out.println(firstDigit(252) + lastDigit(252)); 
	        System.out.println(firstDigit(257) + lastDigit(257)); 
	        System.out.println(firstDigit(0) + lastDigit(0)); 
	        System.out.println(firstDigit(5) + lastDigit(5)); 
	        System.out.println(firstDigit(-10) + lastDigit(-10)); 

	    } 
	
	public static int firstDigit(int n) { 
		
		if(n<0) {
			return -1;
		}
        while (n >= 10) { 
            n /= 10; 
        }
        return n; 
    } 
  
    public static int lastDigit(int n) { 
    	
        return (n % 10); 
    } 
      
   

}
