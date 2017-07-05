package murali.exams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseKeys {
	
	public static void main(String[] args) throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s = "1,2,3,4,5;3";
    
	      System.out.println(s);
	      
	      String inputs[] = s.split(";");
	      
	      int k = Integer.parseInt(inputs[1]);
	      
	      //reversedByK(inputs[0].split(","),key);
	      
	      String[] array = inputs[0].split(",");
	      
	      for (int i = 0; i + k <= array.length; i += k) {
	          for (int a = i, b = i + (k - 1); a < b; a++, b--) {
	              String swap = array[a];
	              array[a] = array[b];
	              array[b] = swap;
	          }
	      }
	      
	      System.out.println(String.join(",", array));
	    }
	  
}
