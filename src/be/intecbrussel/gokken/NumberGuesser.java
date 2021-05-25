package be.intecbrussel.gokken;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    private int[] computerNumbers = new int[5];
    private int[] userNumbers = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public void play() {
        generateComputerNumbers();
        askUserNumbers();
        printResults();
    }

    private void printResults() {
        System.out.print("Getallen gebruiker: \t");
        printArray(userNumbers);
        System.out.print("Getallen computer: \t");
        printArray(computerNumbers);
        System.out.println();
        System.out.println("****************");
        System.out.println("aantal keer goed gegokt: " + calculateCorrectGuesses());

    }

    private int calculateCorrectGuesses() {
        int count = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            if (computerNumbers[i] == userNumbers[i]) {
                count++;
            }

        }
        return count;


    }

    private void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private void askUserNumbers() {

        int guess = -1;
        for (int i = 0; i < userNumbers.length; i++) {
            do {
                System.out.print("Gok " + (i + 1) + ": ");
                guess = scanner.nextInt();
            }
            while (guess <= 0 || guess > 10);
            userNumbers[i] = guess;
        }

    }

    private void generateComputerNumbers() {
        Random generator = new Random();
        for (int i = 0; i < computerNumbers.length; i++) {
            computerNumbers[i] = generator.nextInt(10) + 1;
        }
    }

}
