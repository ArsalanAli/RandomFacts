package com.example.arsalan.randomfacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CrazyFactsActiviy extends AppCompatActivity {
    private Facts facts;
    private TextView fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazy_facts_activiy);
        facts = new Facts();
        facts.SetCrazyFacts();
        fact = (TextView) findViewById(R.id.textView2);
        fact.setText(facts.GetCurrentFact());
    }
    public void newcrazyfact(View view){
        fact.setText(facts.GetRandomFact());
    }
}
