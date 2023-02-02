package designpattern;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class DesignPatternDriver {
    public static void main(String[] args) {
       /* // If Builder class is outside
        Phone phone = new PhoneBuilder().setmModelName("Redmi").setmCPUArc("x86").setmOS("13").setmRamSize(8).getPhone();
        System.out.println("Phone Config is:" + phone);*/

        // If Builder class is nested class of Phone
        Phone  phone = new Phone.PhoneBuilder().setmModelName("Redmi").setmCPUArc("x86").setmOS("13").setmRamSize(8).getPhone();
        System.out.println("Phone Config is:" + phone);
    }
}
