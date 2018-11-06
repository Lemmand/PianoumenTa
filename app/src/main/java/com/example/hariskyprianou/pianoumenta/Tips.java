package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void tipsFoFemale(View view){
        TextView txtsex = (TextView) findViewById(R.id.txtSex);
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
        TextView txt4 = (TextView) findViewById(R.id.txt4);

        txtsex.setText("4 Tips For Successfully Aproach Men");
        txt1.setText("1. Smile at a man you’re attracted to and make eye contact.");
        txt2.setText("2. Get his attention by asking him a question");
        txt3.setText("4. Listen to what a man is saying to you.");
        txt4.setText("5. Take a cue from one of our favorite television shows.");
        txtsex.setTextColor(Color.parseColor("#983351"));
        txt1.setTextColor(Color.parseColor("#983351"));
        txt2.setTextColor(Color.parseColor("#983351"));
        txt3.setTextColor(Color.parseColor("#983351"));
        txt4.setTextColor(Color.parseColor("#983351"));

    }
    public void tipsFoMale(View view){
        TextView txtsex = (TextView) findViewById(R.id.txtSex);
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
        TextView txt4 = (TextView) findViewById(R.id.txt4);

        txtsex.setText("4 Tips For Successfully Aproach Women");
        txt1.setText("1. Smile. That one’s easy.");
        txt2.setText("2. Approach right away.");
        txt3.setText("3. Use relaxed, confident body language.");
        txt4.setText("4. It doesn’t matter who she is with. Attractive women rarely do things alone.");
        txtsex.setTextColor(Color.parseColor("#303C74"));
        txt1.setTextColor(Color.parseColor("#303C74"));
        txt2.setTextColor(Color.parseColor("#303C74"));
        txt3.setTextColor(Color.parseColor("#303C74"));
        txt4.setTextColor(Color.parseColor("#303C74"));

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.tips_menu, menu);
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
        else if(id == R.id.Settings){
            Intent i2=  new Intent(this, Settings.class );
            startActivity(i2);
        }
        else if(id == R.id.Home)
        {
            Intent i2=  new Intent(this, InterestsPage.class );
            startActivity(i2);
        }

        return super.onOptionsItemSelected(item);
    }

}
