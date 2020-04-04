package cwiczenie3.sort;

import static cwiczenie3.Main.ANSI_GREEN;
import static cwiczenie3.Main.ANSI_WHITE;

public class Bubble implements Sortable {

    private int count; //zrob private
    private int arraySize;
    private int temp;
    private int counter;
    private int[] errorFixArray;

    public void Bubble() {
        count = 0;
        arraySize = 0;
        temp = 0;
        counter = 0;
    }

    @Override
    public void stepCounting() {
        count++;
    }

    @Override
    public int[] sort(int[] tab) {

        arraySize = tab.length;
        counter = arraySize - 1;


        for (int i = 0; i < (arraySize - 1); i++) {

            if (counter != 0) {

                counter = arraySize - 1;

                for (int j = 0; j < (arraySize - 1); j++) {

                        if (tab[j] > tab[j + 1]) {

                            temp = tab[j];
                            tab[j] = tab[j + 1];
                            tab[j + 1] = temp;
                        } else counter--;
                        stepCounting();
                }
            }
        }

        System.out.println(ANSI_GREEN + "\nNumbers sorted!");
        printSorted(tab);
        printCount();
            return null;
    }

    @Override
    public void printCount() {

        System.out.println("\nSorted after " + count + " tries\n" + ANSI_WHITE);
        count = 0;
    }

    @Override
    public void printSorted(int[] array) {

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
    }
}
