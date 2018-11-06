package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InterestsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //toolbar.inflateMenu(R.menu.main_menu);

        Intent i1= getIntent();
        Bundle userInfo = i1.getExtras();
        String sex =  userInfo.getString("sex");

        if(sex.matches("female"))
        {
            ImageView i0 = (ImageView) findViewById(R.id.imageView);
            i0.setImageResource(R.drawable.megan);
            TextView t1= (TextView) findViewById(R.id.textViewa);
            t1.setText("Maria Nikiforou");

            ImageView i2 = (ImageView) findViewById(R.id.imageView2);
            i2.setImageResource(R.drawable.neophytaa);
            TextView t2= (TextView) findViewById(R.id.textViewb);
            t2.setText("Melanie Christoforou");

            ImageView i3 = (ImageView) findViewById(R.id.imageView3);
            i3.setImageResource(R.drawable.steph);
            TextView t3= (TextView) findViewById(R.id.textViewc);
            t3.setText("Stephanie Skortidou");

            ImageView i4 = (ImageView) findViewById(R.id.imageView4);
            i4.setImageResource(R.drawable.kylie);
            TextView t4= (TextView) findViewById(R.id.textViewd);
            t4.setText("Kylie Therapou");

        }
        else
        {
            ImageView i0 = (ImageView) findViewById(R.id.imageView);
            i0.setImageResource(R.drawable.man1);
            TextView t1= (TextView) findViewById(R.id.textViewa);
            t1.setText("Alkis Theodotou");

            ImageView i2 = (ImageView) findViewById(R.id.imageView2);
            i2.setImageResource(R.drawable.man2);
            TextView t2= (TextView) findViewById(R.id.textViewb);
            t2.setText("George Michael");

            ImageView i3 = (ImageView) findViewById(R.id.imageView3);
            i3.setImageResource(R.drawable.man3);
            TextView t3= (TextView) findViewById(R.id.textViewc);
            t3.setText("Haris Kyprianou");

            ImageView i4 = (ImageView) findViewById(R.id.imageView4);
            i4.setImageResource(R.drawable.man4);
            TextView t4= (TextView) findViewById(R.id.textViewd);
            t4.setText("Thanasis Alexandrou");
        }

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
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
        else if(id == R.id.Tips)
        {
            Intent i2=  new Intent(this, Tips.class );
            startActivity(i2);
        }

        return super.onOptionsItemSelected(item);
    }


}
