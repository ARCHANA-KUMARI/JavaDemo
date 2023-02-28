package Oops.opps.interfacedemo.defaultdemo;

import android.util.Log;

import enumdemo.SettingDialogId;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public class SettingDialogImpl {
    private CameraSettingDailogListener cameraSettingDailogListener;

    void showChangeStorageSettingDialog() {
        cameraSettingDailogListener = new CameraSettingDailogListener() {
            @Override
            public void onCancelDialog(SettingDialogId id) {
                System.out.println("Cancel Dialog" + id);
                CameraSettingDailogListener.super.onCancelDialog(id);
            }

            @Override
            public void onCreateDialog(SettingDialogId id) {
                System.out.println("Create Dialog" + id);
                CameraSettingDailogListener.super.onCreateDialog(id);
            }

            @Override
            public void onDismissDialog(SettingDialogId id) {
                System.out.println("Dismiss Dialog" + id);
                CameraSettingDailogListener.super.onDismissDialog(id);
            }

            @Override
            public void onNegativeButtonClicked(SettingDialogId id) {
                System.out.println("Negative button clicked" + id);
                CameraSettingDailogListener.super.onNegativeButtonClicked(id);
            }

            @Override
            public void onPositiveButtonClicked(SettingDialogId id) {
                System.out.println("onPositiveButtonClicked" + id);
                CameraSettingDailogListener.super.onPositiveButtonClicked(id);
            }
        };
    }

    public CameraSettingDailogListener getSettingDialogListener() {
        return cameraSettingDailogListener;
    }
}
