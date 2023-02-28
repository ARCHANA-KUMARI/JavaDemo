package Oops.opps.interfacedemo.defaultdemo;

import enumdemo.SettingDialogId;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public class LocationSettingDialogImpl {
    public CameraSettingDailogListener getmCameraSettingDialogListener() {
        return mCameraSettingDialogListener;
    }

    private CameraSettingDailogListener mCameraSettingDialogListener;
    void showLocationDialog(){
        mCameraSettingDialogListener = new CameraSettingDailogListener() {
            @Override
            public void onCancelDialog(SettingDialogId id) {
                System.out.println("onCancelDialog" + id);
                CameraSettingDailogListener.super.onCancelDialog(id);
            }

            @Override
            public void onCreateDialog(SettingDialogId id) {
                System.out.println("onCreateDialog" + id);
                CameraSettingDailogListener.super.onCreateDialog(id);
            }

            @Override
            public void onDismissDialog(SettingDialogId id) {
                CameraSettingDailogListener.super.onDismissDialog(id);
            }

            @Override
            public void onNegativeButtonClicked(SettingDialogId id) {
                CameraSettingDailogListener.super.onNegativeButtonClicked(id);
            }

            @Override
            public void onPositiveButtonClicked(SettingDialogId id) {
                CameraSettingDailogListener.super.onPositiveButtonClicked(id);
            }
        };
    }
}
