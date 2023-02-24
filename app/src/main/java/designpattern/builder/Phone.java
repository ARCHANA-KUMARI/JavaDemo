package designpattern.builder;

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

    public Phone() {
    }

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
    public static class PhoneBuilder {
        private String mModelName, mOS, mPrecessor, mCPUArc;
        private int mRamSize, mExternalStorageSize, mExtendableMemorySize;

        public PhoneBuilder setmModelName(String modelName) {
            this.mModelName = modelName;
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
}


