import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadsRunnablesExecutorsHandlers {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// We will start by creating a Thread that calls our ThreadTest.
		Thread getMonths = new threadTest();
		
		//This will call our exclamations from Runnable for us...
		Runnable shouts = new exclamations();
		
		System.out.println(new Thread(shouts).getPriority()); //This code will help us see the exclamations priority
		System.out.println(getMonths.getPriority()); //Same thing as above for my thread.
		//Both will print 5, which is the normal priority. We can set one to a higher priority (10) or lower (1)
		
		//The .start will get the months item from there.
		getMonths.start();
		//You will notice it prints slowly because the "sleep(2000)" item we put in there delays printing by 2 seconds.
		
		//The following will begin shouting at us while we are working on the months...
		//You need to tell the code it is a new thread so it can use it.
		new Thread(shouts).start(); //Note I will still have to create a new Thread with shouts when I want to use it a second time...
		
		//This code will "suspend" both threads from running in the background while they work.
		//This is because technically both threads are still running the loops in their threads.
		//getMonths.suspend(); This is commented out because running it will stop the getMonths thread entirely. You should do it is a try catch.
		try {
			getMonths.suspend();
			System.out.println("getMonths is taking a break");
			getMonths.resume();//This code tells the getMontsh to resume function.
			//This will resume shortly after the priority changes below.
			//These codes are depracated and there is not a gaurantee your codes can work with it...
		} catch (Exception e) {
			System.out.println("Huh, weird...");
		}
		
		//Now we will change thread priorities...
		getMonths.setPriority(10); //Highest priority.
		new Thread(shouts).setPriority(1); //Lowest priority.
		
		System.out.println(new Thread(shouts).getPriority());
		System.out.println(getMonths.getPriority());
		//Notice only getMonths had a priority change, the newThread did not! that is because there is no constructor in "exclamations"
		//this is also the reason we need to keep recreating it with the "new" in order to do it and so it keeps getting a new set up...
		
		/*
		 * Executors
		 * The following works with runnables to create a thread pool that will save CPU power.
		 * This code should be commented out before doing the above code...
		 */
		Executor letsRunAnExecutor = Executors.newCachedThreadPool(); //This creates an executor that will run from the thread pool if available.
		for (int counterFor = 0; counterFor < 2; counterFor++) {
			Runnable shoutsTwo = new exclamations(); //we are creating a new thread to run from exclamations.
			Thread getMonthsTwo = new threadTest();	//Also a new one from getMonths.
			letsRunAnExecutor.execute(shoutsTwo);
			letsRunAnExecutor.execute(getMonthsTwo);
		} try {
			Thread.sleep(5000);
			System.out.println("I HAVE AWAKENED");
			Runnable shoutsTwo = new exclamations(); //we are creating a new thread to run from exclamations.
			Thread getMonthsTwo = new threadTest();	//Also a new one from getMonths.
			letsRunAnExecutor.execute(shoutsTwo);
			letsRunAnExecutor.execute(getMonthsTwo);
		} catch (InterruptedException e) {
			System.out.println("You Messed it Up!");
			e.printStackTrace(); //This prints out the StackTrace when something goes wrong!
		}

	}

}
