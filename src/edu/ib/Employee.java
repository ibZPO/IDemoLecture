package edu.ib;

public class Employee implements Comparable<Employee> {
    private final String firstName;
    private final String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    //    @Override
//    public int compareTo(Employee o) {
//        return firstName.compareTo(o.getFirstName());
//    }
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(age,o.getAge());
    }

}
