package Oops.opps.generics;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class GenericDemoParams <T, U> {
    private T tTypeData;
    private U uTypeData;

    public GenericDemoParams(T tTypeData, U uTypeData) {
        this.tTypeData = tTypeData;
        this.uTypeData = uTypeData;
    }

    public T gettTypeData() {
        return tTypeData;
    }

    public U getuTypeData() {
        return uTypeData;
    }
}
