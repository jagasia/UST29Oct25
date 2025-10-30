class Employee{
	long id;			//scope of id is class scope. instance scope
	String name;
	static String companyName;		//opp to instance = static
	public static void display() {
		System.out.println(companyName);
//		System.out.println(id);
	}
}
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_MARKS=100;
//		MAX_MARKS=20;			//NOT ALLOWED
		System.out.println(MAX_MARKS);
		
	}

}
