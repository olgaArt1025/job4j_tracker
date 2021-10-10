package ru.job4j.oop;

public class Surgeon extends Doctor{

    public Surgeon() {
        super.getName();
        super.getSurname();
        super.getEducation();
        super.getBirthday();
    }

    public void breakSomething() {
    }

    public static void main(String[] args) {
        Surgeon  pacient1 = new Surgeon();
        pacient1.symptoms();
        pacient1.breakSomething();
    }
}

