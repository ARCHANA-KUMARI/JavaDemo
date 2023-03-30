package basic.instanceblock;

/**
 * @Author: Archana Kumari
 * @Date: 30-03-2023
 */
public class InstanceDriver {
    public static void main(String args[]) {
        NumberOfClassObjectCounter numberOfClassObjectCounter = new NumberOfClassObjectCounter();
        numberOfClassObjectCounter = new NumberOfClassObjectCounter();
        numberOfClassObjectCounter = new NumberOfClassObjectCounter();
        System.out.println("Object count:" + numberOfClassObjectCounter.getThisClassObjCount());
    }
}
