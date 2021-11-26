package states.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StatesAndCaps {
	String[][] getStatesAndCaps() {
	String line = "";  
	String splitBy = ",";
	int count=0;
	int counter=0;
	String[][] statesAndCaps = new String[50][2];
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell_E5400\\git\\state_capitals\\StateCapitalQuiz\\src\\states\\quiz\\list-state-capitals-us-764j.csv"));
	
		while ((line = br.readLine()) != null ) {
			String[] entry = line.split(splitBy);
			if (count>1 && count<52) {
				statesAndCaps[counter][0]=entry[4];
				statesAndCaps[counter][1]=entry[1];
				counter++;
			}
			count++;
		} return statesAndCaps;
		}		
	catch (IOException e) {
			e.printStackTrace();
	}
	return null;
	}
}