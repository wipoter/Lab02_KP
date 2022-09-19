package com.lab02.Amphibia.Types;

import com.lab02.Amphibia.Amphibia;

//Безхвості земноводні
public class Anura extends Amphibia {
    public Anura(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        super(name, maxAge, levelOfDanger, dayWithOutFood);
        this.type = "Безхвості Земневодні";
    }
}
