package cwiczenie3;

import java.util.Scanner;

import static cwiczenie3.Main.*;

public class Menu {

    private String choice;
    private Scanner scan = new Scanner(System.in);

    public Menu() {
        choice = "Constructor";
    }

    public void printMenu() {

        do {

            System.out.printf(ANSI_WHITE + "----\n" + "Menu\n" + "----\n" +
                    "1. Set array size\n" +
                    "2. Fill array with random numbers\n" +
                    "3. Show array\n" +
                    "4. Bubble sorting\n" +
                    "5. Bucket sorting\n" +
                    "6. Exit\n\n" +
                    "Choice: ");
            choice = scan.nextLine();

            switch (choice) {
                case "1":
                    Main.arraySize();
                    break;
                case "2":
                    Main.randomArray();
                    break;
                case "3":
                    Main.printRandomArray();
                    break;
                case "4":
                    Main.bubble.sort(Main.array); //test
                    break;
                case "5":
                    Main.bucket.sort(Main.array);
                    break;
                case "6":
                    System.out.println(ANSI_GREEN + "\nBye bye!");
                default:
                    if (!"6".equals(choice)) {
                        System.out.println(ANSI_GREEN + "\nChoose again\n" + ANSI_WHITE);
                        choice = "0";
                    }
                    break;

            }
        } while (Integer.parseInt(choice) != 6);
    }
}
