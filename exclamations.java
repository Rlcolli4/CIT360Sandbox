
public class exclamations implements Runnable {
	
	//The following code will produce Exclamations throughout the other code.
	public void run() {
		//The following code details what this thread will "exclaim" during the code...
		for (int answer = 42; answer > -1;) {
			if (answer > 21) {
				System.out.println("The Answer is " + answer + "!");
				answer = answer - 3;
			}else if (answer == 21) { //THIS CODE CANNOT BE SET TO LESS THAN 1, 0 or anything!... It causes an infinite printing loop that stops the other code from running...
				System.out.println("The Answer is " + answer + "!");
				System.out.println("Stop shouting we are trying to go through the months!");
				answer = answer - 3;
			} else {
				break;
				//We don't care if it does anything here...
			}
			
			try {//Another try catch to make the code rest...
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//again currently do nothing with the catch...
			} //if this code was outside the thread loop it would only work once and run everything before allowing ThreadTest to continue.
		}
	}
	//Now head back to ThreadsRunnablesExecutorsHandlers to see what it will do!
}
