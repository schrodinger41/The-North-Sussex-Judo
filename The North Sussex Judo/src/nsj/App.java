package nsj;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	App print = new App();
	print.welcome();
	}
	//welcome display
	public void welcome() {
			System.out.println("	       !!!!WELCOME TO NORTH SUSSEX JUDO!!!!                    ");
			System.out.println("===================================================================");
			System.out.println("TRAINING PLAN                                         Prices ($USD)");
			System.out.println(" ");
			System.out.println("1. Beginner (2 sessions per week------------------weekly fee $25.00");
			System.out.println("2. Intermediate (3 sessions per week)-–-----------weekly fee $30.00");
			System.out.println("3. Elite (5 sessions per week)--------------------weekly fee $35.00");
			System.out.println("Private tuition--------------------------------------per hour $9.00");
			System.out.println("Competition entry fee------------------------per competition $22.00");
			System.out.println("===================================================================");
			System.out.println("                      WEIGHT CATEGORIES                 S       (KG)");
			System.out.println(" ");
			System.out.println("1. Heavyweight---------------------------------------------over 100");
			System.out.println("2. Light-Heavyweight--------------------------------------------100");
			System.out.println("3. Middleweight--------------------------------------------------90");
			System.out.println("4. Light-Middleweight--------------------------------------------81");
			System.out.println("5. Lightweight---------------------------------------------------73");
			System.out.println("6. Flyweight-----------------------------------------------------66");
			System.out.println("===================================================================");
			System.out.println("                          CONDITIONS                               ");
			System.out.println(" ");
			System.out.println("• A maximum of five hours private coaching per week only.          ");
			System.out.println("• Only Intermediate and Elite athletes can enter competitions.     ");
			System.out.println("• Competitions are held on the second Saturday of each month.      ");
			System.out.println("===================================================================");
			choice();
		}
	public void choice() {
		Athlete go = new Athlete();
		String answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("\t [A] Add new Athlete \t [B] View Registered Athletes ");
		while(true) {
		answer = scan.nextLine();	
			if (answer.equalsIgnoreCase("a")) {
				go.registerAthlete();
				break;
			}
			else if(answer.equalsIgnoreCase("b")) {
				go.registeredAthletes();
				break;
			}
			else {
				System.out.println("!!! Invalid Input !!!");
			}
		}
	}
}
