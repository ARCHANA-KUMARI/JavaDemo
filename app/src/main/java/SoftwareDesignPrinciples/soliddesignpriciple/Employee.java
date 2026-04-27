/**
 * Author: Archana Kumari
 * Date: 4/27/26
 * File: Employee.java
 * Description: This class demonstartes Single Responisbilites Principle
 */

package SoftwareDesignPrinciples.soliddesignpriciple;

public class Employee {
    private int mId;
    private String mName;

    private Address mAddress ;

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public Employee(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    public void printMe() {
        System.out.println("mId = " + this.mId + ", And Name" + this.mName);
    }

    // private String mPrimaryAddress;
    // private String mSecondaryAddress;
    // private Sting mState;
    // private String mCity

    // Above commented lines are vialating the Single Responsibilites principles.
}
