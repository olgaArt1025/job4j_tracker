package ru.job4j.oop;

public class Builder extends Engineer{
    private String color;

    public Builder (String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Builder(){
    }

    public void chosenColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Builder  сustomer1 = new Builder();
        сustomer1.cost();
        сustomer1.chosenColor("White");
        Builder builder = new Builder("Mark", "Foster", "builder",
                "09/06/1978"
        );
        System.out.println(builder.getName() + " works as a " + builder.getEducation()
                + " His birthday is " + builder.getBirthday()
        );
    }
}
