package edu.ib;

import java.util.ArrayList;

public class Tabulator {
    private ArrayList<Double> xValues;
    private ArrayList<Double> yValues;

    public Tabulator() {
        xValues= new ArrayList<>();
        yValues= new ArrayList<>();
    }

    public  void calculate(double a, double b,int n, ScalarFunction func){
        clearData();
        double x=a;
        double y=0;
        double dx=(b-a)/(n-1);
        for(int i=0; i<n; i++){
            y=func.f(x);
            xValues.add(x);
            yValues.add(y);
            x+=dx;
        }

    }

    public void terminalDisplay(){
        for(int i =0; i<numberOfPoints(); i++){
            System.out.printf("%15.10f \t %15.10f \n",xValues.get(i),yValues.get(i));
        }

    }
    private void clearData(){
        xValues.clear();
        yValues.clear();
    }

    public int numberOfPoints(){
        return  xValues.size();
    }
}
