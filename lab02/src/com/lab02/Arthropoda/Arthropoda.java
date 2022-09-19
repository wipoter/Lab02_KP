package com.lab02.Arthropoda;

import com.lab02.TerrariumAnimals;

//членистоногі
public class Arthropoda extends TerrariumAnimals {
    public Arthropoda(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.species = "Членистоногі";
    }
}
