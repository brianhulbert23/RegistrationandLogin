package com.example.registrationandlogin;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {

    Button btnLogin, btnRegisterAccount;  //Create btnLogin, btnRegisterAccount variables
    EditText etEmailAddress, etPasswordInput; //Create etEmailAddress, etPasswordInput variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmailAddress = (EditText) findViewById(R.id.etEmailAddress); //Initalize etEmailAddress
        etPasswordInput = (EditText) findViewById(R.id.etPasswordInput); //Initialize etPasswordInput
        btnLogin = (Button) findViewById(R.id.btnLogin); //Initialize btnLogin
        btnRegisterAccount = (Button) findViewById(R.id.btnRegisterAccount); //Initialize btnRegister account

        final Button button = findViewById(R.id.btnLogin); //Declare button as final for btnLogin for the onClickListener
        button.setOnClickListener(new View.OnClickListener() { //setOnClickListener for when the button is clicked
            public void onClick(View v) { //Create onClick method for the passwordMatcher and EmailMatcher to run if the onClick is activated.

                private void passwordMatcher (String password)
                { //Declare a new method for the passwordMactcher to do a certain certan activity when the password field is
                    // either empty or matches the password
                    password = etPasswordInput.getText().toString(); //Convert password into a string
                    if (!password.isEmpty() && password.matches(password)) { //If the password field is not empty and the password matches password
                        Intent intent1 = new Intent(this, Welcome.class); //Create a new intent to go to the welcome page of the app.
                        startActivity(intent1); //Move to welcome page when these conditions are met.
                    }
                }
            }

    protected void emailMatcher(String email) { //Declare a new method for the emailMatcher to do aa certain activity when the email field is either empty or matches the email.
        email = etEmailAddress.getText().toString(); //Convert email into a string
        if (!email.isEmpty() && email.matches(email)) { // If the email feild is not empty and the password matches email.
            Intent intent2 = new Intent(this, Welcome.class); //Create a new intent2 to go to the welcome page of the app
            startActivity(intent2); //Move to the welcome page when these conditions are met.

            final Button button2 = findViewById(R.id.btnRegisterAccount); //Declare button2 as final for btnRegisterAccount for the onClickListnener.
            button2.setOnClickListener(new View.OnClickListener() { //Set onClickListener for when button2 is clicked.

                public void onClick(View v) { //Create onClick method so the passwordMatcher and EmailMatcher methods can take the names password and email and store them in the login
                    // after registration is made.
                    Intent intent = getIntent(); //Get intent
                    String password = ""; //Set password as a string with no characters
                    String str = intent.getStringExtra("Password"); //Get password from registration page and store it into Login page.
                    passwordMatcher(password); //Call the passwordMatcher method.
                    String emailAddress = intent.getStringExtra("Email"); //Get email from registration page ands store it into the login page.
                    emailMatcher(email); //Call the emailMatcher method.

                };

                public void onClick(View v) { //Create onClick so when the register button is clicked, it will go to the registration page.
                    Intent intent3 = new Intent(this, Register.class); //Create a new intent3 to go to the registration page of the app.
                    startActivity(intent3); //Move to the registration page of the app.
                }

                String email = etEmailAddress.getText().toString(); //Convert email into a string.

        if(!email.isEmpty()&&Patterns.EMAIL_ADDRESS.matcher(email).matches()) { //If the email field is not empty and the EMAIL_ADDRESS pattern matches the email

                    Toast.makeText(getApplicationContext(), "Login successful.  Please enter a valid email address.", Toast.LENGTH_LONG); //Display a toast for when the email
                    //entered meets the specified conditions.

                }
            });
        }


        else

                { //else do something else
                    Toast.makeText(getApplicationContext(), "Login Unsuccssful", Toast.LENGTH_SHORT); //Display a toast for when the email does not meet the specified conditions.
                };
            });