
public class VipCustomer {

	private String name;
	private double cardLimit;
	private String email;


	public VipCustomer(String name, double cardLimit, String email){
        this.name=name;
        this.cardLimit=cardLimit;
        this.email=email;
    }
    public VipCustomer(String name,String email){
        this();
        this.name=name;
        this.email=email;
    }
    public VipCustomer(){
        this.cardLimit=2000;
        System.out.println("All fields have been saved.");
    }

	public String getName() {
		return name;
	}

	public double getCardLimit() {
		return cardLimit;
	}

	public String getEmail() {
		return email;
	}
	
}
