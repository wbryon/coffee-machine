package com.hyperskill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fill fill = new Fill();
        Status status = new Status();
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        String action;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            switch (action) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    coffeeType = scanner.next();
                    if (coffeeType.equals("1")) {
                        fill.setWater(250);
                        fill.setCoffee(16);
                        fill.setMoney(4);
                        fill.setCupsAmount(1);
                        System.out.println("\nI have enough resources, making you a coffee!");
                    }
                    if (coffeeType.equals("2")) {
                        fill.setWater(350);
                        fill.setMilk(75);
                        fill.setCoffee(20);
                        fill.setMoney(7);
                    }
                    if (coffeeType.equals("3")) {
                        fill.setWater(200);
                        fill.setMilk(100);
                        fill.setCoffee(12);
                        fill.setMoney(6);
                    }
                    if (coffeeType.equals("back")) {
                        System.out.println("\n1The coffee machine has:\n" + status.getWater() + " ml of water\n" + status.getMilk() + " ml of milk\n" +
                                status.getCoffee() + " g of coffee beans\n" + status.getCupsAmount() + " disposable cups\n" + status.getMoney() + " of money\n" +
                                "\nWrite action (buy, fill, take, remaining, exit):");
                    }
                }
                case "fill" -> {
                    System.out.println("\nWrite how many ml of water you want to add:");
                    status.setWater(scanner.nextInt());
                    System.out.println("Write how many ml of milk you want to add:");
                    status.setMilk(scanner.nextInt());
                    System.out.println("Write how many grams of coffee you want to add:");
                    status.setCoffee(scanner.nextInt());
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    status.setCupsAmount(scanner.nextInt());
                    System.out.println();
                }
                case "take" -> {
                    System.out.println("\nI gave you $" + status.getMoney());
                    status.setMoney(0);
                }
                case "remaining" -> System.out.println("\nThe coffee machine has:\n" + status.getWater() + " ml of water\n" + status.getMilk() + " ml of milk\n" +
                        status.getCoffee() + " g of coffee beans\n" + status.getCupsAmount() + " disposable cups\n" + status.getMoney() + " of money\n");
                case "exit" -> System.exit(0);
            }
        }
    }
}