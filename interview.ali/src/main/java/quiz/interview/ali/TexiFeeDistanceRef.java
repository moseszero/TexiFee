package quiz.interview.ali;

public enum TexiFeeDistanceRef {
	DAY_LONG_DISTANCE(10.0),
	NIGHT_LONG_DISTANCE(10.0);
	
	private Double distance;

	public Double getDistance() {
		return distance;
	}
	private TexiFeeDistanceRef(Double distance){
		this.distance = distance;
	}

}
