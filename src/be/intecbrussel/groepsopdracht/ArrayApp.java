package be.intecbrussel.groepsopdracht;



public class ArrayApp {
    public static void main(String[] args) {
        IntArrayTools Program1 = new IntArrayTools();
        IntArrayTools Program2 = new IntArrayTools();

        int [] numbers = {1,2,3,4,5};
        printArray(numbers);
        System.out.println("is the array of numbers sorted? " + IntArrayTools.isSorted(numbers,true));



    }

    private static void printArray(int[] numbers) {
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}