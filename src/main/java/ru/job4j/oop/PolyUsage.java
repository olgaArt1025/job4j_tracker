package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();

        Vehicle[] vehicles = new Vehicle[]{train, bus, plane};
        for (Vehicle i : vehicles) {
            i.move();
        }
    }
}
