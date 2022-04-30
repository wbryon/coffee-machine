package com.school21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Status status = new Status();
        FillIngredients addIngredients = new FillIngredients();
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        String action;
        System.out.println("The coffee machine has:\n" + addIngredients.getWater() + " ml of water\n" + addIngredients.getMilk() + " ml of milk\n" +
                status.getCoffee() + " g of coffee beans\n" + addIngredients.getCupsAmount() + " disposable cups\n" + addIngredients.getMoney() + " of money\n" +
                "\nWrite action (buy, fill, take, remaining, exit):");

        while (true) {
            action = scanner.next();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                coffeeType = scanner.next();
                if (coffeeType.equals("1")) {
                    status.setWater(250);
                    status.setCoffee(16);
                    status.setMoney(4);
                    status.setCupsAmount(1);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                if (coffeeType.equals("2")) {
                    status.setWater(350);
                    status.setMilk(75);
                    status.setCoffee(20);
                    status.setMoney(7);
                }
                if (coffeeType.equals("3")) {
                    status.setWater(200);
                    status.setMilk(100);
                    status.setCoffee(12);
                    status.setMoney(6);
                }
                if (coffeeType.equals("back")) {
                    System.out.println("The coffee machine has:\n" + addIngredients.getWater() + " ml of water\n" + addIngredients.getMilk() + " ml of milk\n" +
                            addIngredients.getCoffee() + " g of coffee beans\n" + addIngredients.getCupsAmount() + " disposable cups\n" + addIngredients.getMoney() + " of money\n" +
                            "\nWrite action (buy, fill, take, remaining, exit):");
                }
            }
            if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                addIngredients.setWater(scanner.nextInt());
                System.out.println("Write how many ml of milk you want to add:");
                addIngredients.setMilk(scanner.nextInt());
                System.out.println("Write how many grams of coffee you want to add:");
                addIngredients.setCoffee(scanner.nextInt());
                System.out.println("Write how many disposable cups of coffee you want to add:");
                addIngredients.setCupsAmount(scanner.nextInt());
                System.out.println("\nThe coffee machine has:\n" + addIngredients.getWater() + " ml of water\n" + addIngredients.getMilk() + " ml of milk\n" +
                        addIngredients.getCoffee() + " g of coffee beans\n" + addIngredients.getCupsAmount() + " disposable cups\n" + addIngredients.getMoney() + " of money\n" +
                        "\nWrite action (buy, fill, take, remaining, exit):");
            }
            if (action.equals("take")) {
//                addIngredients.setMoney(status.getMoney());
                System.out.println("I gave you $" + addIngredients.getMoney());
                System.out.println("The coffee machine has:\n" + addIngredients.getWater() + " ml of water\n" + addIngredients.getMilk() + " ml of milk\n" +
                        addIngredients.getCoffee() + " g of coffee beans\n" + addIngredients.getCupsAmount() + " disposable cups\n" + addIngredients.getMoney() + " of money\n" +
                        "\nWrite action (buy, fill, take, remaining, exit):");
            }
            if (action.equals("remaining")) {
                System.out.println("");
            }
            if (action.equals("exit")) System.exit(0);
        }
    }
}