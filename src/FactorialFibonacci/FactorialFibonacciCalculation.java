package FactorialFibonacci;
import java.util.Arrays;

public class FactorialFibonacciCalculation {

    private FactorialFibonacciCalculation() {
    }

    public static String algorithmIdSelection(int algorithmId, int loopType, int n) throws IncorrectVariableExeption {
        String result;
        switch (algorithmId) {
            case 1:
                result = String.valueOf(Factorial.factorialLoopTypeSelection(loopType, n));
                break;
            case 2:
                result = Arrays.toString(Fibonacci.fibonacciLoopTypeSelection(loopType, n));
                break;
            default:
                throw new IncorrectVariableExeption("Ошибка! Значение \"n\" должно быть 1 или 2!");
        }
        return result;
    }

    @Override
    public String toString() {
        return "CalculationResult{}";
    }
}

