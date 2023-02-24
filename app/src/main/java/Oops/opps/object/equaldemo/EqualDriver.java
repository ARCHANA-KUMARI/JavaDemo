package Oops.opps.object.equaldemo;

/**
 * @Author: Archana Kumari
 * @Date: 22-02-2023
 */
public class EqualDriver {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        System.out.println("IsEqual:" + income.equals(expenses));
    }

}
