package edu.ib;

import java.util.Arrays;
import java.util.Comparator;

public class InterfaceTester {
    public static void main(String[] args) {
        String [] friends={"John","Alan","Ben"};
        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));

        Employee e1= new Employee("John","Wick", 40);
        Employee e2= new Employee("Betty","Parsons", 30);
        Employee e3= new Employee("Chris","Anderson", 67);

        Employee [] employees={e1,e2,e3};
        System.out.println(Arrays.toString(employees));
       //Arrays.sort(employees); // interface Comparable
        //Arrays.sort(employees, new AgeComparator());
        //Arrays.sort(employees, new FirstNameComparator());
//
        Arrays.sort(employees,( Employee em1, Employee em2)
                -> Integer.compare(em1.getAge(),em2.getAge()));

        System.out.println(Arrays.toString(employees));


    }
}
