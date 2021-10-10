package ru.job4j.oop;

public class Doctor extends Profession {

    public Doctor() {
        super.getName();
        super.getSurname();
        super.getEducation();
        super.getBirthday();
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnos = new Diagnosis();
        return diagnos;
    }

    public void symptoms() {
    }
}
