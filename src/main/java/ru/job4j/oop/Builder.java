package ru.job4j.oop;

public class Builder extends Engineer{
    private String color;

    public Builder() {
        super.getName();
        super.getSurname();
        super.getEducation();
        super.getBirthday();
    }

    public void chosenColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        Builder  сustomer1 = new Builder();
        сustomer1.cost();
        сustomer1.chosenColor("White");
    }
}
