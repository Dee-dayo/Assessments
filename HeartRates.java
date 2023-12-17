
public class HeartRates {

	private String firstName ;
	private String lastName ;
	private int day;
	private int month ;
	private int year ;

	public HeartRates (String firstName, String lastName, int day, int month, int year) {
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.day = day ;
		this.month = month ;
		this.year = year ;
	}	

	public void setFirstName (String firstName) {
		this.firstName = firstName ;
	}
	
	public String getFirstName () {
		return firstName ;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName ;
	}

	public String getLastName () {
		return lastName ;
	}

	public void setDay (int day) {
		this.day = day ;
	}

	public int getDay () {
		return day ;
	}

	public void setMonth (int month) {
		this.month = month ;
	}

	public int getMonth () {
		return month ;
	}

	public void setYear (int year) {
		this.year = year ;
	}

	public int getYear () {
		return year ;
	}

	public int noOfYears () {
		int noOfYears = 2023 - getYear() ;
		return noOfYears ;
	}
	
	public int maxHeartRate () {
		int maxHeartRate = 220 - noOfYears() ;
		return maxHeartRate ;
	}

	public double minTargetHeartRate () {
			double minHeartRate = 0.5 * maxHeartRate ();
		return minHeartRate ;
	}

	public double maxTargetHeartRate () {
			double mmHeartRate = 0.85 * maxHeartRate ();
		return mmHeartRate ;
	}

	

}