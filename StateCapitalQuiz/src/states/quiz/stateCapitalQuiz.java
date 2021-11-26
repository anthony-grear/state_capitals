package states.quiz;
import java.util.Arrays;

public class stateCapitalQuiz {
		
	public static void main(String[] args) {
		StatesAndCaps st = new StatesAndCaps();
		String[][] statesAndCaps;
		statesAndCaps = st.getStatesAndCaps();
		
		for (int i = 0 ; i<50;i++) {
			System.out.println(Arrays.toString(statesAndCaps[i]));
		}
		
		SwitchTheIndexes s = new SwitchTheIndexes();
		System.out.println(s.switchTheIndexes("New York","New Jersey"));
	}
		
		
}	

