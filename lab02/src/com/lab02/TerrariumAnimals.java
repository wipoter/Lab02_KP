package com.lab02;

public class TerrariumAnimals {
    protected String name;
    protected int levelOfDanger;
    protected int daysWithOutFood;
    protected String type;
    protected String species;
    protected int maxAge;

    public int getDaysWithOutFood(){
        return daysWithOutFood;
    }

    public int getLevelOfDanger(){
        return levelOfDanger;
    }

    public int getMaxAge(){return maxAge;};

    @Override
    public String toString(){
        String allInfo;
        allInfo = "Ім'я: " + name + "\n" +
                "Вид: " + species + "\n" +
                "Тип: " + type + "\n" +
                "Рівень небезпеки: " + levelOfDanger + "\n" +
                "Днів без їжі: " + daysWithOutFood + "\n" +
                "Максимальний вік: " + maxAge + "\n";
        return allInfo;
    }

    public TerrariumAnimals(String name, int maxAge, int levelOfDanger, int dayWithOutFood){
        this.daysWithOutFood = dayWithOutFood;
        this.levelOfDanger = levelOfDanger;
        this.maxAge = maxAge;
        this.name = name;
    }
}
