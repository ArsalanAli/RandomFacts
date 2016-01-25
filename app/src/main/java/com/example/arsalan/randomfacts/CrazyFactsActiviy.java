package com.example.arsalan.randomfacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Random;

public class CrazyFactsActiviy extends AppCompatActivity {
    private String[] facts;
    private TextView fact;
    private Random r;
    private int currentfact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazy_facts_activiy);
        facts = new String[4];
        facts[0] = "Crazy fact 1";
        facts[1] = "Crazy fact 2";
        facts[2] = "Crazy fact 3";
        facts[3] = "Crazy fact 4";
        fact = (TextView) findViewById(R.id.textView2);
        r = new Random();
        currentfact = r.nextInt(4);
        fact.setText(facts[currentfact]);
    }
    public void newcrazyfact(View view){
        int temp;
        do{
            temp = r.nextInt(4);
        }
        while(temp == currentfact);
        currentfact = temp;
        fact.setText(facts[currentfact]);
    }
}
