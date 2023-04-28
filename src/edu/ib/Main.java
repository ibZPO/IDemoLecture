package edu.ib;

public class Main {
    public static void main(String[] args) {
        Sinus sinus= new Sinus();
        SinusAdvanced sinusAdvanced= new SinusAdvanced(1,2);
        Tabulator tabulator= new Tabulator();
        tabulator.calculate(0,Math.PI,20,(x) -> Math.sin(x));
        tabulator.terminalDisplay();
    }
}