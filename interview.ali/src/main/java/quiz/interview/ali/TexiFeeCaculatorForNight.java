package quiz.interview.ali;

public class TexiFeeCaculatorForNight extends AbstractTexiFeeCaculator{
	
public TexiFeeCaculatorForNight(Double longDistanceRef) {
		super(longDistanceRef);
	}
	

	@Override
	public Double getFee(DriveSection section) {
		Double sectionDistance = section.getDistance();
		total += getWaitFee(section.getWaitTime());
		if(section.IsStartSection()){
			startDistance = TexiFeeSectionRef.NIGHT_START.getStartDistance();
			total += TexiFeeRef.START_FOR_NIGHT.getPrice();
		}
		if(sectionDistance <= startDistance)
			return total;
		if(sectionDistance <= longDistanceRef){
			total += getShortDistanceFee(sectionDistance - startDistance);
			return total;
		}
			
		total += getShortDistanceFee(longDistanceRef - startDistance)
				 + getLongDistanceFee(sectionDistance - longDistanceRef);
		return total;

	}
	
	private Double getWaitFee(Integer time){
		return time * TexiFeeRef.WAITING.getPrice();
	}
	
	private Double getShortDistanceFee(Double distance){
		return distance * TexiFeeRef.SHORT_DISTANCE_FOR_NIGHT.getPrice();
	}
	
	private Double getLongDistanceFee(Double distance){
		return distance * TexiFeeRef.LONG_DISTANCE_FOR_NIGHT.getPrice();
	}


}
