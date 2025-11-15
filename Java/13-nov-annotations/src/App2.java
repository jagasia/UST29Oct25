import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App2 {

	public static void main(String[] args) {
		Method[] methods = Product.class.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
			Annotation[] anns = method.getAnnotations();
			for(Annotation a:anns) {
				System.out.println("--"+a);
			}
		}
	}

}
