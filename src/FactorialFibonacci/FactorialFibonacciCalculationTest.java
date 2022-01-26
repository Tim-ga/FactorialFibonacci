package FactorialFibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FactorialFibonacciCalculationTest {

    @Test
    public void calculation() {
        String expected1 = FactorialFibonacciCalculation.algorithmIdSelection(1, 1, 5);
        String expected2 = FactorialFibonacciCalculation.algorithmIdSelection(2, 1, 5);

        Assert.assertEquals(expected1, "120");
        Assert.assertEquals(expected2, "[0, 1, 1, 2, 3]");
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void calculationExeption() {
        FactorialFibonacciCalculation.algorithmIdSelection(3, 1, 5);
    }

}