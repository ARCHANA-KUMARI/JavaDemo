package designpattern;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class DesignPatternDriver {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setmModelName("Redmi").setmCPUArc("x86").setmOS("13").setmRamSize(8).getPhone();
        System.out.println("Phone Config is:" + phone);
    }
}
