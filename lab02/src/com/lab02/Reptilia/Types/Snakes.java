package com.lab02.Reptilia.Types;

import com.lab02.Reptilia.Reptilia;

//Змії
public class Snakes extends Reptilia {
    public Snakes(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Змії";
    }
}
