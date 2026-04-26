/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: RuntumeMethodOverloadingDriver.java
 */

package Oops.opps.runtimemethodoverloading;

public class RuntumeMethodOverloadingDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move(); // Overrieden method in Dog class
        dog.bark(); // Newly method defined in Dog class
        dog.eat(); // This method defined in Parent class.
    }
}
