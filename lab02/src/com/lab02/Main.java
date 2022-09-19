package com.lab02;

import com.lab02.Amphibia.Types.Anura;
import com.lab02.Amphibia.Types.Apoda;
import com.lab02.Amphibia.Types.Caudata;
import com.lab02.Amphibia.Types.Ranidae;
import com.lab02.Arthropoda.Types.Arachnida;
import com.lab02.Arthropoda.Types.Crustacea;
import com.lab02.Reptilia.Types.Crocodylia;
import com.lab02.Reptilia.Types.Snakes;
import com.lab02.Reptilia.Types.Squamata;
import com.lab02.Reptilia.Types.Testudines;
import com.lab02.SortManager.SortManager;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<TerrariumAnimals> listOfAnimals = new LinkedList<>();
        listOfAnimals.add(new Anura("Жаба-землянка", 2, 0, 3));
        listOfAnimals.add(new Apoda("Цейлонський Рибозмій", 3, 3, 7));
        listOfAnimals.add(new Caudata("Плямиста саламандра", 1, 1, 2));
        listOfAnimals.add(new Ranidae("Прудка жаба", 3, 1, 4));
        listOfAnimals.add(new Arachnida("Скорпіон", 4, 7, 8));
        listOfAnimals.add(new Crustacea("Краб", 10, 6, 3));
        listOfAnimals.add(new Crocodylia("Гавіал", 45, 10, 1));
        listOfAnimals.add(new Snakes("Балчера", 5, 10, 8));
        listOfAnimals.add(new Squamata("Гекон", 10,7, 1));
        listOfAnimals.add(new Testudines("Сухопутна черепаха", 100, 3, 10));

        printAnimal(listOfAnimals);

        System.out.println("After sort increase(static inner class)\n");

        SortManager.Inner_class1 tmp1 = new SortManager.Inner_class1();
        Collections.sort(listOfAnimals, tmp1);

        printAnimal(listOfAnimals);

        System.out.println("After sort decrease(inner class)\n");

        SortManager tmp = new SortManager();
        SortManager.Inner_class2 tmp2 = tmp.new Inner_class2();
        Collections.sort(listOfAnimals, tmp2);

        printAnimal(listOfAnimals);

        System.out.println("After sort increase(Lambda)\n");

        listOfAnimals.sort((TerrariumAnimals t1, TerrariumAnimals t2) ->
                Integer.valueOf(t1.getMaxAge()).compareTo(Integer.valueOf(t2.getMaxAge())));

        printAnimal(listOfAnimals);

        System.out.println("After sort decrease(Anonymous)\n");

        SortManager.anonimous_inner_class tmp3 = tmp.new anonimous_inner_class() {
            @Override
            public int compare(TerrariumAnimals t1, TerrariumAnimals t2) {
                if (t1.getMaxAge() == t2.getMaxAge())
                    return 0;
                else if (t1.getMaxAge() > t2.getMaxAge())
                    return -1;
                else
                    return 1;
            }
        };

        Collections.sort(listOfAnimals, tmp3);

        printAnimal(listOfAnimals);

    }
    static void printAnimal(List<TerrariumAnimals> list){
        for (TerrariumAnimals tmp:
                list) {
            System.out.println(tmp.toString());
        }
    }
}
