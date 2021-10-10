package ru.job4j.oop;

public class Programmer extends Engineer{

    public Programmer() {
        super.getName();
        super.getSurname();
        super.getEducation();
        super.getBirthday();
    }

    public void handleFile() {
    }

    public static void main(String[] args) {
        Programmer  сustomer1 = new Programmer();
        сustomer1.cost();
        сustomer1.handleFile();
    }
}
