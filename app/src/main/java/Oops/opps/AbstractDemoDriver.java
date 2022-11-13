package Oops.opps;

/**
 * @Author: Archana Kumari
 * @Date: 13-09-2022
 */
public class AbstractDemoDriver {
    // Abstract class object we can`t create.
    public static void main(String[] args) {
        Parent parentRef = new Child();
        parentRef.about();
    }
}
