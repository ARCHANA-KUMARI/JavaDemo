/**
 * Author: Archana Kumari
 * Date: 4/24/26
 * File: ChildAbstactDemoWithInterface.java
 */

package Oops.opps.abstactdemo;

public class ChildAbstactDemoWithInterface extends  AbstractDemoWithInterface{
    @Override
    public void methodFromAbstactClass() {
        System.out.println("ChildAbstactDemoWithInterface.methodFromAbstactClass");
    }

    @Override
    public void methodA2FromInterface() {
        System.out.println("ChildAbstactDemoWithInterface.methodA2FromInterface");
    }
}
