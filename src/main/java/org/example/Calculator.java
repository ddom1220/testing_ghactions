package org.example;

public class Calculator {

    public int badAdd(int a, int b) {
        int r = 0;
        if (a == 2 && b == 3) {
            r = 5;
        }
        return r;
    }

    public int add(int... numbers) {
        int Sum = 0;
        for (int number : numbers) {
            Sum += number;
        }
        return Sum;
    }
}
