package za.ac.cput.adp3assignment2;

import java.util.Objects;

/**
 * @author Sihle Jijana
 * @stdno: 216273919
 * This is a small program for car attributes
 */

public class Car {

    private String registration, model, colour;
    private int yearModel;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registration='" + registration + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", yearModel='" + yearModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return registration.equals(car.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }
}
