
public class Assignment_8 {

	public static void main(String[] args) {
		getDurationString(1452);
		getDurationString(765, 45);
		getDurationString(1235, 75);
	}
	public static void getDurationString(int min, int sec) {
		if(min<0 || (sec<0 || sec>59)){
			System.out.println("Invalid value!");
		}else {
		int hour=min/60;
		min=min%60;
		System.out.println(hour+"h "+min+"m "+sec+"s ");
		}
	}
	public static void getDurationString(int sec) {
		if(sec<0){
			System.out.println("Invalid value!");
		}else {
		int min=sec/60;
		sec=sec%60;
		
		System.out.println(min+"m "+sec+"s ");
		}
	}

}
