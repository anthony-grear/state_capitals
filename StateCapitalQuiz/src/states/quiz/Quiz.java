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
		String userResponse;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("What is the capital city of " + arr[count][1]+"?");
			userResponse = sc.nextLine();
			userResponse = userResponse.toLowerCase();
			if (arr[count][0].toLowerCase().equals(userResponse) ) {
				System.out.println("You are correct");
			} else {
				System.out.println("You are incorrect");
			}
			count++;
		} while (count!=50);
	}
}
