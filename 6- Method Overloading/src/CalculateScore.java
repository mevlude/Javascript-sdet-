//public class methodOverloading {
//
//	public static void main(String[] args) {
//		System.out.println(sum(5,6));
//		System.out.println(sum(5,6,7));
//		System.out.println(sum(5,6,9,19));
//
//	}
//	public static int sum(int a,int b) {
//		return a+b;
//	}
//	public static int sum(int a,int b,int c) {
//		return a+b+c;
//	}
//	public static int sum(int a,int b,int c,int d) {
//		return a+b+c+d;
//	}
//}


public class CalculateScore {
	public static void main(String[] args) {
		int newScore = calculateScore("Mike Smith", 500);
		System.out.println("New Score is: "+newScore);
		
		newScore = calculateScore("John Smith", 700);
		System.out.println("New Score is: "+newScore);
		
		calculateScore();
		calculateScore(75);

		
	}
	public static int calculateScore(String name, int score) {
		System.out.println("Player " + name+ " scored "+score+" points.");
		return score*100; 
	}
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player scored "+score+" points.");
		return score*100;
	}
	public static void calculateScore() {
		System.out.println("No Player name, No Player score.");		 
	}

}
