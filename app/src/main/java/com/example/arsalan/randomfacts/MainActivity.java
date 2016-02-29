package com.example.arsalan.randomfacts;

import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button crazyfactsbutton = (Button) findViewById(R.id.Crazybutton);
        crazyfactsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CrazyFactsActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onStart(){
        super.onStart();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String color = prefs.getString("display_color", "blue");
        switch (color){
            case "red":
                findViewById(R.id.main).setBackgroundColor(Color.argb(255,255,0,0));
                break;
            case "blue":
                findViewById(R.id.main).setBackgroundColor(Color.argb(255,96,179,234));
                break;
        }
    }
    @Override
    public void onResume(){
        super.onResume();
    }
    public void goToSportsFacts(View view){
        Intent intent = new Intent(MainActivity.this, SportsFactsActivity.class);
        startActivity(intent);
    }
    public void quit(View view){
        DialogFragment newFragment = new quitdialog();
        newFragment.show(getFragmentManager(), "quitting");
    }
    public void settings(View view){
        Intent intent = new Intent(MainActivity.this, settings.class);
        startActivity(intent);
    }
    public void openmaps(View view){
        Uri mapsearch = Uri.parse("geo:0,0?q=1455+De+Maisonneuve+Blvd.+W.,+Montreal,+Quebec");
        Intent intent = new Intent(Intent.ACTION_VIEW, mapsearch);
        startActivity(intent);
    }
}
