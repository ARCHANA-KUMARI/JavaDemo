/**
 * Author: Archana Kumari
 * Date: 6/1/26
 * File: SingletonDesignPattern.java
 */

package designpattern.singleton;

public class SingletonDesignPattern {
    private static volatile SingletonDesignPattern obj = null;
    private SingletonDesignPattern() {
    }
    public static SingletonDesignPattern getInstance() {
        if (obj == null) {
            // To make thread safe
            synchronized (SingletonDesignPattern.class) {
                // check again as multiple threads can reach above step
                if (obj == null)
                    obj = new SingletonDesignPattern();
            }
        }
        return obj;
    }
}

