

interface Person{
	void speak();
	static void walk() {
		System.out.println("Person walks");
	}
}

class Employee1{
	public void talk() {
		System.out.println("Employee talks");
	}
	
	public static void discuss() {
		System.out.println("Employee discusses");
	}
}


public class App2 {

	public static void main(String[] args) {
		Person raja=new Employee1()::talk;
		Person ravi=Employee1::discuss;		//static method ref
		raja.speak();
		ravi.speak();
	}

}
