package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(888, 999));
        System.out.println(calc.mult(109, 26));
        System.out.println(calc.pow(4, 10));
    }
}