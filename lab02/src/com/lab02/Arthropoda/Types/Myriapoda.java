package com.lab02.Arthropoda.Types;

import com.lab02.Arthropoda.Arthropoda;

//Багатоніжки
public class Myriapoda extends Arthropoda {
    public Myriapoda(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Багатоніжки";
    }
}
