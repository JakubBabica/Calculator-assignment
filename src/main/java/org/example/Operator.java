package org.example;

public class Operator implements Token{
    private char value;
    public Operator(char value)
    {
        this.value = value;
    }
    @Override
    public Object get() {
        return value;
    }

}
