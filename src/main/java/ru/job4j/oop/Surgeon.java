package ru.job4j.oop;

public class Surgeon extends Doctor{

    public Surgeon (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Surgeon(){
    }

    public void breakSomething() {
    }

    public static void main(String[] args) {
        Surgeon  pacient1 = new Surgeon();
        pacient1.symptoms();
        pacient1.breakSomething();
        Surgeon surgeon = new Surgeon("Ivan", "Ivanov", "surgeon", "10/09/1975");
        System.out.println(surgeon.getSurname() + " " + surgeon.getEducation());
    }
}

