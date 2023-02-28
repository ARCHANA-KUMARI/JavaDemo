package Oops.opps.interfacedemo;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public interface BaseContract {
    interface Presenter {
        void clear();

        void start();

        void stop();
    }

    interface View<P extends Presenter> {
        void clear();

        void initialize();

        void setPresenter(P presenter);
    }
}
