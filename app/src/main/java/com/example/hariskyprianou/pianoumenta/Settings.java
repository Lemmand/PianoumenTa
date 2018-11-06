package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

    public void delete(View view){
        Toast.makeText(getApplicationContext(), "Account Deletion Started.", Toast.LENGTH_LONG).show();
        Intent i1 = new Intent (this, MainActivity.class);
        startActivity(i1);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.EditProfile) {
            Intent i2=  new Intent(this, EditProfile.class );
            startActivity(i2);

        }
        else if(id==R.id.Preferences){

        }
        else if(id == R.id.Home){
            Intent i2=  new Intent(this, InterestsPage.class );
            startActivity(i2);

        }
        else if(id==R.id.Tips)
        {

        }

        return super.onOptionsItemSelected(item);
    }

    public void openFeedback(View view){
        Intent feedback = new Intent (this, Feedback.class);
        startActivity(feedback);
    }

    public void openAboutUs(View view){
        Intent feedback = new Intent (this, aboutus.class);
        startActivity(feedback);
    }

    public void logout(View view){
        Intent feedback = new Intent (this, MainActivity.class);
        startActivity(feedback);
    }

    public void setSwitch(View view){
        Switch sw = (Switch) findViewById(R.id.switch1);
        if(sw.isChecked())
        {
            getSupportActionBar().hide();
        }
        else{
            getSupportActionBar().show();
        }

    }

}
