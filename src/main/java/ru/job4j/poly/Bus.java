package ru.job4j.poly;

public class Bus implements Transport {
    private int number;

    @Override
    public void drive() {
        System.out.println("Go");
    }

    @Override
    public void numberOfPassengers(int number) {
        this.number = number;
    }

    @Override
    public double refuel(int amount) {
        double sum = 1250;
        double price = sum / amount;
        return price;
    }
}
