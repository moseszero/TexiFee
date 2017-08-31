package quiz.interview.ali;

import java.util.Calendar;
import java.util.Date;

public class TexiFeeCalculatorFactory {
    static public TexiFeeCaculator createTexiFeeCaculator(Date startTime, Double offsetDistance, Boolean isOutterRing){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startTime);
		int startHour = calendar.get(Calendar.HOUR_OF_DAY);
		if (startHour >= TexiFeeSectionRef.DAY_START.getTime() 
				&& startHour < TexiFeeSectionRef.NIGHT_START.getTime()){
			if(isOutterRing)
				return new OutterRingTexiFeeCaculatorForDay(Double.MAX_VALUE);
			Double longDistanceRef = TexiFeeDistanceRef.DAY_LONG_DISTANCE.getDistance() - offsetDistance; 
			if(longDistanceRef < 0)
				longDistanceRef = 0.0;
			return new TexiFeeCaculatorForDay(longDistanceRef);
			
		}
		if(isOutterRing)
			return new OutterRingTexiFeeCaculatorForNight(Double.MAX_VALUE);
		Double longDistanceRef = TexiFeeDistanceRef.NIGHT_LONG_DISTANCE.getDistance() - offsetDistance; 
		if(longDistanceRef < 0)
			longDistanceRef = 0.0;
		return new TexiFeeCaculatorForNight(longDistanceRef);
    }
}
