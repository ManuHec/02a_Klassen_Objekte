package com.cc.java;

public class App {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Lina", "braun - weiss", 20); // Klasse --> opjekt /Instanz
        output("Name: " + cat1.getName() + " " + "Alter: " + cat1.getAge() + " " + "Fellfarbe: " + " "
                + cat1.getFurColor());
        output("RAM-Adresse: " + cat1.getAdresse());

        output("-------------------");

        Cat cat2 = new Cat("Zita", "schwarz", 21); // Klasse --> opjekt /Instanz
        output("RAM- Adresse: " + cat2.getAdresse());

        // cat2.setName("Thomas");

        output("Name: " + cat2.getName() + " " + "Alter: " + cat2.getAge() + " " + "Fellfarbe: " + " "
                + cat2.getFurColor());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
