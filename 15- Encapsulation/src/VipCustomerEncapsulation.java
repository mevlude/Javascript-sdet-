
public class VipCustomerEncapsulation {

	public static void main(String[] args) {
		VipCustomer customer=new VipCustomer("mike smith", 5_000_000, "test@test.com");
		System.out.println("Customer name is : "+customer.getName());
		System.out.println("Customer's card limit is : "+customer.getCardLimit());
		System.out.println("Customer e-mail address is : "+customer.getEmail());
		
	}

}
