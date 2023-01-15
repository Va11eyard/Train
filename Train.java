package kz.aitu.oop.practice.practice2;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;
public class Train {
    private String direction;
    private LocalTime time;
    private int numberOfWagons;
    private int speed;
    private int capacity;
    private String type;
    private List<Wagon> wagons;

    public Train(String direction, LocalTime time, int numberOfWagons, int speed, String type, int capacity) {
        this.direction = direction;
        this.type = type;
        this.time = time;
        this.numberOfWagons = numberOfWagons;
        this.speed = speed;
        this.capacity = capacity;
        this.wagons = new ArrayList<>();
    }
    public void addWagon(Wagon wagon) {
        this.wagons.add(wagon);
        this.capacity += wagon.getCapacity();
    }

    public void removeWagon(Wagon wagon) {
        this.wagons.remove(wagon);
        this.capacity -= wagon.getCapacity();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
}