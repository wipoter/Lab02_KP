package com.lab02.Reptilia;

import com.lab02.TerrariumAnimals;

//рептилія/плазуни
public  class Reptilia extends TerrariumAnimals {
    public Reptilia(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.species = "Рептилія";
    }
}
