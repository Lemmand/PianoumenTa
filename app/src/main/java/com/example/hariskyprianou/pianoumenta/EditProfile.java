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

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    protected void changePass(View view)
    {
        Intent intent = new Intent(this, changePass.class );
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.editprofile_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Settings) {
            Intent i2=  new Intent(this, Settings.class );
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
            Intent i2=  new Intent(this, Tips.class );
            startActivity(i2);
        }

        return super.onOptionsItemSelected(item);
    }

}
