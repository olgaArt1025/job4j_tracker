package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String typeSurgeon;

    public Surgeon(String name, String surname, String education, String birthday,
                   String hospital, String typeSurgeon) {
        super(name, surname, education, birthday, hospital);
        this.typeSurgeon = typeSurgeon;
    }

    public String getTypeSurgeon() {
        return this.typeSurgeon;
    }
}
