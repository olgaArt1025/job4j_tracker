package ru.job4j.oop;

public class Doctor extends Profession {

    public Doctor (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Doctor() {
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnos = new Diagnosis();
        return diagnos;
    }

    public void symptoms() {
    }
}
