package FactorialFibonacci;

public class Factorial {

    private Factorial() {
    }

    protected static int factorialLoopTypeSelection(int loopType, int n) throws IncorrectVariableExeption {
        int result;
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

     private static int factorialCycleWhile(int n) {
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

    private static int factorialCycleDoWhile(int n) {
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

    private static int factorialCycleFor(int n) {
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
