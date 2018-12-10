
public class Main {

	public static void main(String[] args) {
		
		//DeskPhone mikePhone = new DeskPhone(123456789, true);
		
		ITelephone mikePhone = new DeskPhone(123456789, true);
		
		mikePhone.powerOn(); 
		mikePhone.callPhone(123456789);
		mikePhone.answer();
		
	}

}
