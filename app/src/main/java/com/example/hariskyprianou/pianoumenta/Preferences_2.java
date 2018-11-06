package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

import com.example.hariskyprianou.pianoumenta.R;

public class Preferences_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                CheckBox thriller = (CheckBox)findViewById(R.id.chk_movie_thriller3);
                CheckBox comedy = (CheckBox)findViewById(R.id.chk_movie_comedy3);
                CheckBox horror = (CheckBox)findViewById(R.id.chk_movie_horror3);
                CheckBox drama = (CheckBox)findViewById(R.id.chk_movie_drama3);
                CheckBox romance = (CheckBox)findViewById(R.id.chk_movie_romance);
                CheckBox action = (CheckBox)findViewById(R.id.chk_movie_action3);


                CheckBox country = (CheckBox)findViewById(R.id.chk_music_country3);
                CheckBox metal = (CheckBox)findViewById(R.id.chk_music_metal3);
                CheckBox pop = (CheckBox)findViewById(R.id.chk_music_pop3);
                CheckBox rnb = (CheckBox)findViewById(R.id.chk_music_rnb3);
                CheckBox greek = (CheckBox)findViewById(R.id.chk_music_greek3);
                CheckBox music_other = (CheckBox)findViewById(R.id.chk_music_other3);


                if (thriller.isChecked() == false && comedy.isChecked()==false && horror.isChecked()==false && drama.isChecked()==false && romance.isChecked()==false
                        && action.isChecked()==false)
                {
                    Snackbar.make(view, "Please Select A Movie Preference", Snackbar.LENGTH_LONG)
                            .setAction("ShowInfo",null).show();

                } else

                if (country.isChecked() == false && metal.isChecked()==false && pop.isChecked() == false && rnb.isChecked() == false
                        && greek.isChecked()==false && music_other.isChecked()==false)
                {

                    Snackbar.make(view, "Please Select A Music Preference", Snackbar.LENGTH_LONG)
                            .setAction("ShowInfo",null).show();
                } else
                {
                    Intent myIntent = new Intent(getBaseContext(),   com.example.hariskyprianou.pianoumenta.InterestsPage.class);
                    startActivity(myIntent);
                }


            }
        });
    }

}

