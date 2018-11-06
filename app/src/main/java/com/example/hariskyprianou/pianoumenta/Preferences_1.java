package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hariskyprianou.pianoumenta.R;

public class Preferences_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                CheckBox chk_men = (CheckBox)findViewById(R.id.chk_men);
                CheckBox chk_women = (CheckBox)findViewById(R.id.chk_women);

                CheckBox chk_nicosia = (CheckBox)findViewById(R.id.chk_nicosia);
                CheckBox chk_limassol = (CheckBox)findViewById(R.id.chk_limassol);
                CheckBox chk_larnaca = (CheckBox)findViewById(R.id.chk_larnaca);
                CheckBox chk_paphos = (CheckBox)findViewById(R.id.chk_paphos);

                CheckBox chk_20s = (CheckBox)findViewById(R.id.chk_20s);
                CheckBox chk_30s = (CheckBox)findViewById(R.id.chk_30s);
                CheckBox chk_40s = (CheckBox)findViewById(R.id.chk_40s);
                CheckBox chk_50s = (CheckBox)findViewById(R.id.chk_50s);





                if (chk_men.isChecked() == false && chk_women.isChecked()==false)
                {
                    Snackbar.make(view, "Please Select A Gender", Snackbar.LENGTH_LONG)
                            .setAction("ShowInfo",null).show();

                } else

                if (chk_nicosia.isChecked() == false && chk_larnaca.isChecked()==false && chk_limassol.isChecked() == false && chk_paphos.isChecked() == false)
                {

                    Snackbar.make(view, "Please Select An Area", Snackbar.LENGTH_LONG)
                            .setAction("ShowInfo",null).show();
                } else

                if (chk_20s.isChecked() == false && chk_30s.isChecked()==false && chk_40s.isChecked() == false && chk_50s.isChecked() == false)
                {

                    Snackbar.make(view, "Please Select An Age Group", Snackbar.LENGTH_LONG)
                            .setAction("ShowInfo",null).show();
                } else
                {
                    Intent myIntent = new Intent(getBaseContext(),   com.example.hariskyprianou.pianoumenta.Preferences_2.class);
                    startActivity(myIntent);
                }



            }
        });
    }

    public void sendInfo(View view)
    {
        CheckBox chk_men = (CheckBox)findViewById(R.id.chk_men);
        CheckBox chk_women = (CheckBox)findViewById(R.id.chk_women);

        CheckBox chk_nicosia = (CheckBox)findViewById(R.id.chk_nicosia);
        CheckBox chk_limassol = (CheckBox)findViewById(R.id.chk_limassol);
        CheckBox chk_larnaca = (CheckBox)findViewById(R.id.chk_larnaca);
        CheckBox chk_paphos = (CheckBox)findViewById(R.id.chk_paphos);




        if (chk_men.isChecked() == false && chk_women.isChecked()==false)
        {
            Toast.makeText(Preferences_1.this,
                    "Please Select A Gender", Toast.LENGTH_LONG).show();

        }

        if (chk_nicosia.isChecked() == false && chk_larnaca.isChecked()==false && chk_limassol.isChecked() == false && chk_paphos.isChecked() == false)
        {
            Toast.makeText(Preferences_1.this,
                    "Please Select An Area", Toast.LENGTH_LONG).show();

        }
    }

}

