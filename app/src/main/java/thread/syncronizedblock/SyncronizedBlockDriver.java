package thread.syncronizedblock;

/**
 * @Author: Archana Kumari
 * @Date: 15-02-2023
 */
public class SyncronizedBlockDriver {
    public static void main(String[] args) {
     System.out.println("Main Thread started");
     MSLunch msLunch = new MSLunch();
     new Thread(new IncrThread(msLunch)).start();
     new Thread(new DecrThread(msLunch)).start();
     System.out.println("Main Thread ended");
    }
}
