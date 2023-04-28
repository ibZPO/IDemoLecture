package edu.ib;

public class Sinus implements ScalarFunction {
    @Override
    public double f(double x) {
        return Math.sin(x);
    }
}
