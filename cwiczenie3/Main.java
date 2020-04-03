package cwiczenie3;

import cwiczenie3.sort.Bubble;
import cwiczenie3.sort.Bucket;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
    public static int[] array = new int[200];
    public static int arraySize = array.length;
    public static int numberSpread = 200;

    public static Random rand = new Random();
    public static Bubble bubble = new Bubble();
    public static Bucket bucket = new Bucket();
    public static Scanner scan = new Scanner(System.in);

    public static void randomArray() {
        for (int i = 0; i < arraySize; i++) { //wypelnianie tablicy
            array[i] = rand.nextInt(numberSpread);
        }
        System.out.println(ANSI_BRIGHT_GREEN  + "\nRandom array created!\n" + ANSI_WHITE);
    }

    public static void printRandomArray() {

        int n = 50;

        System.out.print("\n" + ANSI_GREEN);

        for (int j = 0; j < (arraySize/50); j++) {

            for (int i = 0; i < 50; i++) {

                System.out.print(array[n-50] + ", "); //napraw ostatnia linie
                n++;
            }
            if (n != (arraySize/50+50)) {
                System.out.print("\n");
            }
        }
        System.out.print("\n" + ANSI_WHITE);
    }

    public static void arraySize() {
        System.out.print(ANSI_GREEN + "\nArray size: ");
        arraySize = Integer.parseInt(scan.nextLine());
        array = new int[arraySize];
        System.out.println("\n" + arraySize + " elements created!\n" + ANSI_WHITE);
    }

    public static void main(String[] args){

        Menu menu = new Menu();
        menu.printMenu();
    }
}
