package com.example.registrationandlogin;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash<SplashScreen, secondsDelayed> extends AppCompatActivity {

    int secondsDelayed; //create secondsDelayed variable.

    public void splash() { //Create splash method so the screen is able to redirect to the login page of the app.
        Intent intent = new Intent(this, Login.class); //Create a new intent to go to the Login page of the app.
        startActivity(intent); //Move to the Login page of the app.
    }
    private TextView mTextView; //Create mTextView variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        mTextView = (TextView) findViewById(R.id.text); //Initialize the mTextview variable

        int SecondsDelayed = 1; //Initialize int SecondsDelayed to 1
        Handler activity = new Handler(); //Create a new handler
        activity.postDelayed(new Runnable() { //Create Runnable object to allow to execute the run method.
            @Override
            public void run() { // Create run so when the splashscreen is opened, it will then go to the Login page of the app.
                startActivity(new Intent(Splash.this, Login.class)); //Move from the splash screen to the login screen once the splash screen is loaded.
                finish(); //Finish loading login screen after going to the splash screen.

            }
        }, secondsDelayed * 1000); //Mlutiply the seconds delayed by 1000.



    }
}

