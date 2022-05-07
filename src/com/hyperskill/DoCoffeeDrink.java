package com.hyperskill;

public class DoCoffeeDrink {


    private final int espressoCoffee = 16;
    private final int espressoCost = 4;
    private final int latteCost = 7;
    private final int cappuccinoCost = 6;

    private final int disposableCup = 1;

    Status status = new Status();

    public int espressoWater() {
        int espressoWater = 250;
        if (espressoWater <= status.getWater() && espressoCoffee <= status.getCoffee()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (espressoWater);
        }
        else if (espressoWater > status.getWater()) {
            System.out.println("Sorry, not enough water!");
        }
        return 0;
    }
    public int espressoCoffee() {
        if (espressoCoffee <= status.getCoffee()) {
            return (espressoCoffee);
        }
        else System.out.println("Sorry, not enough coffee!");
        return 0;
    }
    public int espressoCup() {
        if (disposableCup <= status.getCupsAmount()) {
            System.out.println("\nI have enough resources, making you a coffee!");
        }
        else System.out.println("Sorry, not enough disposable cups!");
        return 0;
    }

    public int latteWater() {
        int latteWater = 350;
        if (latteWater <= status.getWater()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (latteWater);
        }
        else System.out.println("Sorry, not enough water!");
        return 0;
    }
    public int latteCoffee() {
        int latteCoffee = 20;
        if (latteCoffee <= status.getCoffee()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (latteCoffee);
        }
        else System.out.println("Sorry, not enough coffee!");
        return 0;
    }
    public int latteMilk() {
        int latteMilk = 75;
        if (latteMilk <= status.getMilk()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (latteMilk);
        }
        else System.out.println("Sorry, not enough milk!");
        return 0;
    }
    public int latteCup() {
        if (disposableCup <= status.getCupsAmount()) {
            System.out.println("\nI have enough resources, making you a coffee!");
        }
        else System.out.println("Sorry, not enough disposable cups!");
        return 0;
    }

    public int cappuccinoWater() {
        int cappuccinoWater = 200;
        if (cappuccinoWater <= status.getWater()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (cappuccinoWater);
        }
        else System.out.println("Sorry, not enough water!");
        return 0;
    }
    public int cappuccinoCoffee() {
        int cappuccinoCoffee = 16;
        if (cappuccinoCoffee <= status.getCoffee()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (cappuccinoCoffee);
        }
        else System.out.println("Sorry, not enough coffee!");
        return 0;
    }
    public int cappuccinoMilk() {
        int cappuccinoMilk = 100;
        if (cappuccinoMilk <= status.getMilk()) {
            System.out.println("\nI have enough resources, making you a coffee!");
            return (cappuccinoMilk);
        }
        else System.out.println("Sorry, not enough milk!");
        return 0;
    }
    public int cappuccinoCup() {
        if (disposableCup <= status.getCupsAmount()) {
            System.out.println("\nI have enough resources, making you a coffee!");
        }
        else System.out.println("Sorry, not enough disposable cups!");
        return 0;
    }
}