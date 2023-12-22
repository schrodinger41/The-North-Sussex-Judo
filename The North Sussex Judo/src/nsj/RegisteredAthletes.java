package nsj;

public class RegisteredAthletes {
//attributes for this class
	private String athleteName;
	private String tPlan;
	private double Weight;
	private String weightCategory;
	private int noOfCompetitions;
	private int noOfHours;
 //setteres and getteres for the 6 registered athletes
	public String getathleteName() {
		return athleteName;
	}
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}
	public String getTrainingPlan() {
		return tPlan;
	}
	public void setTrainingPlan(String trainingPlan) {
		this.tPlan = trainingPlan;
	}
	public double getWeight() {
		return Weight;
	}
	public void setCurrentWeight(double Weight) {
		this.Weight = Weight;
	}
	public String getWeightCategory() {
		return weightCategory;
	}
	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}
	public int getNoOfCompetitions() {
		return noOfCompetitions;
	}
	public void setNoOfCompetitions(int noOfCompetitions) {
		this.noOfCompetitions = noOfCompetitions;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
 
	public RegisteredAthletes(String athleteName, String tPlan, double Weight, String weightCategory,
			int noOfCompetitions, int noOfHours) {
		super();
		this.athleteName = athleteName;
		this.tPlan = tPlan;
		this.Weight = Weight;
		this.weightCategory = weightCategory;
		this.noOfCompetitions = noOfCompetitions;
		this.noOfHours = noOfHours;
	}
	public RegisteredAthletes() {
		super();
	}
	

}
