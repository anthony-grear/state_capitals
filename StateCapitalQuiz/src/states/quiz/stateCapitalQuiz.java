package states.quiz;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class stateCapitalQuiz {
	
	public static void printArray(String[][] arr) {
		for (int i = 0 ; i<50;i++) {
			System.out.println(" "+Arrays.toString(arr[i]));
		}
		System.out.println("\n");
	}
	
	public static void makeHashMap(String[][] arr) {
		HashMap<String,String> hm = new HashMap<String,String>();
		for (int i =0;i<50;i++) {
			hm.put(arr[i][0], arr[i][1]);			
		}
		for (String i: hm.keySet()) {
			System.out.println(i + ", " + hm.get(i));
		}
	}
	
	public static void getCapitalCities(String[][] arr) {
		HashMap<String,String> hashmap = new HashMap<String,String>();
		for (int i =0;i<50;i++) {
			hashmap.put(arr[i][1], arr[i][0]);			
		}
		
		boolean run=true;
		while (run) {
			System.out.println("Welcome to the US State Capital City Generator!\n1. Generate Capital City\n2. Exit\n");				
			Scanner sc = new Scanner(System.in);
			String userInput = sc.nextLine().toLowerCase();
			userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
			switch (userInput) {
			case "1":
				System.out.println("Enter a state: ");
				userInput = sc.nextLine().toLowerCase();
				userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
				System.out.println(hashmap.get(userInput)+"\n");
				break;
			case "2":
				run = false;
				break;
			}		
		}
	}
	
	public static void makeTreeMap(String[][] arr) {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		for (int i =0;i<50;i++) {
			tm.put(arr[i][1], arr[i][0]);			
		}
		Set s = tm.entrySet();
		
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getValue()+", "+me.getKey());
		}
		
	}
	
	public static void main(String[] args) {
		String choice = null;
		StatesAndCaps st = new StatesAndCaps();
		String[][] arr;
		String[][] byCapitals=null;
		String[][] byStates = null;		
		boolean run = true;
		String pause=null;
		
		arr = st.importList();
		BubbleSort bbbl = new BubbleSort();
		byCapitals = bbbl.sortByCapitals(arr);
//		printArray(byCapitals);
//		
		
//		printArray(byCapitals);
//		printArray(byStates);
		while (run) {
			System.out.println("Choose:\n1. Print imported array.\n2. Sort by Capital City "
					+ "\n3. Sort by State\n4. Quiz\n5. Make HashMap"
					+ "\n6. Make TreeMap\n7. Capital City Generator\n8. Exit\n");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				arr = st.importList();
				System.out.println(" US States and Capital Cities Imported From CSV File\n-----------------------------------------------------");
				printArray(arr);
				System.out.println("\nPress enter to continue.\n");
				pause = sc.nextLine();				
				break;
			case "2":				
				byCapitals = bbbl.sortByCapitals(arr);
				System.out.println(" US States in Ascending Order by Capital City\n---------------------------------------------");
				printArray(byCapitals);
				System.out.println("\nPress enter to continue.\n");
				pause = sc.nextLine();
				break;
			case "3":				
				BubbleSort bbbl2 = new BubbleSort();
				byStates = bbbl2.sortByStates(byCapitals);
				System.out.println(" US States in Ascending Order by State\n---------------------------------------");
				printArray(byStates);
				System.out.println("\nPress enter to continue.\n");
				pause = sc.nextLine();
				break;
			case "4":
				Quiz q = new Quiz();
				q.startQuiz();
				break;
			case "5":
				makeHashMap(arr);
				System.out.println("\nPress enter to continue.\n");
				pause = sc.nextLine();
				break;
			case "6":
				makeTreeMap(arr);
				System.out.println("\nPress enter to continue.\n");
				pause = sc.nextLine();
				break;
			case "7":
				getCapitalCities(arr);
				break;
			case "8":
				System.out.println("Exit Program.\nGoodbye!");
				run = false;
				break;
			}
		}	
		
	}
		
		
}	

