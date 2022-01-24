package FactorialFibonacci;

import org.junit.Assert;
import org.junit.Test;

public class CalculationResultTest {

    @Test
    public void calculation() {
        String expected1 = CalculationResult.calculation(1, 1, 5);
        String expected2 = CalculationResult.calculation(2, 1, 5);

        Assert.assertEquals(expected1, "120");
        Assert.assertEquals(expected2, "[0, 1, 1, 2, 3]");
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void calculationExeption() {
        CalculationResult.calculation(3, 1, 5);
    }

    @Test
    public void factorialLoopTypeSelection() {
        int expected1 = CalculationResult.factorialLoopTypeSelection(1, 5);
        int expected2 = CalculationResult.factorialLoopTypeSelection(2, 5);
        int expected3 = CalculationResult.factorialLoopTypeSelection(3, 5);

        Assert.assertEquals(expected1, 120);
        Assert.assertEquals(expected2, 120);
        Assert.assertEquals(expected3, 120);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void factorialLoopTypeSelectionExeption() {
        CalculationResult.factorialLoopTypeSelection(4, 5);
        CalculationResult.factorialLoopTypeSelection(0, 5);
    }

    @Test
    public void fibonacciLoopTypeSelection() {
        int[] expected1 = CalculationResult.fibonacciLoopTypeSelection(1, 5);
        int[] expected2 = CalculationResult.fibonacciLoopTypeSelection(2, 5);
        int[] expected3 = CalculationResult.fibonacciLoopTypeSelection(3, 5);

        int[] actual = {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(expected1, actual);
        Assert.assertArrayEquals(expected2, actual);
        Assert.assertArrayEquals(expected3, actual);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void fibonacciLoopTypeSelectionExeption() {
        CalculationResult.fibonacciLoopTypeSelection(4, 5);
        CalculationResult.fibonacciLoopTypeSelection(0, 5);
    }
}