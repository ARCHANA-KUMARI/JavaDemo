package designpattern.command;

import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 27-03-2023
 */
public class AddOrderCommand implements OrderCommand {
    public AddOrderCommand(int commandId) {
        this.mCommandId = commandId;
    }

    private int mCommandId;

    @Override
    public void execute() {
        System.out.println("execute: Add order:" + mCommandId);
    }
}
