package FactorialFibonacci;

public class IncorrectVariableExeption extends RuntimeException{
    public IncorrectVariableExeption(String description){
        super(description);
    }
}
