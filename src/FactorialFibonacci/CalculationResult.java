package FactorialFibonacci;

import java.util.Arrays;

public class CalculationResult {

    public static void calculation(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case 1:
                int resultInt = CalculationResult.factorialLoopTypeSelection(loopType, n);
                System.out.println(resultInt);
                break;
            case 2:
                int[] resultArray = CalculationResult.fibonacciLoopTypeSelection(loopType, n);
                System.out.println(Arrays.toString(resultArray));
                break;
            default:
                System.out.println("Ошибка! Значение \"n\" должно быть 1 или 2!");
                break;
        }
    }

    public static int factorialLoopTypeSelection(int loopType, int n) {
        int result = 0;
        switch (loopType) {
            case 1:
                result = Factorial.factorialCycleWhile(n);
                break;
            case 2:
                result = Factorial.factorialCycleDoWhile(n);
                break;
            case 3:
                result = Factorial.factorialCycleFor(n);
                break;
            default:
                System.out.println("Ошибка! Значение \"n\" должно быть от 1 до 3!");
                break;
        }
        return result;
    }

    public static int[] fibonacciLoopTypeSelection(int loopType, int n) {
        int[] result = new int[0];
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
                System.out.println("Ошибка! Значение \"n\" должно быть от 1 до 3!");
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "CalculationResult{}";
    }
}

