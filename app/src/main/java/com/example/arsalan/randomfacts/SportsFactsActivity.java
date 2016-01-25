package com.example.arsalan.randomfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SportsFactsActivity extends AppCompatActivity {
    private String[] facts;
    private TextView fact;
    private Random r;
    private int currentfact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_facts);
        facts = new String[4];
        facts[0] = "Sports fact 1";
        facts[1] = "Sports fact 2";
        facts[2] = "Sports fact 3";
        facts[3] = "Sports fact 4";
        fact = (TextView) findViewById(R.id.textView2);
        r = new Random();
        currentfact = r.nextInt(4);
        fact.setText(facts[currentfact]);
    }

    public void newsportsfact(View view){
        int temp;
        do{
            temp = r.nextInt(4);
        }
        while(temp == currentfact);
        currentfact = temp;
        fact.setText(facts[currentfact]);
    }
}
