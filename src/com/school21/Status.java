package com.school21;

class Status {

    FillIngredients add = new FillIngredients();

    private int water = add.getWater();
    private int milk = add.getMilk();
    private int coffee = add.getCoffee();
    private int cupsAmount = add.getCupsAmount();
    private int money = 550;

    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        if (this.water >= water) {
            this.water -= water;
        }
        else System.out.println("Sorry, not enough water!");
    }

    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        if (this.milk >= milk) {
            this.milk -= milk;
        }
        else System.out.println("Sorry, not enough milk!");
    }

    public int getCoffee() {
        return coffee;
    }
    public void setCoffee(int coffee) {
        if (this.coffee >= coffee) {
            this.coffee -= coffee;
        }
        else System.out.println("Sorry, not enough coffee!");
    }

    public int getCupsAmount() {
        return cupsAmount;
    }
    public void setCupsAmount(int cupsAmount) {
        if (this.cupsAmount >= cupsAmount) {
            this.cupsAmount -= cupsAmount;
        }
        else System.out.println("Sorry, not enough disposable cups!");
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money += money;
    }
}