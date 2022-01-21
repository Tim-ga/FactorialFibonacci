package FactorialFibonacci;
import java.util.Arrays;

public class CalculationResult {

    public static String calculation(int algorithmId, int loopType, int n) throws IncorrectVariableExeption {
        String result = "";
        switch (algorithmId) {
            case 1:
                result = String.valueOf(CalculationResult.factorialLoopTypeSelection(loopType, n));
                break;
            case 2:
                result = Arrays.toString(CalculationResult.fibonacciLoopTypeSelection(loopType, n));
                break;
            default:
                throw new IncorrectVariableExeption("Ошибка! Значение \"n\" должно быть 1 или 2!");
        }
        return result;
    }

    public static int factorialLoopTypeSelection(int loopType, int n) throws IncorrectVariableExeption {
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
                throw new IncorrectVariableExeption("Ошибка! Значение \"n\" должно быть от 1 до 3!");
        }
        return result;
    }

    public static int[] fibonacciLoopTypeSelection(int loopType, int n) throws IncorrectVariableExeption {
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
                throw new IncorrectVariableExeption("Ошибка! Значение \"n\" должно быть от 1 до 3!");
        }
        return result;
    }

    @Override
    public String toString() {
        return "CalculationResult{}";
    }
}

