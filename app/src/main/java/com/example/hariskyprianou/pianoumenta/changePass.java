package com.example.hariskyprianou.pianoumenta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class changePass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pass);


    }

    protected void save(View view) {
        EditText txtpass1 = (EditText) findViewById(R.id.currentPass);
        String input1 = txtpass1.getText().toString();
        EditText txtpass2 = (EditText) findViewById(R.id.newPass);
        String input2 = txtpass2.getText().toString();
        EditText txtpass3 = (EditText) findViewById(R.id.confirmPass);
        String input3 = txtpass3.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        if (!input1.matches("") && !input2.matches("") && !input3.matches("") && input2.equals(input3) && !input3.equals(input1))
        {
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Password Changed Successfully!", Toast.LENGTH_LONG).show();
            finish();
        }else if (!input1.matches("") && !input2.matches("") && !input3.matches("") && input2.equals(input3) && input3.equals(input1))
        {
            Toast.makeText(getApplicationContext(), "New Password must differ from old Password!", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(getApplicationContext(), "Passwords do not match! Please Try Again!", Toast.LENGTH_LONG).show();

    }
    protected void cancel(View view)
    {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
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
            Intent i2=  new Intent(this, EditProfile.class );
            startActivity(i2);

        }

        return super.onOptionsItemSelected(item);
    }


}



