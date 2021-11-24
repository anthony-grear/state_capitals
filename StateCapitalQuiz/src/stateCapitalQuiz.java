import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.Arrays;

public class stateCapitalQuiz {
	
	public static void main(String[] args) {
		String line = "";  
		String splitBy = ",";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell_E5400\\eclipse-workspace\\StateCapitalQuiz\\list-state-capitals-us-764j.csv"));
		
			while ((line = br.readLine()) != null) {
				String[] entry = line.split(splitBy);
				System.out.println(Arrays.toString(entry));
			}} 
		catch (IOException e) {
				e.printStackTrace();
		}
	}
		
		
}	

