package org.example;

public class TriangleNumberCalculator {
    // Recursive function to compute nth triangular number
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    // Adds two triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Subtracts two triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}
