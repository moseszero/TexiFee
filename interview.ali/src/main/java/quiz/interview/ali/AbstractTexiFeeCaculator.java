package quiz.interview.ali;

public abstract class AbstractTexiFeeCaculator implements TexiFeeCaculator{
	
	protected Double total;
	protected Double startDistance;
	protected Double longDistanceRef;
	
	public AbstractTexiFeeCaculator(Double longDistanceRef){
		this.total = 0.0;
		this.startDistance = 0.0;
		this.longDistanceRef = longDistanceRef;
	}

}
