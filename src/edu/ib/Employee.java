package edu.ib;

/**
 * Tutorial on Interfaces: Comparable interface
 * @author MI
 */
public class Employee implements Comparable<Employee> {
    private final String firstName;
    private final String lastName;
    private int age;

    /**
     *Constructs a new Employee object with the given first name, last name, and age
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param age age of the employee
     */
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

    /**
     * toString method ovverride
     * @return string with Employees' first name, last name, and age
     */
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

    /**
     * compareTo override: sorting by age
     * @param o the object to be compared.
     * @return result of the comparison
     */
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(age,o.getAge());
    }

}
