package ru.job4j.profession;

public class Dentist extends Doctor {
    private String typeDentist;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.typeDentist = typeDentist;
    }

    public String getTypeDentist() {
        return typeDentist;
    }
}
