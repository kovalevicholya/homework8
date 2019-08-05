package com.company.homework8.car_showroom;

import java.util.ArrayList;

public interface Inter {
    void search (ArrayList<Car> carList, int carMileage, String car);
    void search (ArrayList<Car> carList, int carCost1, int carCost2);
    void search (ArrayList<Car>carList, int carMileage, String carBrand, String carModel);
    void search(ArrayList<Car> carList, int carMileage);
}
