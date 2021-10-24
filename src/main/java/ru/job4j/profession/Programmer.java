package ru.job4j.profession;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }
}
