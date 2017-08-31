package quiz.interview.ali;

public enum TexiFeeSectionRef {
	DAY_START(6, 3.0),
	NIGHT_START(23, 3.0);
	
	private Integer time;
	private Double startDistance;

	public Integer getTime() {
		return time;
	}
	
    public Double getStartDistance() {
		return startDistance;
	}


	private TexiFeeSectionRef(Integer time, Double startDistance){
    	this.time = time;
    	this.startDistance = startDistance;
    }

}
