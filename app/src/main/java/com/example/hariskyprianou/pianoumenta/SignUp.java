package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


import org.w3c.dom.Text;

public class SignUp extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();
    }
    public void cancel(View view){

        finish();
    }

    public void next(View view){
        Intent intent = new Intent (this, WelcomePage.class);

        EditText user = (EditText) findViewById(R.id.usernametxt);
        EditText name = (EditText) findViewById(R.id.nametxt);
        EditText surname = (EditText) findViewById(R.id.surnametxt);
        EditText age = (EditText) findViewById(R.id.birthdatetxt);
        EditText email = (EditText) findViewById(R.id.emailtxt);
        EditText pass = (EditText) findViewById(R.id.passtxt);
        RadioButton male = (RadioButton) findViewById(R.id.maleradio);
        RadioButton female = (RadioButton) findViewById(R.id.femaleradio);

        String username = user.getText().toString();

        String nameS = name.getText().toString();
        String surnameS = surname.getText().toString();
        String ageS = age.getText().toString();
        String emailS = email.getText().toString();
        String passS = pass.getText().toString();

        String sex = "";
        if(male.isChecked())
            sex="male";
        else if(female.isChecked())
            sex="female";

        if(!username.matches("") && !nameS.matches("") && !surnameS.matches("") && !ageS.matches("") && !emailS.matches("") && !passS.matches("") && !sex.matches(""))
        {
            Bundle info = new Bundle();
            info.putString("username", username);
            intent.putExtras(info);
            startActivity(intent);
            finish();

        }
        else
            Toast.makeText(getApplicationContext(), "Not all fields are filled.", Toast.LENGTH_LONG).show();







    }
}

