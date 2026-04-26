/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: Dog.java
 * Description: Show the basic behaviour of RuntimeMethodOverloading
 */

package Oops.opps.runtimemethodoverloading;

public class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog is running.");
    }

    void bark() {

        System.out.println("Dog is barking.");

    }
}
