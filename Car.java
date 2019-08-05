package com.company.homework8.car_showroom;

import java.util.Objects;

public class Car {
    private int id;
    private  String carBrand;
    private String carModel;
    private String typeEngine;
    private int carMileage;
    private String carColour;
    private int carCost;
    private String gearBox;

    public Car(int id, String carBrand, String carModel, String typeEngine, int carMileage, String carColour, int carCost, String gearBox) {
        this.id=id;
        this.carBrand=carBrand;
        this.carModel=carModel;
        this.typeEngine=typeEngine;
        this.carMileage=carMileage;
        this.carColour=carColour;
        this.carCost=carCost;
        this.gearBox=gearBox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand=carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel=carModel;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine=typeEngine;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage=carMileage;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour=carColour;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost=carCost;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox=gearBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car=(Car) o;
        return getId() == car.getId() &&
                getCarMileage() == car.getCarMileage() &&
                getCarCost() == car.getCarCost() &&
                getCarBrand().equals(car.getCarBrand()) &&
                getCarModel().equals(car.getCarModel()) &&
                getTypeEngine().equals(car.getTypeEngine()) &&
                getCarColour().equals(car.getCarColour()) &&
                getGearBox().equals(car.getGearBox());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarBrand(), getCarModel(), getTypeEngine(), getCarMileage(), getCarColour(),
                getCarCost(), getGearBox());
    }
}
