import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		Product product=new Product(3L, "Eraser", "Stationery", 5.0);
		//lets convert this java object into json now.
		
		Gson gson=new Gson();
		
		System.out.println(gson.toJson(product));
	}

}
