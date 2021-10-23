package ru.job4j.profession;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String birthday) {
         super(name, surname, education, birthday);
    }

    public Project ordering(Clients client) {
         Project rsl = new Project();
         return rsl;
    }

    public double cost(int expenses) {
            return expenses;
    }
}
