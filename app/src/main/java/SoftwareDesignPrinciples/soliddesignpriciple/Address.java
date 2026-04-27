/**
 * Author: Archana Kumari
 * Date: 4/27/26
 * File: Address.java
 */

package SoftwareDesignPrinciples.soliddesignpriciple;

public class Address {
    private String mPrimaryAddress;
    private String mSecondaryAddress;
    private String mState;
    private String mCity;


    public String getmPrimaryAddress() {
        return mPrimaryAddress;
    }

    public void setmPrimaryAddress(String mPrimaryAddress) {
        this.mPrimaryAddress = mPrimaryAddress;
    }

    public String getmSecondaryAddress() {
        return mSecondaryAddress;
    }

    public void setmSecondaryAddress(String mSecondaryAddress) {
        this.mSecondaryAddress = mSecondaryAddress;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }
}
