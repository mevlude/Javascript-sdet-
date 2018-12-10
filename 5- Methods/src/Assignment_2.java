
public class Assignment_2 {

	public static void main(String[] args) {
		isCatPlaying(true, 10);
		isCatPlaying(false, 36);
		final boolean catPlaying = isCatPlaying(false, 35);

	}

	public static boolean isCatPlaying(boolean summer, int temp) {
		if (!summer && (temp > 25 && temp <= 35)) {
			System.out.println(true);
			return true;
		} else if (summer && (temp > 25 && temp <= 45)) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}

}
