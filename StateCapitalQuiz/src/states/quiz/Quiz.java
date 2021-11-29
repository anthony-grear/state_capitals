package states.quiz;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		
		System.out.println("Welcome to the US States and Capitols Quiz\n\n"
				+ "For the state capitals quiz, enter 'caps'."
				+ "\nFor the states quiz, enter 'states'.\nEnter 'quit' to exit.");
		Scanner sc = new Scanner(System.in);
		userResponse = sc.nextLine().toLowerCase();
		
		if (userResponse.equals("caps")) {
			choice1 = 1;
			choice2 = 0;
			question = "What is the capital city of the following US state? ";
		} else if (userResponse.equals("states") ) {
			choice1 = 0;
			choice2 = 1;
			question = "To what US state does the following capital city belong? ";
		} else {
			count = 50;
		}
		
		while (count!=50) {
			System.out.println(question + arr[count][choice1]);
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
