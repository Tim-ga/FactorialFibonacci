package FactorialFibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibonacciLoopTypeSelection() {
        int[] expected1 = Fibonacci.fibonacciLoopTypeSelection(1, 5);
        int[] expected2 = Fibonacci.fibonacciLoopTypeSelection(2, 5);
        int[] expected3 = Fibonacci.fibonacciLoopTypeSelection(3, 5);

        int[] actual = {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(expected1, actual);
        Assert.assertArrayEquals(expected2, actual);
        Assert.assertArrayEquals(expected3, actual);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void fibonacciLoopTypeSelectionExeption() {
        Fibonacci.fibonacciLoopTypeSelection(4, 5);
        Fibonacci.fibonacciLoopTypeSelection(0, 5);
    }
}