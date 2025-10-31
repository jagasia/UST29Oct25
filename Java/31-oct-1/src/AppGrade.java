
public class AppGrade {

	public static void main(String[] args) {
		int score=90;
		if(score>90) {
			System.out.println("Excellent");
		}else if(score>80) {
			System.out.println("Good");
		}else if(score>=70) {
			System.out.println("Pass");
		}else if(score>=0) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid score");
		}
	}

}
