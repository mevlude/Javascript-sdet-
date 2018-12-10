
// Create a method called displayHighScorePosition. It should have a players name as a parameter, and a 2nd parameter as a position in the high score table. You should display the players name along with a message like “managed to get into position” and the position they got and a further message “on the high score table”
// Create a 2nd method called calculateHighScorePosition. It should be sent one argument only., the player score. It should return an int. The return data should be :
//1 – if the score is >=1000
//2 – if the core is >=500 and <1000 3- if the score is >=100 and <500 4- in all other cases
//:black_small_square: Call both methods and display the results of the following: a score of 1500, 900, 400 and 50

public class Task {

	public static void main(String[] args) {
		int pos=calculateHighScorePosition(750);
		displayHighScorePosition("Mike Smith", pos);
		
		pos=calculateHighScorePosition(1000);
		displayHighScorePosition("John Brown", pos);
		
	}
	
	public static void displayHighScorePosition(String name, int pos) {
		
		System.out.println(name+" managed to get into position "+pos+" on the high score table");
		 
		
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else{
			return 4;
		}
		
		
	}

}
