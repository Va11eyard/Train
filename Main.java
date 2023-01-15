package kz.aitu.oop.practice.practice2;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // create instances of passenger, train and wagon
        Passenger passengerN1 = new Passenger("Ticket111", "John", "Smith", 30);
        Passenger passengerN2 = new Passenger("Ticket122", "Joestar", "Johnatan", 73);
        Wagon luxuryWagon = new Wagon("Luxury", 40);
        Wagon commonWagon = new Wagon("Economy", 60);
        Wagon restaurantWagon = new Wagon("Restaurant", 100);
        Train trainA = new Train("East", LocalTime.of(8, 30 , 10), 2, 120, "Locomative", 100);
        Train trainB = new Train("West", LocalTime.of(10, 45 , 00), 10, 90, "Blitz", 150);

        // add wagons to train
        trainA.addWagon(luxuryWagon);
        trainA.addWagon(commonWagon);
        trainA.addWagon(restaurantWagon);

        trainB.addWagon(luxuryWagon);
        trainB.addWagon(commonWagon);
        trainB.addWagon(restaurantWagon);
        // print train information
        System.out.println("Train type: " + trainA.getType());
        System.out.println("Train direction: " + trainA.getDirection());
        System.out.println("Train time: " + trainA.getTime());
        System.out.println("Train speed: " + trainA.getSpeed());
        System.out.println("Train capacity: " + trainA.getCapacity());
        System.out.println();

        System.out.println("Train type: " + trainB.getType());
        System.out.println("Train direction: " + trainB.getDirection());
        System.out.println("Train time: " + trainB.getTime());
        System.out.println("Train speed: " + trainB.getSpeed());
        System.out.println("Train capacity: " + trainB.getCapacity());
        System.out.println();

        // print passenger information
        System.out.println("Passenger name: " + passengerN1.getName());
        System.out.println("Passenger second name: " + passengerN1.getSecondName());
        System.out.println("Passenger age: " + passengerN1.getAge());
        System.out.println("Passenger price: " + passengerN1.getPrice());
        System.out.println();

        System.out.println("Passenger name: " + passengerN2.getName());
        System.out.println("Passenger second name: " + passengerN2.getSecondName());
        System.out.println("Passenger age: " + passengerN2.getAge());
        System.out.println("Passenger price: " + passengerN2.getPrice());
    }

}
