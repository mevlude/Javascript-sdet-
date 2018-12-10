
public class Printer {
	
	public int tonerLevel;
	public boolean isDuplex;
	private int noOfPages;

	
	public int addToner(int addingAmount) {

		if(addingAmount>0 && addingAmount<=100) {
			if(this.tonerLevel+addingAmount>100){
			return -1;
			}
			this.tonerLevel=tonerLevel+addingAmount;
			return addingAmount;
		}else {
			return -1;
		}
	}
	
	public int printedPages(int pages) {
		if(this.isDuplex==true) {
			pages=pages/2+pages%2;	
		}
        this.noOfPages=this.noOfPages+pages;
        return this.noOfPages;
		}

	
	

	public int getNoOfPages() {
		return noOfPages;
	}

	public Printer(int tonerLevel, boolean isDuplex) {
		if(tonerLevel>=0 && tonerLevel<=100) {
		this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel=-1;
		}
		this.isDuplex = isDuplex;
		this.noOfPages = 0;
		}
	}
	
