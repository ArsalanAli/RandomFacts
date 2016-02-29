package com.example.arsalan.randomfacts;


import android.content.Context;

import java.util.Random;

public class Facts {
    FactsDB DB;
    private String facts[];
    private Random rand;
    private int currentfact;
    Facts(Context context){
        DB = new FactsDB(context);
        facts = new String[4];
        rand = new Random();
        currentfact = 0;
    }
    public void SetSportsFacts(){
        facts[0] = "Sports fact 1";
        facts[1] = "Sports fact 2";
        facts[2] = "Sports fact 3";
        facts[3] = "Sports fact 4";
    }
    public void SetCrazyFacts(){
        facts[0] = "Crazy fact 1";
        facts[1] = "Crazy fact 2";
        facts[2] = "Crazy fact 3";
        facts[3] = "Crazy fact 4";
    }
    public String GetCurrentFact() {
        return DB.getfact();
    }
    public String GetRandomFact (){
        int temp;
        do{
            temp = rand.nextInt(4);
        }
        while(temp == currentfact);
        currentfact = temp;
        return GetCurrentFact();
    }
}
