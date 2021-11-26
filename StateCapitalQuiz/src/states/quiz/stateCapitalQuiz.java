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
		String[][] arr;
		String[][] byCapitals;
		String[][] byStates;
		
		//Import from csv file and populate 2D array, sorted by state (ascending)
		arr = st.importList();		
		printArray(arr);
		
		BubbleSort bbbl = new BubbleSort();
		byCapitals = bbbl.sortByCapitals(arr);
		printArray(byCapitals);
		byStates = bbbl.sortByStates(byCapitals);
		printArray(byStates);
		
	}
		
		
}	

