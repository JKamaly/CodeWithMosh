package homayoon;

public class Student extends Person {
	
	String firstName;
	int age;
	
	public Student() {
		super();
		this.firstName="";
		this.age=0;
		System.out.println("Object os Student");
	}
	public Student(String firstName) {
		this();
		super.firstName=firstName;
		
	}
	public Student (String firstName, int age) {
		super.firstName=firstName;
		super.age=0;
	}
	
	public void printSomething() {
		System.out.println("This is a test");
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	@Override
	public String toString() {
		return "Student FirstName: [ " + super.firstName + ", LastName: "+ super.lastName + " Age: "+ super.age +"]";
	}

}
