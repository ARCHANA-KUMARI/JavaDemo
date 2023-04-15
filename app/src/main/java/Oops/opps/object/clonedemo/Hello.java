package Oops.opps.object.clonedemo;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 15-04-2023
 */
public class Hello implements Cloneable{
    int y;
    Hai hai;

    public Hello(int y, Hai hai) {
        this.y = y;
        this.hai = hai;
    }
    void show(){
        System.out.println("Hello->y:" +y);
        System.out.println("Hello->y:" +hai.x);
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
