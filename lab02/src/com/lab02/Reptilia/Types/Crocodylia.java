package com.lab02.Reptilia.Types;

import com.lab02.Reptilia.Reptilia;

//Крокодили
public class Crocodylia extends Reptilia {
    public Crocodylia(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Крокодили";
    }
}
