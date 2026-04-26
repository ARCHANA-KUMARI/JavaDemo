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
        super.move(); // Calling parent`s method using super keyword.
        System.out.println("Dog is moving.");
    }

    void bark() {

        System.out.println("Dog is barking.");

    }
}
