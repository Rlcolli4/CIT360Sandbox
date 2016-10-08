package com.example.rg3.androidhandlersprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.*;

public class MainActivity extends AppCompatActivity {

    Thread thread; //Initializes the Thread Class.
    Handler handler; //Initializes Android Handlers


    ProgressBar progressBar; //This builds a reference to our progressBar in the activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thread = new Thread(new ProgressBar());
        thread.start(); //run the code in the ProgressBar runnable.

        handler = new Handler() { //This creates the initialized handler for use in the main class.
            // This allows us to use the handler in the runnable to pass messages between the two.
            @Override
            public void handleMessage(Message msg){ //this takes the message from the runnable and applies it.
                progressBar.equals(msg.arg1);
            }
        };
    }

    class ProgressBar implements Runnable {//Here is the runnable we will use for the progress bar

        @Override
        public void run(){
            Message message=Message.obtain();//This is used to obtain the message that
            // will be run below and passed above.
            //This for loop will update the progress bar over time.
            for (int progress = 0; progress < 100; progress += 10 ) {
                message.arg1 = progress;
                handler.sendMessage(message);
            }
        }
    }
}
