package com.school21;

public class FillIngredients {

    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cupsAmount = 9;
    private int money = 550;

    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water += water;
    }

    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        this.milk += milk;
    }

    public int getCoffee() {
        return coffee;
    }
    public void setCoffee(int coffee) {
        this.coffee += coffee;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money += money;
    }

    public int getCupsAmount() {
        return cupsAmount;
    }
    public void setCupsAmount(int cupsAmount) {
        this.cupsAmount += cupsAmount;
    }
}