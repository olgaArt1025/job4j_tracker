package ru.job4j.oop;

public class Engineer extends Profession {

    public Engineer (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer() {
    }

    public Project ordering(Сustomer сustomer) {
        Project rsl = new Project();
        return rsl;
    }

    public void cost() {
    }
}
