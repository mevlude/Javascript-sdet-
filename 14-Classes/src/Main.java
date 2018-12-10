
public class Main {

	public static void main(String[] args) {
//		Dog dog1 = new Dog();
//		dog1.name="Bubbly";
//		dog1.age=5;
//		dog1.breed="Poddle";
//		dog1.color="White";
//		
//		System.out.println(dog1.name+" : "+dog1.age+" : "+dog1.breed+" : "+dog1.color);
//		dog1.bark();
//		dog1.eat();
//		dog1.wagTail();
//		
//		
//		System.out.println("------------------------------------------------");
//		
//		
//		Dog2 dog = new Dog2();
//		dog.name="Mike";
//		dog.age=5;
//		dog.breed="husky";
//		dog.color="black";
//		
//		System.out.println(dog.name+" : "+dog.age+" : "+dog.breed+" : "+dog.color);
//		dog.bark();
//		dog.eat();
//		dog.wagTail();
		
		
		TaskConstructor student1=new TaskConstructor("mike", 25, 'M', 2018, "Java");
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();
		
		System.out.println("------------------------------------------------");

		TaskConstructor student2=new TaskConstructor("John", 30, 'M', 2019, "JavaSript");
		student2.attendLecture();
		student2.attendLab();
		student2.submitAssignment();


		
	}

}
