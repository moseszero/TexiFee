package quiz.interview.ali;

import java.util.Date;

public class DriveSection {
	private Date startTime;
	private Double distance;
	private Integer waitTime;
	final private Boolean isStartSection;
	
	
	public DriveSection(Date startTime, Double distance, Integer waitTime){
		this.startTime = startTime;
		this.distance = distance;
		this.waitTime = waitTime;
		this.isStartSection = false;
	}
	
	public DriveSection(Date startTime, Double distance, Integer waitTime, Boolean isStartSection){
		this.startTime = startTime;
		this.distance = distance;
		this.waitTime = waitTime;
		this.isStartSection = isStartSection;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(Integer waitTime) {
		this.waitTime = waitTime;
	}

	public Boolean IsStartSection() {
		return isStartSection;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
	
}
