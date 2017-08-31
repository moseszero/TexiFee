package quiz.interview.ali;

import java.util.LinkedList;

public class TexiFeeUtil {
	
	static Double getFee(LinkedList<DriveSection> driveSections, Boolean isOutterRing){
		Double totalFee = 0.0;
		Double distanceCount = 0.0;
		for(DriveSection section: driveSections){
			totalFee += getSectionFee(section, distanceCount, isOutterRing);
			distanceCount += section.getDistance();
		}
		return totalFee;
	}

	private static Double getSectionFee(DriveSection section, Double offsetDistance, Boolean isOutterRing) {
		TexiFeeCaculator calculator = TexiFeeCalculatorFactory
				.createTexiFeeCaculator(section.getStartTime(), offsetDistance, isOutterRing);
		Double fee = calculator.getFee(section);
		return fee;
	}
	
}
