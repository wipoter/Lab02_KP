package com.lab02.Amphibia.Types;

import com.lab02.Amphibia.Amphibia;

//Безногі земноводні
public class Apoda extends Amphibia {
    public Apoda(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Безногі земневодні";
    }
}
