package org.example;

public class Operand implements Token{
    private int number;
    public Operand(int number)
    {
        this.number = number;
    }

    @Override
    public Object get() {
        return number;
    }

}
