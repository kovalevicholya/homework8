package com.company.homework8.car_showroom;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> car=new ArrayList<Car>();
        Car c0=new Car(100001, "Audi", "A1", "Petro", 0,
                "Red", 5000, "Mechanical");
        Car c1=new Car(100002, "Audi", "A2", "Petro", 0,
                "Green", 6500, "Mechanical");
        Car c2=new Car(100003, "Audi", "A3", "Petro", 0,
                "Yellow", 7450, "Automatic");
        Car c3=new Car(100004, "Audi", "A3", "Petro", 0,
                "Red", 7500, "Automatic");
        Car c4=new Car(100004, "Audi", "A3", "Petro", 0,
                "Black", 7400, "Automatic");

        car.add(c0);
        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);

        Method l=new Method();

        {
            int id;
            String carBrand;
            String carModel;
            String typeEngine;
            int carMileage;
            String carColour;
            int carCost;
            String gearBox;
        }
        int flag;
        do {

            Scanner in=new Scanner(System.in);
            System.out.println("Если Вы хотите добавить новый автомобиль в базу салона, введите 1:");
            System.out.println("Если Вы хотите вывести список новых автомобилей салона, введите 2:");
            System.out.println("Если Вы хотите вывести список поддержаных автомобилей салона, введите 3:");
            System.out.println("Если Вы хотите вывести список новых автомобилей определенной модели, марки, "+
                    "типа двигателя, типа коробки передач или цвета имеющихся в салоне, введите 4:");
            System.out.println("Если Вы хотите вывести список поддержаных автомобилей определенной модели, марки, "+
                    "типа двигателя, типа коробки передач или цвета имеющихся в салоне, введите 5:");
            System.out.println("Если Вы хотите вывести список новых автомобилей определенной модели и марки введите 6:");
            System.out.println("Если Вы хотите вывести список поддержаных автомобилей определенной модели и марки введите 7:");
            System.out.println("Если Вы хотите удалить автомобиль, введите 8:");
            int number=in.nextInt();

            switch (number) {
                case 1:
                    Scanner in1=new Scanner(System.in);
                    System.out.println("Введите уникальный номер автомобиля:");
                    int a1=in1.nextInt();
                    System.out.println("Введите марку автомобиля:");
                    String a2=in1.nextLine();
                    a2=in1.nextLine();
                    System.out.println("Введите модель автомобиля:");
                    String a3=in1.nextLine();
                    System.out.println("Введите тип двигателя автомобиля:");
                    String a4=in1.nextLine();
                    System.out.println("Введите пробег автомобиля:");
                    int a5=in1.nextInt();
                    System.out.println("Введите цвет автомобиля:");
                    String a6=in1.nextLine();
                    a6=in1.nextLine();
                    System.out.println("Введите стоимость автомобиля:");
                    int a7=in1.nextInt();
                    System.out.println("Введите тип коробки передач автомобиля:");
                    String a8=in1.nextLine();
                    a8=in1.nextLine();

                    Car c = new Car(a1, a2, a3, a4, a5, a6, a7, a8);
                    car.add(c);


                    break;
                case 2:
                    l.search(car, 0);
                    break;
                case 3:
                    l.search(car, 2);
                    break;
                case 4:
                    System.out.println("Введите марку, модель, тип двигателя, тип коробки передач или цвет автомобиля:");
                    String parametr1=in.nextLine();
                    l.search(car, 0, in.nextLine());
                    break;
                case 5:
                    System.out.println("Введите марку, модель, тип двигателя, тип коробки передач или цвет автомобиля:");
                    String parametr2=in.nextLine();
                    l.search(car, 2, in.nextLine());
                    break;
                case 6:
                    System.out.println("Введите марку и модель автомобиля:");
                    String parametr3=in.nextLine();

                    l.search(car, 0, in.nextLine(), in.nextLine());
                    break;
                case 7:
                    System.out.println("Введите марку и модель автомобиля:");
                    String parametr4=in.nextLine();

                    l.search(car, 2, in.nextLine(), in.nextLine());
                    break;
                case 8:
                    System.out.println("Введите id автомобиля для удаления:");
                    int id=in.nextInt();
                    for (Car m : car) {
                        if (m != null) {
                            if ((m.getId())==id) {
                                car.remove(m);
                                break;
                            }
                        }
                    }
                    break;
            }
            System.out.println("Если продолжить работу введите 1, закончить работу - 0");
            flag = in.nextInt();
        }
        while (flag==1);
    }
}

