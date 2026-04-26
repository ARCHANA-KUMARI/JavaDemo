/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: CompileTimeMethodOverloadingIfNotExactPrototype.java
 * Description: What if the Exact Prototype Does Not Match?
 */

package Oops.opps.compiletimeoverloading;

public class CompileTimeMethodOverloadingIfNotExactPrototype {
    public void show(int x) {

        System.out.println("In int: " + x);

    }

    public void show(String s) {

        System.out.println("In String: " + s);
    }

    public void show(byte b) {

        System.out.println("In byte: " + b);

    }
}
