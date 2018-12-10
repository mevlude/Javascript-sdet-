
public class Main {
	public static void main(String[] args) {
		
		
	Dog dog =new Dog("Yorkie");
	dog.breath();
	dog.eat();
	
	System.out.println("--------------------------");
	
	Parrot p1=new Parrot("Australia Ringneck");
	p1.breath();
	p1.eat();
	p1.fly();
	
	System.out.println("--------------------------");

	Penguen pe1 = new Penguen("Penguin");
	pe1.breath();
	pe1.eat();
	pe1.fly();
}
}
