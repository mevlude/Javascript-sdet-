
public abstract class Animal {
	
	private String name;
	public abstract void eat();  ////abstract  method since it doesn't have body
	public abstract void breath();
	
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	
	public String getName() { //concrete method since it has body
		
		return name;
	}

}
