package FactorialFibonacci;

public class Factorial {

     protected static int factorialCycleWhile(int n) {
        int result = 1;
        int[] array = new int[n];
        int i = 0;
        while (i < array.length) {
            array[i] = i + 1;
            result *= array[i];
            i++;
        }
        return result;
    }

    protected static int factorialCycleDoWhile(int n) {
        int result = 1;
        int[] array = new int[n];
        int i = 0;
        do {
            array[i] = i + 1;
            result *= array[i];
            i++;
        } while (i < array.length);
        return result;
    }

    protected static int factorialCycleFor(int n) {
        int result = 1;
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
            result *= array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "Factorial{}";
    }
}
