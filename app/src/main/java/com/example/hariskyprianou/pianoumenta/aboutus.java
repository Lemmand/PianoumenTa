package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.aboutus_menu, menu);
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

    public void VisitWebsite(View view){
        TextView fb = (TextView) findViewById(R.id.txtfb);
        WebView fbpage= (WebView) findViewById(R.id.fbpage);
        fbpage.setWebViewClient( new WebViewClient());
        fbpage.loadUrl("https://www.facebook.com");

    }

}
