package com.lab02.Arthropoda.Types;

import com.lab02.Arthropoda.Arthropoda;

//Павукоподібні
public class Arachnida extends Arthropoda {
    public Arachnida(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Павукоподібні";
    }
}
