package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String typeSurgeon;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String gettypeSurgeon() {
        return this.typeSurgeon;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Ivan", "Ivanov", "surgeon", "10/09/1975");
        System.out.println(surgeon.getSurname() + " " + surgeon.getEducation());
    }
}
