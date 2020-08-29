// package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner input = new Scanner(System.in);
    static String quit = "no";

    public static void main(String[] args) {
        while (!quit.equals("yes")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String response = input.nextLine();
                switch (response) {
                    case "exit":
                        quit = "yes";
                        break;
                    case "remaining":
                        remain();
                        break;
                    case "buy":
                        buy();
                        break;
                    case "fill":
                        fill();
                        break;
                    case "take":
                        take();
                        break;
                    default:
                        System.out.println("invalid selection");
                        break;
                }
            }
        }
    public static void remain(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of cups");
        System.out.println(money + " of money");
    }

    public static void take() {
        System.out.println("I gave you "+ money + " of money");
        money = 0;
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        int w = input.nextInt();
        water += w;
        System.out.println("Write how many ml of milk do you want to add:");
        int m = input.nextInt();
        milk += m;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int b = input.nextInt();
        beans += b;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int c = input.nextInt();
        cups += c;
        input.nextLine();

    }

    public static void buy() {
//        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = input.nextLine();
        if(choice.equals( "1")){
            if(water > 250 && beans > 16) {
                water -= 250;
                beans -= 16;
                money += 4;
                cups -= 1;
            } else {
                System.out.println("Cannot make a cup of coffee");
            }
        } else if(choice.equals( "2")){
            if(water > 350 && milk > 75 && beans > 20) {
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                cups -= 1;
            } else {
                System.out.println("Cannot make a cup of coffee");
            }
        } else if(choice.equals( "3")) {
            if (water > 200 && milk > 100 && beans > 12) {
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups -= 1;
            } else {
                System.out.println("Cannot make a cup of coffee");
            }
        } else if(choice.equals( "back")) {
               return;

        }
        else {
            System.out.println("not a valid choice");
        }
    }
}
