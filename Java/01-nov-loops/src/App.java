
public class App {

	public static void main(String[] args) {
	outer:	for(int i=0;i<10;i++) {//you are outer loop
			for(int j=0;j<10;j++) {
				if(j>=5) {
					break outer; //how to break the outer loop.
				}
				System.out.printf("i=%d\tj=%d\n",i,j);
			}
		}
	}

}
//0 0
//0 1
//0 2
//0 3
//0 4
//1 0