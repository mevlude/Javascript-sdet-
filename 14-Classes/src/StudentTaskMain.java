public class StudentTaskMain {

	public static void main(String[] args) {
		
		StudentTask student1 = new StudentTask("Mike",17,'M',2016, "Java", "Cybertek University");
		student1.attendLecture();
		student1.submitAssignment();
		student1.attendLab();
		
		System.out.println("----------------------------------");
		
		StudentTask student2 = new StudentTask("Smith",18,'M',2016,"JavaScript","Cybertek University");
		student2.attendLecture();
		student2.submitAssignment();
		student2.attendLab();
		
		System.out.println("----------------------------------");
		
		StudentTask student3 = new StudentTask("John", 18, 'M',2016, "TypeScript", "Cybertek University");
		student3.attendLecture();
		student3.submitAssignment();
		student3.attendLab();
		

	}

}