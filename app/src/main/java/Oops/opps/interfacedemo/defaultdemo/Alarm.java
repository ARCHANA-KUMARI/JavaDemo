package Oops.opps.interfacedemo.defaultdemo;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public interface Alarm {
    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
