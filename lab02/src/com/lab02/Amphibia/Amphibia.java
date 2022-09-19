package com.lab02.Amphibia;

import com.lab02.TerrariumAnimals;

//Амфібія/земноводні
public class Amphibia extends TerrariumAnimals {
    public Amphibia(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.species = "Амфібія";
    }
}
