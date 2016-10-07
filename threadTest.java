public class threadTest extends Thread {
	//NOTE by using "extend Thread" you are making threadTest a sublcass of Thread, meaning it can't extend or use anythign else...
	//Begin first thread using the run() portion of the Thread class.
	public void run() {
		// This thread will run a for loop that will count the months out. 
		for (int counter = 1; counter < 13; counter++){
			String monthOfYear;
			switch (counter){
			case 1: monthOfYear = "January";
			System.out.println(monthOfYear);
			System.out.println("My Birthday is in January!");
			break;
			case 2: monthOfYear = "February";
			System.out.println(monthOfYear);
			System.out.println("My Sister's Birthday is in February!");
			break;
			case 3: monthOfYear = "March";
			System.out.println("March!");
			System.out.println("Two of my Brothers' Birthdays are in March!");
			break;
			case 4: monthOfYear = "April";
			System.out.println(monthOfYear);
			break;
			case 5: monthOfYear = "May";
			System.out.println(monthOfYear);
			break;
			case 6: monthOfYear = "June";
			System.out.println(monthOfYear);
			break;
			case 7: monthOfYear = "July";
			System.out.println(monthOfYear);
			break;
			case 8: monthOfYear = "August";
			System.out.println(monthOfYear);
			break;
			case 9: monthOfYear = "September";
			System.out.println(monthOfYear);
			System.out.println("My Sister and Father Have Birthdays Here!");
			break;
			case 10: monthOfYear = "October";
			System.out.println("My Mom's Birthday is in October!");
			System.out.println(monthOfYear);
			break;
			case 11: monthOfYear = "November";
			System.out.println(monthOfYear);
			break;
			case 12: monthOfYear = "December";
			System.out.println(monthOfYear);
			System.out.println("My Sister has a Birthday in December!");
			System.out.println("ALSO CHRISTMAS IS IN DECEMBER :D");
			break;
			}
			try { //after we have written our code for the threads, we need to write a try block
				//Just in case something happens with the thread when run.
				Thread.sleep(2000); //this tells the thread to sleep so that it can gather information needed before running again.
			} catch(InterruptedException e) {
				//For now I am not doing anything because if it gets interrupted, oh well...
			}
		}
	}
	//Now we need to go over to ThreadsRunnablesExecutorsHandlers to see how this will run.
}
