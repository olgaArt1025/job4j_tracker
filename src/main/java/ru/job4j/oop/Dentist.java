package ru.job4j.oop;

public class Dentist extends Doctor {

    public Dentist (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Dentist(){
    }

    public static void main(String[] args) {
        Dentist pacient1 = new Dentist();
        pacient1.symptoms();
        Dentist dentist = new Dentist("Aleksandr", "Petrov", "dentist", "10/03/1990");
        System.out.println(dentist.getName());
    }

    public Toothache heal2(Pacient pacient) {
        Toothache diagnos = new Toothache();
        return diagnos;
    }
}

