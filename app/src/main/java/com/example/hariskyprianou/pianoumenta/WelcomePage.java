package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        getSupportActionBar().hide();

        Intent i1= getIntent();
        Bundle userInfo = i1.getExtras();
        String message =  userInfo.getString("username");

        TextView t1 = (TextView) findViewById(R.id.usernametxt);
        t1.setText(message);


    }

    public void goPreferences(View v)
    {
        Intent myIntent = new Intent(getBaseContext(),   com.example.hariskyprianou.pianoumenta.Preferences_1.class);
        startActivity(myIntent);
    }
}
