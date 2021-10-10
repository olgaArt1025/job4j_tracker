package ru.job4j.oop;

public class Dentist extends Doctor {

    public Dentist() {
        super.getName();
        super.getSurname();
        super.getEducation();
        super.getBirthday();
    }

    public static void main(String[] args) {
        Dentist pacient1 = new Dentist();
        pacient1.symptoms();
    }

    public Toothache heal2(Pacient pacient) {
        Toothache diagnos = new Toothache();
        return diagnos;
    }
}

