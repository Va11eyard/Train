package kz.aitu.oop.practice.practice2;

public class Passenger {
    private String ticketNumber;
    private String name;
    private String secondName;
    private int age;
    private double price;

    public Passenger(String ticketNumber, String name, String secondName, int age) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.price = calculatePrice(age);
    }

    private double calculatePrice(int age) {
        double basePrice = 100.0;
        if (age < 18) {
            return basePrice * 0.8; // 20% discount for children
        } else if (age >= 60) {
            return basePrice * 0.7; // 30% discount for retirees
        } else if (age < 25) {
            return basePrice * 0.9; // 10% discount for students
        } else if (age < 40){
            return basePrice * 0.85; // 15% discount for average people
        } else {
            return basePrice;
        }
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.price = calculatePrice(age);
    }

    public double getPrice() {
        return price;
    }
}