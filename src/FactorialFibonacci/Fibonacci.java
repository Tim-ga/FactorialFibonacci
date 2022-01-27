package FactorialFibonacci;

public class Fibonacci {

    private Fibonacci() {
    }

    protected static int[] fibonacciLoopTypeSelection(int loopType, int n) throws IncorrectVariableExeption {
        int[] result;
        switch (loopType) {
            case 1:
                result = Fibonacci.fibonacciCycleWhile(n);
                break;
            case 2:
                result = Fibonacci.fibonacciCycleDoWhile(n);
                break;
            case 3:
                result = Fibonacci.fibonacciCycleFor(n);
                break;
            default:
                throw new IncorrectVariableExeption("Ошибка! Значение \"n\" должно быть от 1 до 3!");
        }
        return result;
    }

    private static int[] fibonacciCycleWhile(int n) {
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

    private static int[] fibonacciCycleDoWhile(int n) {
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

    private static int[] fibonacciCycleFor(int n) {
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
