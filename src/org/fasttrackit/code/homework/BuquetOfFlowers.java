package org.fasttrackit.code.homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BuquetOfFlowers {
    public static void main(String[] args) {
        Set<String> BuquetOfFlowers = new HashSet<>();
        add(BuquetOfFlowers, "Lalea");
        add(BuquetOfFlowers, "Lalea");
        add(BuquetOfFlowers, "Trandafir");
        add(BuquetOfFlowers, "Narcisa");
        remove(BuquetOfFlowers, "Lalea");

        getAll(BuquetOfFlowers);

    }

    public static void add(Set BuquetOfFlowers, String flower) {
        if (BuquetOfFlowers.contains(flower)) {
            System.out.println("The flower is not unique");
        } else {
            BuquetOfFlowers.add(flower);
        }
    }

    public static Collection getAll(Collection BuquetOfFlowers) {
        System.out.println(BuquetOfFlowers);
        return BuquetOfFlowers;
    }

    public static boolean remove(Set BuquetOfFlowers, String flower) {
        return BuquetOfFlowers.remove(flower);
    }

}
