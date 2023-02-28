package Oops.opps.interfacedemo.defaultdemo;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
