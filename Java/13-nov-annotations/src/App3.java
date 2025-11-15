import java.lang.annotation.Annotation;

public class App3 {

	public static void main(String[] args) {
		Annotation[] anns = Product.class.getAnnotations();
		for(Annotation a:anns) {
			System.out.println(a);
		}
	}

}
