
public class Assignment_3 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
		printMegaBytesAndKiloBytes(-5);
		printMegaBytesAndKiloBytes(7865);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid value");
		}else {
		
		int megaBytes=kiloBytes/1024;
		int remainingKiloBytes=kiloBytes%1024;
		
		System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
		}
	}

}
