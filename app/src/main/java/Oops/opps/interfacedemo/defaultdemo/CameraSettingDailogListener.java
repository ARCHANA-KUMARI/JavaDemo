package Oops.opps.interfacedemo.defaultdemo;

import enumdemo.SettingDialogId;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public interface CameraSettingDailogListener {
    default void onCancelDialog(SettingDialogId id) {

    }

    default void onCreateDialog(SettingDialogId id) {

    }

    default void onDismissDialog(SettingDialogId id) {

    }

    default void onNegativeButtonClicked(SettingDialogId id) {

    }

    default void onPositiveButtonClicked(SettingDialogId id) {

    }
}
