package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public final static String USERNAME = "maria";
    public final static String PASSWORD = "123";
    public final static String SEX = "male";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        EditText txtuser = (EditText) findViewById(R.id.usernametxt);
        String input = txtuser.getText().toString();
        EditText txtpass = (EditText) findViewById(R.id.passwordtxt);
        String input2 = txtpass.getText().toString();

        Intent intent = new Intent (this, InterestsPage.class);
        if(input.equals(USERNAME) && input2.equals(PASSWORD)){
            Bundle info = new Bundle();
            info.putString("sex", SEX);
            intent.putExtras(info);
            startActivity(intent);
            finish();


        }
        else{
            Toast.makeText(getApplicationContext(), "Username or password is wrong.", Toast.LENGTH_LONG).show();

        }

    }

    public void signup(View view){
        Intent intent = new Intent (this, SignUp.class);
        startActivity(intent);

    }


}
