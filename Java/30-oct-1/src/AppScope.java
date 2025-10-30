



public class AppScope {
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		System.out.println("First line of main");
		Employee e1=new Employee();
		e1.id=302808;
		e1.name="Gokul";
		e1.companyName="UST";
		
		Employee e2=new Employee();
		e2.id=302785;
		e2.name="Nithin";
		e2.companyName="UST Healthproof";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.companyName); 		//what is output?
		
	}

}
