package org.example;

public class Calculator {

    public int add(int... numbers) {
        int Sum = 0;
        for (int number : numbers) {
            Sum += number;
        }
        return Sum;
    }
}
