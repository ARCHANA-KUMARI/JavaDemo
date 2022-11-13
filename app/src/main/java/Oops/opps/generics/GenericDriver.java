package Oops.opps.generics;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class GenericDriver {
    public static void main(String[] args) {
      /*  //Single param demo
        GenericsDemo<Integer> obj = new GenericsDemo<>(100);
        System.out.println("Integer type:" + obj.getObj());
        GenericsDemo<String> objString = new GenericsDemo<>("Alisha");
        System.out.println("String type:" + objString.getObj());*/

        //Generic many params

        GenericDemoParams<Integer, String> genericDemoParams = new GenericDemoParams<>(100,"Peter");
        System.out.println("Integer type data:" + genericDemoParams.gettTypeData());
        System.out.println("String type data:" + genericDemoParams.getuTypeData());
    }
}
