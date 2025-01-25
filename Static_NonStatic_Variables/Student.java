package Static_NonStatic_Variables;

public class Student {
	
	String firstName;
	String lastName;
	
	static String collegeName;
	
	public String getfirstName() {
		System.out.println(collegeName);
		return firstName;}
		
	public String getlastName() {
		System.out.println(firstName);
		System.out.println(lastName);
		return lastName;
	
	}
	
	public static String getcollegeName() {
		return collegeName;
	}

}
