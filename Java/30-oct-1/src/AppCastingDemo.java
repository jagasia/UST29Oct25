import java.util.Date;

public class AppCastingDemo {

	public static void main(String[] args) {
		int i=20;
		float f=i;		//implicit
		System.out.println(f); //output is 20.0
		
		i=(int)f;			//explicit
		
		String str="20";
//		i=(int)str;			//no. casting is not possible across categories
							//conversion is required
		
		i=Integer.parseInt(str);
		
		long l=i;			//widening		
		i=(int) l;			//narrowing
		
		Object o=new String();
		Object o1=new Date();
		String str2=(String) o;
		
	}

}
