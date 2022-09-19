package com.lab02.Reptilia.Types;

import com.lab02.Reptilia.Reptilia;

//Черепахи
public class Testudines extends Reptilia {
    public Testudines(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Черепахи";
    }
}
