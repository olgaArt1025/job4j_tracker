package ru.job4j.profession;

public class Builder extends Engineer {
    private String color;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void chosenColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Clients client = new Clients();
        client.chosenColor("White");
        Builder builder = new Builder("Mark", "Foster", "builder",
                "09/06/1978"
        );
        System.out.println(builder.getName() + " works as a " + builder.getEducation()
                + " His birthday is " + builder.getBirthday()
        );
    }
}
