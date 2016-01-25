package com.example.arsalan.randomfacts;

import android.content.Intent;
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
                Intent intent = new Intent(MainActivity.this, CrazyFactsActiviy.class);
                startActivity(intent);
            }
            });
    }
    public void goToSportsFacts(View view){
        Intent intent = new Intent(MainActivity.this, SportsFactsActivity.class);
        startActivity(intent);
    }
}
