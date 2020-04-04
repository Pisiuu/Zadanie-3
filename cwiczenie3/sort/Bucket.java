package cwiczenie3.sort;

import static cwiczenie3.Main.ANSI_GREEN;
import static cwiczenie3.Main.ANSI_WHITE;

public class Bucket implements Sortable {

    private int count;
    private int arraySize;
    private int temp;
    private int counter;
    private int[] bucketArray;

    public void Bucket() {

        counter = 0;
        count = 0;
        arraySize = 0;
        temp = 0;
        for (int i = 0; i < (arraySize+1); i++){
            bucketArray[i] = 0;
        }
    }

    @Override
    public int[] sort(int[] array) {

        counter = 0;
        arraySize = array.length;
        bucketArray = new int[(arraySize+1)];

        for (int i = 0; i < arraySize; i++) {

           temp = array[i];
           bucketArray[temp]++;
           stepCounting();
           //System.out.println(bucketArray[temp]); //bucketArray dziala
           //System.out.println(array[i]); //dziala
        }

        for (int i = 0; i < (arraySize + 1); i++) { //oproznianie bucketArray

            while(bucketArray[i] != 0) {

                array[counter] = i;
                bucketArray[i]--;
                stepCounting();
                counter++;
            }
        }

        System.out.println(ANSI_GREEN + "\nNumbers sorted!");
        printSorted(array);
        printCount();
        return null;
    }

    @Override
    public void stepCounting()  {

        count++;
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

        for (int j = 0; j < (arraySize / 50); j++) {

            for (int i = 0; i < 50; i++) {

                System.out.print(array[n - 50] + ", "); //napraw ostatnia linie
                n++;
            }
            if (n != (arraySize / 50 + 50)) {
                System.out.print("\n");
            }
        }
    }
}
