package ru.job4j.profession;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Andrey", "White",
                "programmer", "19/04/1995"
        );
        System.out.println(programmer.getName() + " works as a " + programmer.getEducation()
                + " His birthday is " + programmer.getBirthday()
        );
    }
}
