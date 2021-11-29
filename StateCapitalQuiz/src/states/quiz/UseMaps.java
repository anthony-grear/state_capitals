package states.quiz;
import java.util.HashMap;

public class UseMaps {
	void makeHashMap(String[][] arr) {		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		for (int i = 0; i<50;i++ ) {
			hm.put(arr[i][1],arr[i][0]);
		}
		for (String i : hm.keySet()) {
			  System.out.println(hm.get(i) + ", " + i );
			}
		System.out.println("\n");
	}		
}
