package Oops.opps.generics;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class GenericsDemo <T>{
    T obj;
    public GenericsDemo(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }
}
