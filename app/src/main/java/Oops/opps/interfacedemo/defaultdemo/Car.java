package Oops.opps.interfacedemo.defaultdemo;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public class Car implements Vehicle, Alarm {
    @Override
    public String getBrand() {
        return "SUV";
    }

    @Override
    public String speedUp() {
        return "SUV Speed";
    }

    @Override
    public String slowDown() {
        return "slow down by 5km";
    }

    @Override
    public String turnAlarmOn() {
        return "Car alarm on";
    }

    @Override
    public String turnAlarmOff() {
        return "Car alarm off";
    }
}
