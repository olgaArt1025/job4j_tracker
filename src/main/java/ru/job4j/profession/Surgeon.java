package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String typeSurgeon;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String gettypeSurgeon() {
        return this.typeSurgeon;
    }
}
