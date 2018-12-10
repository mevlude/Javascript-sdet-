
public class A {
	public String str;
	public double val;
	
	public A(String str, double val) {
		super();
		this.str = str;
		this.val = val;
	}


	public A(double val) {
		this.str="JAVA";
		this.val=val;
	}


	public A() {
		this.str="JAVA";
	}

	public A(String str) {
		this.str=str;
	}


	public void print() {
		
		System.out.println("str: "+str+", val: "+val);
		
	}

	
}
