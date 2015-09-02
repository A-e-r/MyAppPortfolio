package com.example.ar.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button spotify = (Button) findViewById(R.id.btn_proj_spotify_streamer);
        Button build = (Button) findViewById(R.id.btn_proj_build_it_bigger);
        Button xyz = (Button) findViewById(R.id.btn_proj_xyz_reader);
        Button superduo = (Button) findViewById(R.id.btn_proj_super_duo);
        Button capstone = (Button) findViewById(R.id.btn_proj_capstone);

        spotify.setOnClickListener(this);
        build.setOnClickListener(this);
        xyz.setOnClickListener(this);
        superduo.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    public void onClick(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch: "+((Button) view).getText(),Toast.LENGTH_SHORT).show();
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
