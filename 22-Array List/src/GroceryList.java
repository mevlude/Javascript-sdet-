import java.util.ArrayList;
import java.util.List;

//instead of these two import I can put ----   import java.util.*    --------

public class GroceryList {

	//List groceryList =new ArrayList(); //grocerList object can hold any kind of data
	List<String> groceryList = new ArrayList<String>();	//here groceryList object can only hold String datatype

	public void addGroceryItem(String item) {		
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list.");
		
		for(int i=0;i<groceryList.size();i++) {
			System.out.println(i+1+". "+ groceryList.get(i));
		}
	}
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);	
	}
	public void removeGroceryItem(int position) {
		//String theItem = groceryList.get(position);
		groceryList.remove(position);	
	}
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	

}
