package org.example;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("shahul", 34, 32);
        Analyst a1 = new Analyst("hameed", 32, 43);
        Salesperson s1 = new Salesperson("shyam", 34, 23, 2);

        System.out.println(a1.getName());
    }
}