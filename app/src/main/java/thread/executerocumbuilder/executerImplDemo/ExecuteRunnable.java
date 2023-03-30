package thread.executerocumbuilder.executerImplDemo;

/**
 * @Author: Archana Kumari
 * @Date: 30-03-2023
 */
public class ExecuteRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("*********run: ExecuteRunnable" + ExecuteRunnable.class);
    }
}
