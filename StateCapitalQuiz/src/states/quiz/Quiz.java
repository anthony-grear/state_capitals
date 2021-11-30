package states.quiz;
import java.util.Scanner;

public class Quiz {
	
	public void startQuiz() {
		String[][] arr;
		StatesAndCaps st = new StatesAndCaps(); 
		arr = st.importList();
		int count=0;
		int correct=0;
		String userResponse;
		int choice1 = 0;
		int choice2 = 1;
		String question = null;
		
		//prompt the user, convert input to lowercase
		System.out.println("Welcome to the US States and Capitols Quiz\n\n"
				+ "1. State Capitals Quiz"
				+ "\n2. States Quiz\n\n   or Enter Quit to Exit\n");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine().toLowerCase();
		
		//assign the question format for the quiz that was chosen
		if (userInput.equals("1")) {
			choice1 = 1;
			choice2 = 0;
			question = "What is the capital city of " ;
		} else if (userInput.equals("2") ) {
			choice1 = 0;
			choice2 = 1;
			question = " is the capital of what state?";
		} else if (userInput.equals("quit")) {
			count = 50;
		}
		
		//loops until all 50 questions are complete or the user types quit
		while (count!=50) {
			if (userInput.equals("1")) {
				System.out.println(question + arr[count][choice1]+"?");
			}
			if (userInput.equals("2")) {
				System.out.println(arr[count][choice1]+question);
			}
			userResponse = sc.nextLine();
			userResponse = userResponse.toLowerCase();
			String correctString = String.valueOf(correct);
			if (userResponse.equals("quit")) {
				System.out.println("Thank you for playing.\nYour total score: " + correctString);
				System.out.println("Press enter to continue.");
				Scanner scan = new Scanner(System.in);
				String pause = scan.nextLine();
				break;
			}
			if (arr[count][choice2].toLowerCase().equals(userResponse) ) {
				correct++;
				correctString = String.valueOf(correct);  
				System.out.println("You are correct.\nTotal Score: "+ correctString);
				
				
			} else {
				System.out.println("You are incorrect");
			}
			count++;
		} 
	}
}
