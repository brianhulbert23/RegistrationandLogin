package com.example.registrationandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView tvWelcomeMsg; //Create tvWelcomeMsg variable
    Button btnLogout; //Create btnLogout variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg); //Initialize tvWelcomeMsg
        btnLogout = (Button) findViewById(R.id.btnLogout); //Initialize btnLogout

        btnLogout.setOnClickListener((View.OnClickListener) this); //Set onClickListener for when btnLogout is clicked
    }

    public void OnClick (View v) { //Create onClick method so when the logout button is clicked it will go to the Login page.

        if (v.getId() == R.id.btnLogout) { //If the id is equal to btnLogout
            Intent intent = new Intent (this, Login.class); //Create a new intent to go to the Login page of the app.
            startActivity(intent); //Move to the login page of the app.
        }

    }
}


