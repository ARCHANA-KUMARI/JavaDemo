package designpattern.command;

/**
 * @Author: Archana Kumari
 * @Date: 27-03-2023
 */
public class CommandDesingDriver {
    public static void main(String[] args) {
        new OrdersCommandProcessor().addToQueue(new AddOrderCommand(1)).addToQueue(new AddOrderCommand(2)).addToQueue(new PayOrderCommand(3)).processCommands();
    }
}
