package ru.job4j.profession;

public class Dentist extends Doctor {
    private String typeDentist;

    public Dentist(String name, String surname, String education, String birthday,
                   String hospital, String typeDentist) {
        super(name, surname, education, birthday, hospital);
        this.typeDentist = typeDentist;
    }

    public String getTypeDentist() {
        return this.typeDentist;
    }
}
