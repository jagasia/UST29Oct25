import java.util.Date;

public class App {

	public static void main(String[] args) {
		Object []arr=new Object[10];
		arr[0]="Raja";	//up casting
		arr[1]=12;
		arr[2]=1.2;
		arr[3]=new Date();
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof String) {
				System.out.println("String:"+arr[i]);
			}else if(arr[i] instanceof Integer) {
				System.out.println("Integer:"+arr[i]);
			}else if(arr[i] instanceof Double) {
				System.out.println("Double:"+arr[i]);
			}else if(arr[i] instanceof Date) {
				System.out.println("Date:"+arr[i]);
			}
		}
	}

}
