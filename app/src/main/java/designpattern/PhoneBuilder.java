package designpattern;

/**
 * Builder class for Phone
 *
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class PhoneBuilder {
    private String mModelName, mOS, mPrecessor, mCPUArc;
    private int mRamSize, mExternalStorageSize, mExtendableMemorySize;

    public PhoneBuilder setmModelName(String mModelName) {
        this.mModelName = mModelName;
        return this;
    }

    public PhoneBuilder setmOS(String mOS) {
        this.mOS = mOS;
        return this;
    }

    public PhoneBuilder setmPrecessor(String mPrecessor) {
        this.mPrecessor = mPrecessor;
        return this;
    }

    public PhoneBuilder setmCPUArc(String mCPUArc) {
        this.mCPUArc = mCPUArc;
        return this;
    }

    public PhoneBuilder setmRamSize(int mRamSize) {
        this.mRamSize = mRamSize;
        return this;
    }

    public PhoneBuilder setmExternalStorageSize(int mExternalStorageSize) {
        this.mExternalStorageSize = mExternalStorageSize;
        return this;
    }

    public PhoneBuilder setmExtendableMemorySize(int mExtendableMemorySize) {
        this.mExtendableMemorySize = mExtendableMemorySize;
        return this;
    }

    public  Phone getPhone() {
        return new Phone(mOS, mPrecessor, mRamSize, mExternalStorageSize);
    }
}
