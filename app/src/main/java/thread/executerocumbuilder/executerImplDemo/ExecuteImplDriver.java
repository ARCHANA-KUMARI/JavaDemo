package thread.executerocumbuilder.executerImplDemo;

/**
 * @Author: Archana Kumari
 * @Date: 30-03-2023
 */
public class ExecuteImplDriver {
    public static void main(String[] args) {
        ExecutorImpl executor = new ExecutorImpl();
        executor.execute(new ExecuteRunnable());
    }
}
