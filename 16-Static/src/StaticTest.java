
public class StaticTest {
	private static int numInstance=0;// if I remove static, then out put will be 1,1,1. 
	private String name;
	public StaticTest(String name) {
		this.name=name;
		numInstance++;
		
	}
	public int getNumInstance() {
		return numInstance;
	}
	public String getName() {
		return name;
	}
}
