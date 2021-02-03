package com.Jeffrey;

public interface TaxCalculator {

    double calculateTax();

    static double getTax(double income, double expenses){
        return income - expenses;
    }
}
