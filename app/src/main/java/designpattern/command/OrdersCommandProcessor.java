package designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Archana Kumari
 * @Date: 27-03-2023
 */
public class OrdersCommandProcessor {
    List<OrderCommand> mQueue = new ArrayList<>();

    OrdersCommandProcessor addToQueue(OrderCommand orderCommand) {
        mQueue.add(orderCommand);
        return this;
    }

    OrdersCommandProcessor processCommands() {
        for (OrderCommand command : mQueue) {
            command.execute();
        }
        mQueue.clear();
        return this;
    }
}
