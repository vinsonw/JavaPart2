package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);
//        var textBox1 = new TextBox();
//        var textBox2 = textBox1;
//        textBox2.setText("helloworld");
//        System.out.println(textBox1.text);
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//
//        int ttlSalary = calculateWage(baseSalary, extraHours, hourlyRate);
//        System.out.println(ttlSalary);
//        var employee = new Employee(50_000, 20);
//        employee.baseSalary = 50_000;
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
//        int wage = employee.calculateWage();
//        System.out.println(wage);
//        System.out.println(Employee.numberOfEmployees);
//        Employee.printNumberOfEmployees();
        var mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.printMortgage();
        mortgageCalculator.printPaymentSchedule();
    }
}
