
public class PrinterEncapsulation {

	public static void main(String[] args) {
		
		Printer printer1=new Printer(40, true);
		System.out.println("At the beginning, the number of printed pages  : "+printer1.getNoOfPages());
		System.out.println("This printer is duplex : "+printer1.isDuplex);
		int printed= printer1.printedPages(24);
		System.out.println(printed+" pages have been printed.");
		System.out.println("New toner level is %"+printer1.addToner(40)+".");
		System.out.println(printer1.printedPages(137)-printed+" pages have been printed.");
		System.out.println("Total amount of printed pages are "+printer1.getNoOfPages()+" pages.");
	}

}
