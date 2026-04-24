/**
 * Author: Archana Kumari
 * Date: 4/24/26
 * File: AbstractDemoWithInterface.java
 * Description: When an Abstract Class Implements an Interface
 */


package Oops.opps.abstactdemo;

public abstract class AbstractDemoWithInterface implements DemoWithAbstract {
    abstract public void methodFromAbstactClass();

    @Override
    public void methodA1FromInterface() {
        System.out.println("AbstractDemoWithInterface.methodA1FromInterface");
    }
}
