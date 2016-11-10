package JSONExamples;

import org.json.simple.JSONArray;
import org.json.simple.parser.*;

public class Decoding {
	public static void main(String[] args) {
		//This creats read only access to our JSON Data.
		JSONParser parser = new JSONParser();
		//This creates a string we will parse into a JSONArray.
		String aString = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		
		try {
			//This parses the numberString into the JSONParser
			Object numbers = parser.parse(aString);
			/*
			 * This array builder builds our immutable JSON array of 0 to more values.
			 * It reads from our parsed string on the line before. It parses at every comma. 
			 */
			JSONArray arrayN = (JSONArray)numbers;
			/*
			 * After building the array, we can print it out by positions!
			 * The following will print out the second item in our array.
			 */
	         System.out.println("The 2nd element of array " + arrayN.get(1));
		}catch(Exception e){
			System.out.println("Oh no! Something went wrong!");
		}
	}
}
