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
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.changepass_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.back) {
            Intent i2=  new Intent(this, Settings.class );
            startActivity(i2);

        }

        return super.onOptionsItemSelected(item);
    }

    public void sendFeedback(View view){
        EditText e1 = (EditText) findViewById(R.id.editText);
        String feedback = e1.getText().toString();

        TextView t1 = (TextView) findViewById(R.id.thankyou);

        if(!feedback.matches("")){
            e1.setText("");
            t1.setVisibility(View.VISIBLE);

        }
    }
    public void cancel (View view){
        finish();
    }

    public void rateApp(View view){
        RatingBar rate = (RatingBar) findViewById(R.id.ratingBar);
        double stars = rate.getRating();

        Toast.makeText(getApplicationContext(), "Thank you for your rating.\n Rating: "+stars +"/6", Toast.LENGTH_LONG).show();

    }

}
