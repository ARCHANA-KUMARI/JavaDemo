package basic.instanceblock;

/**
 * @Author: Archana Kumari
 * @Date: 30-03-2023
 */
public class NumberOfClassObjectCounter {
    public static int getThisClassObjCount() {
        return thisClassObjCount;
    }

    private static int thisClassObjCount = 0;

    {
        thisClassObjCount++;
        System.out.println("thisClassObjCount count:" + thisClassObjCount);

    }
}
