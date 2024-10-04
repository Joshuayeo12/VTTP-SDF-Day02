package src.Cars;

import cars.Car;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setMake = "Toyota";
        myCar.setOwner = "Fred";
        myCar.info();

        Car yourCar = new Car();
        yourCar.make = "Nissan";
        yourCar.owner = "Barney";
        yourCar.info();



    }

}
