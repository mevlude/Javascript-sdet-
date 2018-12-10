import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner (System.in);
private static GroceryList groceryList = new GroceryList();

public static void main(String[] args) {

boolean quit=false;
int choice=0;
printInstructions();// homework

while(!quit) {
System.out.println("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine();

switch (choice) {
case 0:
printInstructions();
break;
case 1:
groceryList.printGroceryList();
break;
case 2:
addItem();
break;
case 3:
modifyItem();
break;
case 4:
removeItem();
break;
case 5:
searchForItem();
break;
case 6:
quit=true;
break;
}
}
}

private static void searchForItem() {
System.out.println("Please enter item name to find out where your item is in your list.");
String item=scanner.nextLine();
String position=groceryList.findItem(item);
System.out.println("This item is "+position+". position in your list.");
}


private static void removeItem() {
System.out.println("Please enter the position of item that you want to remove.");
int position=scanner.nextInt();
groceryList.removeGroceryItem(position-1);
}


private static void modifyItem() {
System.out.println("Please enter position of item you want to change ");
int position=scanner.nextInt();
scanner.nextLine();
System.out.println("Please enter new item. ");
String newItem=scanner.nextLine();
groceryList.modifyGroceryItem(position-1,newItem);

}


private static void addItem() {
System.out.println("Add an item to your list : ");
String addItem=scanner.nextLine();
groceryList.addGroceryItem(addItem);
}

private static void printInstructions() {
System.out.println("Please choose enteran option from below "
+ "\n0-Print Instructions"
+ "\n1-Print Grocery list"
+ "\n2-Add items"
+ "\n3-Modify Items"
+ "\n4-Remove Items"
+ "\n5-Search items "
+ "\n6-Quit The Program");

}

}



