package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        int zalikovka = 1316;
        int C2 = zalikovka % 2; // O1 +
        int C3 = zalikovka % 3; // constanta 2
        int C5 = zalikovka % 5; // O2 /
        int C7 = zalikovka & 7; // i j index char
        Calculation.startCalculate();
    }
}