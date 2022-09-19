package com.lab02.Reptilia.Types;

import com.lab02.Reptilia.Reptilia;

//Лускаті
public class Squamata extends Reptilia {
    public Squamata(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Лускаті";
    }
}
