package states.quiz;

public class SwitchTheIndexes {
	boolean switchTheIndexes(String word1, String word2) {
	    int length1;
	    int length2; 
	    int shortest;
	    String sub1;
	    String sub2;
	    boolean wordOneIsShort;

	    //convert each word to lowercase strings without spaces  
	    word1 = word1.toLowerCase();
	    word2 = word2.toLowerCase();
	    word1 = word1.join("",(word1.split(" ")));
	    word2 = word2.join("",(word2.split(" ")));    
	    
	    length1 = word1.length();
	    length2 = word2.length();
	    
	    //determines the shortest word
	    if (length1<length2) {
	      shortest = length1;      
	      wordOneIsShort=true;
	    }
	    else {
	      shortest = length2;      
	      wordOneIsShort=false;
	    }

	    /*Get the substrings for each,
	    based on the length of the shortest word. */
	    sub1 = word1.substring(0,shortest);
	    sub2 = word2.substring(0,shortest);
	    
	    /*If the words are of different length,
	    and the substrings are equal, if word1 is shortest,
	    return false, (don't switch indexes), if word 2 is shortest,
	    then return true, (switch indexes).

	    If the words are of the same length, if word 1 is less or 
	    equal to 0, return false, (don't switch indexes)
	    else return true, (switch indexes)  
	     */
	    if (length1 != length2) {
	      if (sub1.compareTo(sub2)==0) {      
	        
	        if (wordOneIsShort) {
	          return false;
	        } else {
	          return true;
	        }  

	      } else if (sub1.compareTo(sub2)<0) {
	        return false;
	      } else {
	        return true;
	      }

	    } else {
	      if (word1.compareTo(word2)<=0) {
	        return false;
	      } else {
	        return true;
	      }
	    }

	      
	  }
}
