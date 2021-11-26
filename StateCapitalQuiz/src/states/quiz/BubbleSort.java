package states.quiz;

public class BubbleSort {
		
	public String[][] sortByCapitals(String[][] arr) {
		String[] temp;
		for (int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length;j++) {
				SwitchTheIndexes s = new SwitchTheIndexes();
				if (s.switchTheIndexes(arr[j-1][0], arr[j][0])) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;		
	}
	
	public String[][] sortByStates(String[][] arr) {
		String[] temp;
		for (int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length;j++) {
				SwitchTheIndexes s = new SwitchTheIndexes();
				if (s.switchTheIndexes(arr[j-1][1], arr[j][1])) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;		
	}
	
}
