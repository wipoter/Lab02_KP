package com.lab02.Arthropoda.Types;

import com.lab02.Arthropoda.Arthropoda;

//Ракоподібні
public class Crustacea extends Arthropoda {
    public Crustacea(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Ракоподібні";
    }
}
