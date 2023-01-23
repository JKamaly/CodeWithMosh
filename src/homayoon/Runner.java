package homayoon;

public class Runner {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.firstName = "Jas";
		
		Student obj2 = new Student("Jack");
		Student obj3 = new Student("David", 30);
		
		obj.printSomething();
		System.out.println(obj.sum(20, 30));
		
	
		
		System.out.println("****************");
		System.out.println(obj);
		System.out.println(obj2);		
		System.out.println(obj3);
	
		
		
		

	}

}
