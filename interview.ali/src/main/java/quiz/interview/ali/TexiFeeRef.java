package quiz.interview.ali;

public enum TexiFeeRef {
	START_FOR_DAY(14.0),
	SHORT_DISTANCE_FOR_DAY(2.5),
	LONG_DISTANCE_FOR_DAY(3.5),
	
	START_FOR_NIGHT(18.0),
	SHORT_DISTANCE_FOR_NIGHT(3.0),
	LONG_DISTANCE_FOR_NIGHT(4.7),
	
	WAITING(0.1);
	
	private Double price;
	public Double getPrice() {
		return price;
	}
	private TexiFeeRef(Double price){
		this.price = price;
	}

}
