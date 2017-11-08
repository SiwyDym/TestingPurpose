package com.siwydym;

import java.util.*;

public class Main{

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> integers = Math.amountOfSomething(list);

        for (Integer temp : integers) {
            System.out.println("temp = " + temp);
        }
    }

}

class Math{



    public static List<Integer> amountOfSomething(List<Integer> toProccesList) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < toProccesList.size(); i++) {
            int amount = i;
            Optional<Integer> reduce = toProccesList.stream().filter(a -> !a.equals(toProccesList.get(amount))).reduce((a, b) -> a * b);
            results.add(reduce.get());
        }
        return results;
    }
}
