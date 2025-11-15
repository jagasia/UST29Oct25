import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		HashMap<Character, Integer> map=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
//			map.containsKey(c)
			Integer count = map.get(c);
			if(count==null) {
				count=0;
			}
//			count++;
			map.put(c, ++count);
		}
//		System.out.println(map);
		for(Entry<Character, Integer> e:map.entrySet()) {
			System.out.printf("%c\t%d\n",e.getKey(), e.getValue());
		}
	}

}
