package FactorialFibonacci;

public class Fibonacci {

    protected static int[] fibonacciCycleWhile(int n) {
        int[] array = new int[n];
        array[1] = 1;
        int i = 2;
        while (i < array.length) {
            int a = i - 1;
            int b = i - 2;
            array[i] = array[b] + array[a];
            i++;
        }
        return array;
    }

    protected static int[] fibonacciCycleDoWhile(int n) {
        int[] array = new int[n];
        array[1] = 1;
        int i = 2;
        do {
            int a = i - 1;
            int b = i - 2;
            array[i] = array[b] + array[a];
            i++;
        } while (i < array.length);
        return array;
    }

    protected static int[] fibonacciCycleFor(int n) {
        int[] array = new int[n];
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            int a = i - 1;
            int b = i - 2;
            array[i] = array[b] + array[a];
        }
        return array;
    }

    @Override
    public String toString() {
        return "Fibonacci{}";
    }
}
