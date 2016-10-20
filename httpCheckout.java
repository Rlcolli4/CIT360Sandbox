/*
 * The following code is very important! If you don't import the .io and the .net packages, you will be 
 * unable to execute the necessary code in this applicatoin.
 */
import java.net.*;
import java.io.*;


public class httpCheckout { //HttpURLConnection replaced the depricated httpClient function.
	public static void main(String args[]) throws Exception { //We throw an exception just in case aWebPage gives us any problems.
		//The next line of code creates the object and then stores the data we need to access a web page.
		URL aWebPage = new URL("https://www.lds.org/?lang=eng");
		
		//now we will communicate with the web page by opening a connection.
		HttpURLConnection letsSee = (HttpURLConnection) aWebPage.openConnection();
		
		//This line of code reads in our above object as it goes into the buffer using our connection
		BufferedReader BringItIn = new BufferedReader(new InputStreamReader(letsSee.getInputStream()));
		
		//Now let's go ahead and print out the values. We will start by creating an string variable for a while loop.
		String httpCode; //we make this code so that we can read the code in from the buffer and print it out on our site.
		
		
		while((httpCode = BringItIn.readLine()) != null) //IE as long as there is code to bring in, run this string.
				{
			    /*the following codes can check to see if the httpCode holds anything. 
			     * This would be helpful in printing a string before doing the work. For our if statement,We will use .isEmpty() four our list.
			    System.out.println(httpCode.equals(httpCode)); //This prints true because we are reading lines into here.
				System.out.println(httpCode.equals(BringItIn)); //This prints false because we are not reading anything into it.
			     */
				//Commented out becuase it defeats the puprose of the if statement below, but you coudl print this in debugging.
				//System.out.println(httpCode.isEmpty()); //This code can also be used to create a simpler statement making sure that the code we read into is not empty or false.
				/*
				 * The above code can be used to produce an if statement that will only print the code if
				 */
				if (httpCode.isEmpty() != true) {
					System.out.println(httpCode);
				} else {
					System.out.println("This is a blank space.");
				}
				//As this prints out we will be able to see the HTML code for a web site including the head information and
				//any scripts loaded on the page. However, it will not print external style and coding sheets.
				}
		//After we've got all the code, we close our session.
		BringItIn.close(); // notice you can close what you started in letsSee with the variable we stored it in.
		
	}
}
