package com.hyperskill;

public class DoCoffeeDrink {

    private final int latteWater = 350;
    private final int latteMilk = 75;
    private final int latteCoffee = 20;
    private final int latteCost = 7;

    private final int espressoWater = 250;
    private final int espressoCoffee = 16;
    private final int espressoCost = 4;

    private final int cappuccinoWater = 200;
    private final int cappuccinoMilk = 100;
    private final int cappuccinoCoffee = 16;
    private final int cappuccinoCost = 6;

    Status status = new Status();

    public void doEspresso() {
        if (status.getWater() > espressoWater) {
            status.setWater(espressoWater);
        }
        else {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (status.getCoffee() > espressoCoffee) {
            status.setCoffee(espressoCoffee);
        }
        else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
    }

    public void doLatte() {
        if (status.getWater() > latteWater) {
            status.setWater(latteWater);
        }
        else {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (status.getCoffee() > latteCoffee) {
            status.setCoffee(latteCoffee);
        }
        else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
    }

    public void doCappuccino() {
        if (status.getWater() > cappuccinoWater) {
            status.setWater(cappuccinoWater);
        }
        else {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (status.getCoffee() > cappuccinoCoffee) {
            status.setCoffee(cappuccinoCoffee);
        }
        else {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
    }
}
