package ru.job4j.stream;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String colour;
    private String vin;
    private boolean automaticTransmission;
    private String fuel;

    static class Builder {
        private String brand;
        private String model;
        private int yearOfManufacture;
        private String colour;
        private String vin;
        private boolean automaticTransmission;
        private String fuel;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildYearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
            return this;
        }

        Builder buildColour(String colour) {
            this.colour = colour;
            return this;
        }

        Builder buildVin(String vin) {
            this.vin = vin;
            return this;
        }

        Builder buildAutomaticTransmission(boolean automaticTransmission) {
            this.automaticTransmission = automaticTransmission;
            return this;
        }

        Builder buildFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.yearOfManufacture = yearOfManufacture;
            car.colour = colour;
            car.vin = vin;
            car.automaticTransmission = automaticTransmission;
            car.fuel = fuel;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", yearOfManufacture=" + yearOfManufacture
                + ", colour='" + colour + '\''
                + ", vin='" + vin + '\''
                + ", automaticTransmission=" + automaticTransmission
                + ", fuel='" + fuel + '\''
                + '}';
    }

    public static void main(String[] args) {
        Car car = new Builder().buildBrand("Volkswagen")
                .buildModel("Tiguan")
                .buildYearOfManufacture(2021)
                .buildVin("3VWJUGV1258YTGB")
                .buildColour("blue")
                .buildAutomaticTransmission(true)
                .buildFuel("diesel")
                .build();
        System.out.println(car);
    }
}
