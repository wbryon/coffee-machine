package com.hyperskill;

public class Status {

    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cupsAmount = 9;
    private int money = 550;

    DoCoffeeDrink doCoffee = new DoCoffeeDrink();

    public int getWater() { return water; }
    public void setWater(int water) { this.water -= water; }
    public void fillWater(int water) { this.water += water; }


    public int getMilk() { return milk; }
    public void setMilk(int milk) { this.milk -= milk; }
    public void fillMilk(int milk) { this.milk += milk; }


    public int getCoffee() { return coffee; }
    public void setCoffee(int coffee) { this.coffee -= coffee; }
    public void fillCoffee(int coffee) { this.coffee += coffee; }


    public int getMoney() { return money; }
    public void takeMoney() { this.money = 0; }
    public void setMoney(int money) { this.money += money; }


    public int getCupsAmount() { return cupsAmount; }
    public void setCupsAmount() { this.cupsAmount -= 1; }
    public void fillCupsAmount(int cupsAmount) { this.cupsAmount += cupsAmount; }

    public void doEspresso() {
        if (doCoffee.getEspressoWater() <= getWater() && doCoffee.getEspressoCoffee() <= getCoffee() && doCoffee.getDisposableCup() >= 1) {
            System.out.println("\nI have enough resources, making you a coffee!");
            setWater(doCoffee.getEspressoWater());
            setCoffee(doCoffee.getEspressoCoffee());
            setCupsAmount();
            setMoney(doCoffee.getEspressoCost());
        }
        else if (doCoffee.getEspressoWater() > getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        else if (doCoffee.getEspressoCoffee() > getCoffee()) {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        else {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }
    }

    public void doLatte() {
        if (doCoffee.getLatteWater() <= getWater() && doCoffee.getLatteCoffee() <= getCoffee() &&
               doCoffee.getLatteMilk() <= getMilk() && doCoffee.getDisposableCup() >= 1) {
            System.out.println("\nI have enough resources, making you a coffee!");
            setWater(doCoffee.getLatteWater());
            setCoffee(doCoffee.getEspressoCoffee());
            setMilk(doCoffee.getLatteMilk());
            setCupsAmount();
            setMoney(doCoffee.getLatteCost());
        }
        else if (doCoffee.getLatteWater() > getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        else if (doCoffee.getLatteCoffee() > getCoffee()) {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        else if (doCoffee.getLatteMilk() > getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        else {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }
    }

    public void doCappuccino() {
        if (doCoffee.getCappuccinoWater() <= getWater() && doCoffee.getCappuccinoCoffee() <= getCoffee() &&
               doCoffee.getCappuccinoMilk() <= getMilk() && doCoffee.getDisposableCup() >= 1) {
            System.out.println("\nI have enough resources, making you a coffee!");
            setWater(doCoffee.getCappuccinoWater());
            setCoffee(doCoffee.getCappuccinoCoffee());
            setMilk(doCoffee.getCappuccinoMilk());
            setCupsAmount();
            setMoney(doCoffee.getCappuccinoCost());
        }
        else if (doCoffee.getCappuccinoWater() > getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        else if (doCoffee.getCappuccinoCoffee() > getCoffee()) {
            System.out.println("Sorry, not enough coffee!");
            return;
        }
        else if (doCoffee.getCappuccinoMilk() > getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        else {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }
    }
}