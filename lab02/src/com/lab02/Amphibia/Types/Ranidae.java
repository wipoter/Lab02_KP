package com.lab02.Amphibia.Types;

import com.lab02.Amphibia.Amphibia;

//Справжні жаби
public class Ranidae extends Amphibia {
    public Ranidae(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Справжні жаби";
    }
}
