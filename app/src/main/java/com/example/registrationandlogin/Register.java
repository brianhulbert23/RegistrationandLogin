package com.example.registrationandlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {
    EditText etName, etAddress, etEmail, etPassword, etDateOfBirth; //Create etName, etAddress, etEmail, etPassword, and etDateOfBirth variable.
    Button btnRegister; //Create btnRegister variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName); //Initialize etName
        etAddress = (EditText) findViewById(R.id.etAddress); //Initialize etAddress
        etEmail = (EditText) findViewById(R.id.etEmail); //Initialize etEmail
        etDateOfBirth = (EditText) findViewById(R.id.etDateOfBirth); //Initialize etDateOfBirth
        etPassword = (EditText) findViewById(R.id.etPassword); //Initialize etPassword
        btnRegister = (Button) findViewById(R.id.btnRegister); //Initialize btnRegister
        btnRegister.setOnClickListener((View.OnClickListener) this); //Set an onClickListener for when the register button is clicked.
    }

    public void OnClick(View v) { //Create onClick so when the register button is clicked it will go to the Login page.
        if (v.getId() == R.id.btnRegister) { //If the Id is equal to R.id.btnRegister
            Intent intent = new Intent(this, Login.class); //Create a new intent to go to the login page of the app.
            startActivity(intent); //Move to the Login page of the app.
        }
        if (etName.length() <= 3 || etName.length() >= 30) { //If the etName length is less than or eqaul to 3 characters or the etName length is greater than or equal to 30

            Toast.makeText(getApplicationContext(), "Invalid Name.  The name must be a minimum of 3 characters and a maximum of 30 characters.", Toast.LENGTH_LONG); //Make a toast to display that the amount of characters is either too little or too high.

        } else if (etName.getText().toString().isEmpty() || etAddress.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etDateOfBirth.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty()) {
            //Else if etName is converted to string and is empty, or etAddress is converted to string and is empty, or etEmail is converted to string and is empty, or etDateOfBirth
            // is converted to string and is empty.
            Toast.makeText(getApplicationContext(), "The registration is not succcessful.  Please input information into all fields.", Toast.LENGTH_LONG); //Make a toast to display that the registration is not successful.
        } else { //Else do something else

            Toast.makeText(getApplicationContext(), "Registration is successful, you will now be redirected to the login screen.", Toast.LENGTH_LONG); //Make a toast to display
            // registration is successful.
            String strPassword = ""; //Set password as a string with no characters.
            Intent intent = new Intent(this, Login.class); //Make a new intent to go to the login page of the app.
            intent.putExtra("Password", strPassword); //Create a putExtra method to allow the passwrod information to be stored as string in the Login page.
            String strEmail = ""; //Set email as a string with no characters.
            intent.putExtra("Email", strEmail); //Create a putExtra method to allow the email information to be stored as string in the Login page.
            startActivity(intent); //Move to the login page of the app if the conditions are met.
        }
    };
}




