package edu.ib;

public class SinusAdvanced implements ScalarFunction {
    private  double a;
    private  double b;

    public SinusAdvanced(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return a*Math.sin(x)+ b;
    }
}
