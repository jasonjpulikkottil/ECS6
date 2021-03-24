package com.jp.geck.ecs6;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Created By Jason", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }





    public void buttonClick1(View view){
        Intent intent=new Intent(MainActivity.this,ScrollingActivity.class);

        MainActivity.this.startActivity(intent);
    }
    public void buttonClick2(View view){
        Intent intent=new Intent(this,TimeTable.class);
        MainActivity.this.startActivity(intent);
    }
    public void buttonClick3(View view){
        Intent intent=new Intent(this,StudActivity.class);
        MainActivity.this.startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_info) {
            Toast.makeText(MainActivity.this, "My First Application in Android(TM) platform.\nSDK Used :Android  2.2.3\n App for S6 EC of GECK\n\t(Beta Version)\n\nMin API:15-Android 4.0.3\nMax API:25-Android 7.1.1\nSupports Android Tablet and Android Phone", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }



}
