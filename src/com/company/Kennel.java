package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(Pet... pets) {
        this.petList = new ArrayList<Pet>(Arrays.asList(pets));
    }

    public void allSpeak() {
        for (Pet p : petList)
            System.out.println(p.getName() + ": " + p.speak());
    }
}