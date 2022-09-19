package com.lab02.SortManager;
import com.lab02.TerrariumAnimals;
import java.util.*;

public class SortManager {
    public static class Inner_class1 implements Comparator<TerrariumAnimals> {
        public int compare(TerrariumAnimals t1, TerrariumAnimals t2) {
            if (t1.getMaxAge() == t2.getMaxAge())
                return 0;
            else if (t1.getMaxAge() > t2.getMaxAge())
                return 1;
            else
                return -1;
        }
    }

    public class Inner_class2 implements Comparator<TerrariumAnimals> {
        public int compare(TerrariumAnimals t1, TerrariumAnimals t2) {
            if (t1.getMaxAge() == t2.getMaxAge())
                return 0;
            else if (t1.getMaxAge() > t2.getMaxAge())
                return -1;
            else
                return 1;
        }
    }

    public static class Search{
        public static List<TerrariumAnimals> byLevelOfDanger(List<TerrariumAnimals> list, int levelPfDanger){
            List<TerrariumAnimals> listOfLevel = null;
            for (TerrariumAnimals tmp:
                 list) {
                if (tmp.getLevelOfDanger() == levelPfDanger)
                    listOfLevel.add(tmp);
            }
            return list;
        }

        public static List<TerrariumAnimals> byDaysWithOutFood(List<TerrariumAnimals> list, int daysWithOutFood){
            List<TerrariumAnimals> listOfLevel = null;
            for (TerrariumAnimals tmp:
                    list) {
                if (tmp.getDaysWithOutFood() == daysWithOutFood)
                    listOfLevel.add(tmp);
            }
            return list;
        }
    }

    public abstract class anonimous_inner_class implements Comparator<TerrariumAnimals>  {
        public abstract int compare(TerrariumAnimals t1, TerrariumAnimals t2);
    }

}
