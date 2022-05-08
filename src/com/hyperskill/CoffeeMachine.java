import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 200;
        int coffee = 15;
        int milk = 50;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterLeft = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkLeft = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeLeft = scanner.nextInt();
        System.out.println("Write how many cups you will need:");
        int cupsRequest = scanner.nextInt();
        if (waterLeft >= water * cupsRequest && coffeeLeft >= coffee * cupsRequest && milkLeft >= milk * cupsRequest) {
            if (waterLeft == water * cupsRequest || coffeeLeft == coffee * cupsRequest || milkLeft == milk * cupsRequest) {
                System.out.println("Yes, I can make that amount of coffee");
            }
        }
        System.out.println("Yes, I can make that amount of coffee (and even" + cupsRequest + " more than that)");
        System.out.println("No, I can make only" + cupsRequest + " cup(s) of coffee");
    }
}
