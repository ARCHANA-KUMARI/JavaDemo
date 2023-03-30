package thread.executerocumbuilder.executerImplDemo;


import java.util.concurrent.Executor;

/**
 * @Author: Archana Kumari
 * @Date: 30-03-2023
 */
public class ExecutorImpl implements Executor {
    @Override
    public void execute(Runnable command) {
        System.out.println("execute:command"+ command);
     new Thread(command).start();
    }
}
