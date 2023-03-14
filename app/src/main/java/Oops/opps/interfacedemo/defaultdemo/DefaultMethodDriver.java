package Oops.opps.interfacedemo.defaultdemo;

import android.util.Log;

import enumdemo.SettingDialogId;

/**
 * @Author: Archana Kumari
 * @Date: 28-02-2023
 */
public class DefaultMethodDriver {
    public static void main(String[] args) {
      /*  // Setting dialog impl
        SettingDialogImpl settingDialogImpl = new SettingDialogImpl();
        settingDialogImpl.showChangeStorageSettingDialog();
        settingDialogImpl.getSettingDialogListener().onCreateDialog(SettingDialogId.CHANGE_STORAGE_SETTINGS);

        LocationSettingDialogImpl locationSettingDialog = new LocationSettingDialogImpl();
        locationSettingDialog.showLocationDialog();
        locationSettingDialog.getmCameraSettingDialogListener().onCancelDialog(SettingDialogId.DEFAULT);*/

        Vehicle vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500,480));
    }
}
