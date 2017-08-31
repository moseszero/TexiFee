package quiz.interview.ali;

import org.junit.Assert;
import java.util.Calendar;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TexiFeeUtilTest {
	LinkedList<DriveSection> driveSections = new LinkedList<>();
	
	@Before
	public void init(){
		driveSections.clear();
	}
	
	@Test
	public void testSingleSection(){
		//14 + 7*2.5 + 5*3.5 + 50*0.1 = 54.0
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR, 8);//Day
		Double distance = 15.0;
		Integer waitTime = 50;
		Boolean isStartSection = true;
		Boolean isOutterRing = false;
		
		DriveSection section = new DriveSection(startTime.getTime(), distance, waitTime, isStartSection);
		driveSections.add(section);
		
		Double expectedFee = Double.valueOf(54.0);
		Double fee = TexiFeeUtil.getFee(driveSections, isOutterRing);
		Assert.assertEquals(expectedFee, fee);
		
	}
	
	@Test
	public void testMultiSections(){
		//(18 + 7*3 + 5*4.7 + 10*0.1) + (20*3.5 + 30*0.1) = 136.5
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR, 4);//Night
		Double distance1 = 15.0;
		Integer waitTime1 = 10;
		Boolean isStartSection1 = true;
		
		DriveSection section1 = new DriveSection(startTime.getTime(), distance1, waitTime1, isStartSection1);
		driveSections.add(section1);
		
		startTime.set(Calendar.HOUR, 8);//Day
		Double distance2 = 20.0;
		Integer waitTime2 = 30;
		Boolean isStartSection2 = false;
		
		DriveSection section2 = new DriveSection(startTime.getTime(), distance2, waitTime2, isStartSection2);
		driveSections.add(section2);
		
		Boolean isOutterRing = false;
		
		Double expectedFee = Double.valueOf(136.5);
		Double fee = TexiFeeUtil.getFee(driveSections, isOutterRing);
		Assert.assertEquals(expectedFee, fee);
	}
	
	@Test
	public void testOutterRingFee() {
		// 14 + 12*2.5 + 50*0.1 = 49.0
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR, 8);// Day
		Double distance = 15.0;
		Integer waitTime = 50;
		Boolean isStartSection = true;
		Boolean isOutterRing = true;

		DriveSection section = new DriveSection(startTime.getTime(), distance, waitTime, isStartSection);
		driveSections.add(section);

		Double expectedFee = Double.valueOf(49.0);
		Double fee = TexiFeeUtil.getFee(driveSections, isOutterRing);
		Assert.assertEquals(expectedFee, fee);
	}

}
