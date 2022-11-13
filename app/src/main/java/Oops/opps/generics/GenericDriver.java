package Oops.opps.generics;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class GenericDriver {
    public static void main(String[] args) {
      /*
        //Single param demo
        GenericsDemo<Integer> obj = new GenericsDemo<>(100);
        System.out.println("Integer type:" + obj.getObj());
        GenericsDemo<String> objString = new GenericsDemo<>("Alisha");
        System.out.println("String type:" + objString.getObj());*/

       /* //Generic many params
        GenericDemoParams<Integer, String> genericDemoParams = new GenericDemoParams<>(100,"Peter");
        System.out.println("Integer type data:" + genericDemoParams.gettTypeData());
        System.out.println("String type data:" + genericDemoParams.getuTypeData());*/

        QueueDemo<Integer> queueDemo = new QueueDemo<>();
        queueDemo.enQueue(10);
        queueDemo.enQueue(20);
        queueDemo.enQueue(30);
        queueDemo.printQueue();

        queueDemo.deQueue(2);
        queueDemo.printQueue();

        QueueDemo queueDemoStr = new QueueDemo<>();
        queueDemoStr.enQueue("Peter");
        queueDemoStr.enQueue("M");
        queueDemoStr.enQueue("Gardner");
        queueDemoStr.printQueue();

        queueDemoStr.deQueue(2);
        queueDemoStr.printQueue();

    }
}
