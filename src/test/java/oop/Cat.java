package oop;

public class Cat {
    private String food;

    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println("There are food" + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Cat Gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Cat Black");
        black.eat("fish");
        black.show();
    }
}
