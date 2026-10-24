package com.devops.lab;

public class App {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Maven Build Automation");
        System.out.println("Addition result: " + add(10, 20));
    }
}
