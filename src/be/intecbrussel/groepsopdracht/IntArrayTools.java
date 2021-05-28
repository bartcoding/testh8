package be.intecbrussel.groepsopdracht;

import java.util.Random;
import java.util.Scanner;

public class IntArrayTools {

    private static int[] arrayNumbers = new int[5];
    Scanner scanner = new Scanner(System.in);
    public int answer = -1;
    public int searchNumber;
    public boolean checkNumber;

    public void startProgram() {
        generateNumbers();
        question();
        isSorting(arrayNumbers);
        printArray(arrayNumbers);
        //isSorted(arrayNumbers);
        chopSearch();
    }

    public void chopSearch() {

        int counter = 0;

        System.out.println("Give a number you want to search for between 1-10: ");
        searchNumber = scanner.nextInt();
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (searchNumber == arrayNumbers[i]) {
                counter++;
            }
            if (counter > 0) {
                checkNumber = true;
            } else {
                checkNumber = false;
            }

        }
        System.out.println("Is your number in the array? " + checkNumber);
    }


    private void generateNumbers() {
        Random generator = new Random();

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = generator.nextInt(10) + 1;
        }
    }

    public static boolean isSorted(int[] array, boolean isAscending) {
        int counter = 0;
        boolean isSorted = false;

        if (isAscending) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    counter++;
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    counter++;
                }
            }
        }

        if (counter == array.length - 1) {
            isSorted = true;
        }
        System.out.println("Array is sorted? " + isSorted + " it is ascending: " + isAscending);
        return isSorted;
    }

    private void question() {

        printArray(arrayNumbers);
        System.out.println("");
        System.out.println("How do you want to sort this array?");
        System.out.println("1. Ascending\t2. Descending");


        //valid input for question menu

        do {
            System.out.println("Enter answer:");
            answer = scanner.nextInt();
        }
        while (answer <= 0 || answer > 2);


    }

    private void isSorting(int[] array) {
        // Ascending array
        if (answer == 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;
                    }
                }
            }
        } else {         // Descending array
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] < array[j]) {
                        int tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;
                    }
                }
            }
        }


    }

    private void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}