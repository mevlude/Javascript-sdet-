
public class Main {

	public static void main(String[] args) {
		
		Engine e1 = new Engine();                    // instead of writing these two lines we can write as :
		Honda h1 = new Honda("Red", 200, e1);        //         Honda h1 = new Honda("Red", 200, new Engine());
		
		h1.carInfo();
		h1.startHonda();

	}

}
