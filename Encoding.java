package JSONExamples;
//JSON simple library
import org.json.simple.JSONObject;
//First we need to import that package that allows us to work with JSON Objects.

public class Encoding {
	
	public static void main(String[] args){
		JSONObject studentInfo = new JSONObject(); //This creates teh JSON object to read our values into.
	
		//Here we use the .put method to fill in the JSONObject for studentInfo!
		studentInfo.put("firstName", "Robert");
		studentInfo.put("lastName", "Collins");
		studentInfo.put("studentId", "12-345-6789");
		studentInfo.put("studentStatus", "Senior");
		studentInfo.put("totalCredits", "106");
	
		//This line of code will output the JSONObject for the student.
		System.out.println(studentInfo);
	}
}
