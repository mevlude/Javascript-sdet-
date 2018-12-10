package computer;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSuply;
	private Dimensions dimensions1;
	
	
	
	public Case(String model, String manufacturer, String powerSuply, Dimensions theDimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSuply = powerSuply;
		this.dimensions1 = theDimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSuply() {
		return powerSuply;
	}
	public Dimensions getDimensions1() {
		return dimensions1;
	}
	
	
	
	

}
