package FactorialFibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialLoopTypeSelection() {
        int expected1 = Factorial.factorialLoopTypeSelection(1, 5);
        int expected2 = Factorial.factorialLoopTypeSelection(2, 5);
        int expected3 = Factorial.factorialLoopTypeSelection(3, 5);

        Assert.assertEquals(expected1, 120);
        Assert.assertEquals(expected2, 120);
        Assert.assertEquals(expected3, 120);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void factorialLoopTypeSelectionExeption() {
        Factorial.factorialLoopTypeSelection(4, 5);
        Factorial.factorialLoopTypeSelection(0, 5);
    }
}