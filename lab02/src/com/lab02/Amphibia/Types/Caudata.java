package com.lab02.Amphibia.Types;

import com.lab02.Amphibia.Amphibia;

//Хвостаті земноводні
public class Caudata extends Amphibia {
    public Caudata(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Хвостаті земневодні";
    }
}
