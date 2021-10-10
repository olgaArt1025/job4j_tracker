package ru.job4j.oop;

public class Programmer extends Engineer{

    public Programmer (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Programmer(){
    }

    public void handleFile() {
    }

    public static void main(String[] args) {
        Programmer  сustomer1 = new Programmer();
        сustomer1.cost();
        сustomer1.handleFile();
        Programmer programmer = new Programmer("Andrey", "White",
                "programmer", "19/04/1995"
        );
        System.out.println(programmer.getName() + " works as a " + programmer.getEducation() +
                " His birthday is " + programmer.getBirthday()
        );
    }
}
