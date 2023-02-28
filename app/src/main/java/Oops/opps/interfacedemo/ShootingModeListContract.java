package Oops.opps.interfacedemo;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public interface ShootingModeListContract {
    interface Presenter extends  BaseContract.Presenter{
        void onChangeShootingModeRequested();
        void onIintialize();
    }
    interface View extends BaseContract.View<Presenter>,ShootingModeShortcut {
        void setAdatper();
        void refreshListData();

    }
}
