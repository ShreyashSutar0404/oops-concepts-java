package Static_NonStatic_Variables;

public class Learn extends Student{
	public static void main(String[] args) {
		
		//1
		Student std = new Student();
		System.out.println(std.firstName);
		Student std1 = new Student();
		System.out.println(std1.lastName);
		
		
		//2
		System.out.println(Student.collegeName);
		
		
		
		
		//3
		System.out.println(collegeName);
	}
	
	public void timePass() {
		System.out.println(firstName);
		System.out.println(lastName);
	}

}


//There are three ways of using class and objects
//1) Via creating the object
//2) Statically
//3) Inheritansce

/* In a nutshell:

Inheritance: "Parent-Child Relationship" (reusing code from a parent class).

Static Method: "Class-Level Method" (shared, doesn’t need an object).

Non-Static Method: "Instance-Level Method" (requires an object, works on its state).

*/