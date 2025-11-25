
public class Mathematics {
	private Integer no1;
	private Integer no2;
	private Float result=0.0f;
	
	public Mathematics() {}

	public Mathematics(Integer no1, Integer no2, Float result) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.result = result;
	}

	public Integer getNo1() {
		return no1;
	}

	public void setNo1(Integer no1) {
		this.no1 = no1;
	}

	public Integer getNo2() {
		return no2;
	}

	public void setNo2(Integer no2) {
		this.no2 = no2;
	}

	public Float getResult() {
		return result;
	}

	public void setResult(Float result) {
		this.result = result;
	}
	
	public void addNumbers() {
		this.result=(float) (no1+no2);
	}
	
	public void subtractNumbers() {
		result=(float) (no1-no2);
	}
	
	
}
