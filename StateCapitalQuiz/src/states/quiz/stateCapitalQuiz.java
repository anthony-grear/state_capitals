package states.quiz;
import java.util.Arrays;

public class stateCapitalQuiz {
	
	public static void printArray(String[][] arr) {
		for (int i = 0 ; i<50;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static void main(String[] args) {
		
		StatesAndCaps st = new StatesAndCaps();
		String[][] byStates;
		
		//Get 2D array, sorted by state (ascending)
		byStates = st.sortedByStates();
		printArray(byStates);
		
		
		SwitchTheIndexes s = new SwitchTheIndexes();
		System.out.println(s.switchTheIndexes("New York","New Jersey"));
	}
		
		
}	

