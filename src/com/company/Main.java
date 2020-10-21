package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList<String>();
        ArrayList<String> rodents = new ArrayList<String>();
        populateArrays(cats, rodents);
        addTwoArrays(cats, rodents);
        manipulateArray(cats);
    }

    private static void populateArrays(ArrayList<String> cats, ArrayList<String> rodents) {
        try {
            cats.add("Main Coon");
            cats.add("Somali");
            cats.add("Abyssinian");
            rodents.add("Gerbil");
            rodents.add("Hamster");
            rodents.add("Guinea Pig");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(cats);
            System.out.println(rodents);
        }
    }

    private static void addTwoArrays(ArrayList<String> cats, ArrayList<String> rodents) {
        for (int count = 1; count < rodents.size(); count++){
            cats.add(rodents.get(count));
        }
        System.out.println(cats);
    }

    private static void manipulateArray(ArrayList<String> cats) {
        try {
            cats.remove(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(cats);
            System.out.println(cats.get(3));
        }

        try {
            cats.remove(0);
            cats.add(0, "Norwegian Forest Cat");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(cats);
        }
    }
}

