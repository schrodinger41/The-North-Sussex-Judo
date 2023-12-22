package nsj;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DisplayRegisteredAthletes {
	Scanner scan = new Scanner(System.in);
	String answer;
	double compfee;
	double planfee;
	Athlete go = new Athlete();
	DecimalFormat df = new DecimalFormat("0.00");
	public void Display(RegisteredAthletes ath) {//displays the athlete chosen from the arraylist
		System.out.println("===================================================================");
		System.out.println("                     Athlete Information:                          ");
		System.out.println(" ");
		System.out.println("Name:                             "+ath.getathleteName());
		System.out.println("Plan:                             "+ath.getTrainingPlan());
		System.out.println("Weight:                           "+ath.getWeight()+"KG");
		if(ath.getWeightCategory()!=null) {
		System.out.println("Weight Category:                  "+ath.getWeightCategory());
		}
		System.out.println("Number of Competitions:           "+ath.getNoOfCompetitions());
		System.out.println("Private Hours:                    "+ath.getNoOfHours()+" Hour(s) per week");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Itemized List of costs for the month.");
			if(ath.getTrainingPlan()=="Beginner") {//sets the plan fee
				planfee=25.00;
			}
			else if(ath.getTrainingPlan()=="Intermmediate") {//sets the plan fee
				planfee=30.00;
			}
			else if(ath.getTrainingPlan()=="Elite") {//sets the planfee
				planfee=35.00;
			}
				if(ath.getNoOfCompetitions()>1) {//if more than 1 it will set the fee to two matches
					compfee=22.00*2;
					}
				else if(ath.getNoOfCompetitions()==1) {//if 1 it will set to only 1 match fee
					compfee=22.00;
				}
				else if(ath.getNoOfCompetitions()<0) {//it will set it to 0
					compfee=0.00;
					}
		System.out.println("  	Plan Fee:                 $"+df.format(planfee*4));
		System.out.println("  	Private Hours:            $"+df.format(((ath.getNoOfHours()*9.00)*4)));
		System.out.println("  	Competition Entry Fee:    $"+df.format(compfee));
		System.out.println("Monthly Total Fees:               $"+df.format((planfee*4.00)+((ath.getNoOfHours()*9.00)*4.00)+(compfee)*4.00));
		System.out.println("===================================================================");
		choice();
		}	
	public void choice() {
		
		String answer;
		Scanner scan = new Scanner(System.in);
		System.out.println(" [A] Add New Athlete  [B] View Registered Athletes  [C] Exit The Program ");
		while(true) {
		answer = scan.nextLine();	
			if(answer.equalsIgnoreCase("a")) {
				go.registerAthlete();
				break;
			}
			else if(answer.equalsIgnoreCase("b")) {
				go.registeredAthletes();
				break;
			}
			else if(answer.equalsIgnoreCase("c")) {
				System.out.println("Thank you!");
				System.exit(0);
			}
			else {
				System.out.println("!!! Invalid Input !!!");
			}
		}
	}
}
