package org.fasttrackit.code.homework;

import java.util.*;

public class Basket {
    public static void main(String[] args) {
        List<String> Basket = new ArrayList<>();
        Basket.add("Apple");
        Basket.add("Banana");


        System.out.println(position(Basket, "Apple"));
        System.out.println(distinct(Basket));
        System.out.println(remove(Basket, "Banana"));
        add(Basket, "Banana");
        add(Basket, "Banana");
        add(Basket, "Banana");
        System.out.println(find(Basket, "Banana"));
        count(Basket);
        customCount(Basket);

    }

    public static boolean find(List Basket, String Fruit) {
        return Basket.contains(Fruit);

    }

    public static boolean remove(List Basket, String Fruit) {
        Basket.remove(Fruit);
        return Basket.contains(Fruit);
    }

    public static int position(List Basket, String Fruit) {
        int position = 0;
        for (int i = 0;
             i < Basket.size();
             i++) {
            if (Basket.get(i) == Fruit) {
                position = i + 1;
            }

        }
        return position;
    }

    public static Set<String> distinct(List Basket) {
        Set<String> DistinctCollection = new HashSet<>();
        for (int i = 0; i < Basket.size(); i++) {
            DistinctCollection.add((String) Basket.get(i));
        }
        return DistinctCollection;
    }

    public static boolean add(List Basket, String fruit) {
        return Basket.add(fruit);
    }

    public static int count(List Basket) {
        System.out.println(Basket.size());

        return Basket.size();
    }

    public static int customCount(List Basket) {
        int counter = 0;
        for (int i = 0; i < Basket.size(); i++) {
            counter = counter + 1;

        }
        System.out.println(counter);
        return counter;
    }
}
