package com.company.homework8.car_showroom;

import java.util.ArrayList;
import java.util.Objects;

public class Method implements Inter {
    ArrayList<Car> carList=new ArrayList<>();

    public void outPut(Car m) {
        System.out.print(" Id:"+m.getId());
        System.out.print(" Brand:"+m.getCarBrand());
        System.out.print(" Model:"+m.getCarModel());
        System.out.print(" Engine:"+m.getTypeEngine());
        System.out.print(" Mileage:"+m.getCarMileage());
        System.out.print(" Colour:"+m.getCarColour());
        System.out.print(" Cost:"+m.getCarCost());
        System.out.print(" gearBox:"+m.getGearBox());
        System.out.println();
    }

    @Override
    public void search(ArrayList<Car> carList, int carCost1, int carCost2) {
        for (Car m : carList) {
            if (m != null) {
                if ((m.getCarMileage()) == 0 && m.getCarCost() >= carCost1 && m.getCarCost()<=carCost2) {
                    outPut(m);
                } else if ((m.getCarMileage())>0 && m.getCarCost() >= carCost1 && m.getCarCost()<=carCost2) {
                    outPut(m);
                }
            }
        }
        System.out.println();
    }

    @Override
    public void search(ArrayList<Car> carList, int carMileage, String car) {
        for (Car m : carList) {
            if (m != null) {
                if ((m.getCarMileage()) == 0 && (car.equalsIgnoreCase(m.getCarBrand()) || car.equalsIgnoreCase(m.getCarModel())
                        || car.equalsIgnoreCase(m.getTypeEngine()) || car.equalsIgnoreCase(m.getGearBox())
                        || car.equalsIgnoreCase(m.getCarColour()))) {
                    outPut(m);
                } else if ((m.getCarMileage())>0 && (car.equalsIgnoreCase(m.getCarBrand()) || car.equalsIgnoreCase(m.getCarModel())
                        || car.equalsIgnoreCase(m.getTypeEngine()) || car.equalsIgnoreCase(m.getGearBox())
                        || car.equalsIgnoreCase(m.getCarColour()))) {
                    outPut(m);
                }
            }
        }
        System.out.println();
    }

    @Override
    public void search(ArrayList<Car> carList, int carMileage, String carBrand, String carModel) {
        for (Car m : carList) {
            if (m != null) {
                if ((m.getCarMileage()) == 0 && (carBrand.equalsIgnoreCase(m.getCarBrand()) && carModel.equalsIgnoreCase(m.getCarModel()))) {
                    outPut(m);
                } else if ((m.getCarMileage())>0 && (carBrand.equalsIgnoreCase(m.getCarBrand()) && carModel.equalsIgnoreCase(m.getCarModel()))) {
                    outPut(m);
                }
            }
        }
        System.out.println();
    }

    @Override
    public void search(ArrayList<Car> carList, int carMileage) {
        for (Car m : carList) {
            if (m != null) {
                if ((m.getCarMileage()) == 0) {
                    outPut(m);
                } else if (m.getCarMileage()>0) {
                    outPut(m);
                }
            }
        }
        System.out.println();
    }
}

