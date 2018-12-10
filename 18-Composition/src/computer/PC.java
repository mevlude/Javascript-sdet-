package computer;

public class PC {
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotheroard;
	
	
	public PC(Case theCase, Monitor theMonitor, Motherboard theMotheroard) {
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotheroard = theMotheroard;
	}


	public Case getTheCase() {
		return theCase;
	}


	public Monitor getTheMonitor() {
		return theMonitor;
	}


	public Motherboard getTheMotheroard() {
		return theMotheroard;
	}
	
	
	
	
}
