package designpattern;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class Phone {
    private String mModelName, mOS, mPrecessor, mCPUArc;

    public String getmModelName() {
        return mModelName;
    }

    public String getmOS() {
        return mOS;
    }

    public String getmPrecessor() {
        return mPrecessor;
    }

    public String getmCPUArc() {
        return mCPUArc;
    }

    public int getmRamSize() {
        return mRamSize;
    }

    public int getmExternalStorageSize() {
        return mExternalStorageSize;
    }

    public int getmExtendableMemorySize() {
        return mExtendableMemorySize;
    }

    private int mRamSize, mExternalStorageSize, mExtendableMemorySize;

    public Phone(String mOS, String mPrecessor, int mRamSize, int mExternalStorageSize) {
        super();
        this.mOS = mOS;
        this.mPrecessor = mPrecessor;
        this.mRamSize = mRamSize;
        this.mExternalStorageSize = mExternalStorageSize;
    }

    @NonNull
    @Override
    public String toString() {
        return "Phone" + "Model is" + mModelName + "Os is" + mOS + "Processor is" + mPrecessor + "Ram size is" + mRamSize + "Cpu Arc" + mCPUArc + "External Storage size:" + mExternalStorageSize + "Extendable Memory size" + mExtendableMemorySize;
    }
}
