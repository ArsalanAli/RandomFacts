package com.example.arsalan.randomfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SportsFactsActivity extends AppCompatActivity {
    private Facts facts;
    private TextView fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_facts);
        facts = new Facts();
        facts.SetSportsFacts();
        fact = (TextView) findViewById(R.id.textView2);
        fact.setText(facts.GetCurrentFact());
    }

    public void newsportsfact(View view){
        fact.setText(facts.GetRandomFact());
    }
}
