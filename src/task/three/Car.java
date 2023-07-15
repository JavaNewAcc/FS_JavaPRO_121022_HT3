package task.three;

import java.io.Serializable;

public class Car implements Serializable {
//    @Save
    private String make = "";
//    @Save
    private String model = "";
    private int prodYear = 0;
//    @Save
    private int displacement = 0;
//    @Save
    private int power = 0;
    private String driveType = "";
    private String color = "";

    public Car() {
    }

    public Car(String make, String model, int prodYear, int displacement, int power, String driveType, String color) {
        this.make = make;
        this.model = model;
        this.prodYear = prodYear;
        this.displacement = displacement;
        this.power = power;
        this.driveType = driveType;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", prodYear=" + prodYear + ", displacement=" + displacement + ", power=" + power + ", driveType='" + driveType + '\'' + ", color='" + color + '\'' + '}';
    }
}
