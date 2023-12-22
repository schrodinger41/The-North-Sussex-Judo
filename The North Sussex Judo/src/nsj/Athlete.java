package nsj;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Athlete {
//attributes
	private String athleteName;
	private String trainingPlan;
	private double Weight;
	private String WeightCategory;
	private int noOfCompetitions;
	private int noOfHours;
	private TrainingPlan tPlan;
	String trainPlan;
	String comp;
	double planFee;
	double compFee;
	Scanner scan = new Scanner(System.in);
	//getters and setters
	public String getAthleteName() {
		return athleteName;
	}
	public void setAthleteName(String athletename) {
		athleteName = athletename;
	}
	public String getTrainingplan() {
		return trainingPlan;
	}
	public void setTrainingplan(String trainingplan) {
		trainingPlan = trainingplan;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public String getWeightCategory() {
		return WeightCategory;
	}
	public void setWeightCategory(String weightCategory) {
		WeightCategory = weightCategory;
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
	public TrainingPlan getTrainingPlan() {
		return tPlan;
	}
	public void setTrainingPlan(TrainingPlan trainingPlan) {
		this.tPlan=trainingPlan;
	}
	//constructor for registering the athlete
	Athlete(String athletename, String trainingplan, double Weight, String weightCategory, int noOfCompetitions,
			int noOfHours) {
		super();
		athleteName = athletename;
		trainingPlan = trainingplan;
		this.Weight = Weight;
		WeightCategory = weightCategory;
		this.noOfCompetitions = noOfCompetitions;
		this.noOfHours = noOfHours;
	}
	public Athlete() {
		super();
	}
	
	RegisteredAthletes set = new RegisteredAthletes();//object to set the attributes
	
	//method to register a new athlete
	public void registerAthlete() {
		System.out.println("-------------------------------------------------------------------");
		nameInput();//it will go to the name input method
        weightInput();//it will go to the weight input method
        planInput(); // it will go to the plan input method
        weightCategoryInput();// it will go to the weightcat input method
        privateCoachingInput();//it will go to the private coach input method
	}
	//name inputs
	public void nameInput() {
        while (true) {
        	System.out.print("Input Name: ");
            athleteName = scan.next();

            if (athleteName.matches("[a-zA-Z]+")) {//to make sure the user inputs only letters
            	 set.setAthleteName(athleteName);
                break;
            } else {
                System.out.println("Invalid input. Please enter only letters:");//reinput again
            }
        }
	}
        //plan input
	public void planInput() {
	    while (true) {
	        System.out.print("Input Plan: ");
	        trainPlan = scan.next();

	        if (trainPlan.equalsIgnoreCase("beginner")) {
	            this.tPlan = new Beginner();//sets the plan
	            trainPlan = "Beginner";
	            break;
	        } 
	        else if (trainPlan.equalsIgnoreCase("intermediate")) {
	        	System.out.println("Eligible for competitions.");
	            System.out.print("Number of Competitions: ");
                while (true) {
                    try {
                        int answercomp = scan.nextInt();
                        setNoOfCompetitions(answercomp);//sets the noOfComp
                        noOfCompetitions = answercomp;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("!!! Invalid Input !!!");
                        scan.nextLine(); // Clear the scanner buffer
                    }
                }
	            this.tPlan = new Intermediate();//sets the plan
	            trainPlan = "Intermediate";
	            break;
	        } 
                else if (trainPlan.equalsIgnoreCase("elite")) {
    	        System.out.println("Eligible for competitions.");
	            System.out.print("Number of Competitions: ");
	            while (true) {
                    try {
                        int answercomp = scan.nextInt();
                        setNoOfCompetitions(answercomp);//sets the noOfComp
                        noOfCompetitions = answercomp;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("!!! Invalid Input !!!");
                        scan.nextLine(); // Clear the scanner buffer
                    }
	            }
	            this.tPlan = new Elite();
	            trainPlan = "Elite";//sets the plan
	            break;
            }
	            else {
	            System.out.println("!!! Invalid input please choose from the list !!!");
	            scan.nextLine(); // Clear the scanner buffer
	        }
	    }
	}    
        //weight 
        public void weightInput() {	
        while (true) {
        	System.out.print("Input Weight: ");
        	try {
        		setWeight(scan.nextDouble());//sets the input into the following var
        		break;	
        		}
        	catch(Exception e) {
        		System.out.println("!!! Invalid Input !!!");//it will prompt the user of the invalid input and let them input again
        		scan.nextLine();
        		System.out.println();
        		}
        	}
        }
        //weightcategory	
        public void weightCategoryInput() {
            if (trainPlan.equalsIgnoreCase("intermediate") || trainPlan.equalsIgnoreCase("elite")) {
                String answercat;
                while (true) {
                    System.out.print("Input Weight Category: ");
                    answercat = scan.next();
                    if (answercat.equalsIgnoreCase("heavyweight")) {
                        setWeightCategory("HeavyWeight");
                        break;
                    } else if (answercat.equalsIgnoreCase("light-heavyweight")) {
                        if (Weight <= 100 && Weight >= 90) {
                            setWeightCategory("Light-Heavyweight");
                            break;
                        } else if (Weight > 100) {
                            System.out.println("Not Eligible for this weight.");
                            System.out.println("Weight Upperlimit: 100 KG");
                            System.out.println("Please choose again.");
                        }
                    } else if (answercat.equalsIgnoreCase("middleweight")) {
                        if (Weight <= 90 && Weight >= 81) {
                            setWeightCategory("Middleweight");
                            break;
                        } else if (Weight > 90) {
                            System.out.println("Not Eligible for this weight.");
                            System.out.println("Weight Upperlimit: 90 KG");
                            System.out.println("Please choose again.");
                        }
                    } else if (answercat.equalsIgnoreCase("light-middleweight")) {
                        if (Weight <= 81 && Weight >= 73) {
                            setWeightCategory("Light-Middleweight");
                            break;
                        } else if (Weight > 81) {
                            System.out.println("Not Eligible for this weight.");
                            System.out.println("Weight Upperlimit: 81 KG");
                            System.out.println("Please choose again.");
                        }
                    } else if (answercat.equalsIgnoreCase("lightweight")) {
                        if (Weight <= 73 && Weight >= 66) {
                            setWeightCategory("Lightweight");
                            break;
                        } else if (Weight > 73) {
                            System.out.println("Not Eligible for this weight.");
                            System.out.println("Weight Upperlimit:  73 KG");
                            System.out.println("Please choose again.");
                        }
                    } else if (answercat.equalsIgnoreCase("flyweight")) {
                        if (Weight <= 66) {
                            setWeightCategory("Flyweight");
                            break;
                        } else if (Weight > 66) {
                            System.out.println("Not Eligible for this weight.");
                            System.out.println("Weight Upperlimit: 66 KG");
                            System.out.println("Please choose again.");
                        }
                    } else {
                        System.out.println("!!! Invalid Input !!!");
                        scan.nextLine(); // reinputs the user again
                    }
                }
            }
        }

				//private hours
        public void privateCoachingInput() {
        	while(true) {
                System.out.print("Number of hours private coaching (optional): ");
                int answercoach;
	                try {
	                    answercoach = scan.nextInt();
	
	                    if(answercoach >= 1 && answercoach <= 5) {//sets the range for  the private coaching
	                        setNoOfHours(answercoach);
	                        displayAthlete();
	                        noOfHours = answercoach;
	                        break;
	                    }
	                    else if(answercoach > 5) {
	                        System.out.println("!!! Maximum of 5 hours only !!!");// if it went over5 hrs
	                    }
	                    else {
	                        System.out.println("!!! Invalid Input. Please enter a number between 1 and 5 !!!");//if it is a negative number or string
	                    }
	                }
	                catch (InputMismatchException e) {
	                    System.out.println("!!! Input numbers only !!!");
	                    scan.next(); // Consume the invalid input
	                }
	            }
	        }
   		//display the new athlete info
		public void displayAthlete() {
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("===================================================================");
			System.out.println("                     Athlete Information:                          ");
			System.out.println(" ");
			System.out.println("Name:                             "+athleteName);
			System.out.println("Plan:                             "+tPlan.trainingPlan());
			System.out.println("Weight:                           "+Weight+"KG");
				if(WeightCategory!=null) {
					System.out.println("Weight Category:                  "+WeightCategory);
				}
			System.out.println("Number of Competitions:           "+noOfCompetitions);
			System.out.println("Private Hours:                    "+noOfHours+" Hour(s) per week");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Itemized List of costs for the month.");
				if(noOfCompetitions>1) {//condition if the comp is over 1 it will only count the two matches for the fee
					compFee=22.00*2;
					}
				else if(noOfCompetitions==1) {//condition if the comp is 1 it will only set the fee to one match
					compFee=22.00;
				}
				else if(noOfCompetitions<0) {//condition if there is no comp then it sets the fee to 0
					compFee=0.00;
					}	
			System.out.println("  	Plan Fee:                 $"+df.format(tPlan.cost()));
			System.out.println("  	Private Hours:            $"+df.format(((noOfHours*9.00)*4)));
			System.out.println("  	Competition Entry Fee:    $"+df.format(compFee));
			System.out.println("Monthly Total Fees:               $"+df.format(tPlan.cost()+((noOfHours*9.00)*4.00)+(compFee)*4.00));
			System.out.println("===================================================================");
		addAthlete();	
		}
		//option to add the athlete
		public void addAthlete() {
		    String answer;
		    String answeropt;
		    
		    while(true) {
		        System.out.println("\t [A] Add Athlete \t [B] Input Again ");
		        answer = scan.next();

		        if(answer.equalsIgnoreCase("a")) {
		            athl.add(new RegisteredAthletes(athleteName, trainPlan, Weight, WeightCategory, noOfCompetitions, noOfHours));
		            System.out.println("Athlete Registered Successfully!");
		            
		            while(true) {
		                System.out.println("[V] View List of Athlete \t [R] Register Again");
		                answeropt = scan.next();

		                if(answeropt.equalsIgnoreCase("v")) {
		                    registeredAthletes();
		                    break;
		                } else if(answeropt.equalsIgnoreCase("r")) {
		                    registerAthlete();
		                    break;
		                } else {
		                    System.out.println("!!! Invalid Input !!!");
		                    scan.nextLine();
		                }
		            }
		        } else if(answer.equalsIgnoreCase("b")) {
		            System.out.println("Input again.");
		            registerAthlete();
		            break;
		        } else {
		            System.out.println("!!! Invalid Input !!!");
		        }
		    }	
		}

		ArrayList<RegisteredAthletes> athl = new ArrayList<RegisteredAthletes>();
		//method for the registered athletes		
		public void registeredAthletes() {
			System.out.println("===================================================================");
			System.out.println("Registered Athletes:");
			System.out.println(" ");
		    //registered athletes 
		    athl.add(new RegisteredAthletes("Alex", "Intermediate", 98.5, "Light Heavyweight", 2, 5));
		    athl.add(new RegisteredAthletes("Bob", "Elite", 110.6, "Heavyweight", 3, 5));
		    athl.add(new RegisteredAthletes("Charlie", "Elite", 96.4, "Light Heavyweight", 1, 0));
		    athl.add(new RegisteredAthletes("Danny", "Beginner", 60.5, "Flyweight", 0, 0));
		    athl.add(new RegisteredAthletes("Edward", "Elite", 105.7, "Heavyweight", 2, 5));
		    athl.add(new RegisteredAthletes("Frank", "Intermediate", 86.2, "Middleweight", 1, 5));
		displayChosenAthlete();//it will go to the display athlete method
		}
		public void displayChosenAthlete() {//it will pick the chosen athlete
			Scanner input = new Scanner(System.in);
			 boolean found = false;
			 for(int i = 0; i < athl.size(); i++) {
	                System.out.println((i+1) + ": " + athl.get(i).getathleteName());
	            }
			 System.out.println(" ");
		        while (!found) {//lets the user input again if they inputted wrong
		            System.out.println("Choose athlete to view their full information (enter the name):");
		            String answer = input.nextLine();

		            DisplayRegisteredAthletes display = new DisplayRegisteredAthletes();

		            for(int i = 0; i < athl.size(); i++) {//let the user choose the name from the arraylist
		                if(answer.equalsIgnoreCase(athl.get(i).getathleteName())) {
		                    display.Display(athl.get(i));
		                    found = true;
		                    break;
		                }
		            }

		            if(!found) {//if not found it will let the user input again
		                System.out.println("!!! Please choose from the list !!!");
		            }
		        }
		    }
}	
	
	
	
	

