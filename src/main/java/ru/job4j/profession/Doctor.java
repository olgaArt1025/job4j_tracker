package ru.job4j.profession;

public class Doctor extends Profession {
    private String hospital;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getHospitalType() {
        return this.hospital;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnos = new Diagnosis();
        return diagnos;
    }
}
