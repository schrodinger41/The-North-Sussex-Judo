package nsj;

public interface TrainingPlan {

	public abstract double cost();
	public abstract String trainingPlan();	
}
//beginner class
class Beginner implements TrainingPlan {
	@Override
	public double cost() {//cost for the plan
		return 25.00*4;
	}
	@Override
	public String trainingPlan() {//sets the plan
		return "Beginner";
	}	
}
//intermmediate class
class Intermediate implements TrainingPlan {
	@Override
	public double cost() {//cost for the plan
		return 30.00*4;
	}
	@Override
	public String trainingPlan() {//sets the plan
		return "Intermmediate";
	}
}
//elite class	
class Elite implements TrainingPlan {
	@Override
	public double cost() {//cost for the plan
		return 35.00*4;
	}
	@Override
	public String trainingPlan() {//sets the plan
		return "Elite";
	}	
}


