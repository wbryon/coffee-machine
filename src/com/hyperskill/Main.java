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
                case "buy" : {
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    coffeeType = scanner.next();
                    if (coffeeType.equals("1")) {
                        status.doEspresso();
                        continue;
                    }
                    if (coffeeType.equals("2")) {
                        status.doLatte();
                        continue;
                    }
                    if (coffeeType.equals("3")) {
                        status.doCappuccino();
                        continue;
                    }
                    if (coffeeType.equals("back")) {
                        continue;
                    }

                }

                case "fill" : {
                    System.out.println("\nWrite how many ml of water you want to add:");
                    fill.setWater(scanner.nextInt());
                    status.fillWater(fill.getWater());
                    System.out.println("Write how many ml of milk you want to add:");
                    fill.setMilk(scanner.nextInt());
                    status.fillMilk(fill.getMilk());
                    System.out.println("Write how many grams of coffee you want to add:");
                    fill.setCoffee(scanner.nextInt());
                    status.fillCoffee(fill.getCoffee());
                    System.out.println("Write how many disposable cups of coffee beans you want to add:");
                    fill.setCupsAmount(scanner.nextInt());
                    status.fillCupsAmount(fill.getCupsAmount());
                    System.out.println();
                    continue;
                }
                case "take" : {
                    System.out.println("\nI gave you $" + status.getMoney() + "\n");
                    status.takeMoney();
                    continue;
                }
                case "remaining" : {
                    System.out.println("\nThe coffee machine has:\n" + status.getWater() + " ml of water\n" + status.getMilk() + " ml of milk\n" +
                            status.getCoffee() + " g of coffee beans\n" + status.getCupsAmount() + " disposable cups\n$" + status.getMoney() + " of money\n");
                    continue;
                }
                case "exit" : System.exit(0);
            }
        }
    }
}
