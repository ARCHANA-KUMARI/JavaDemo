package Oops.opps.object.equaldemo;

import java.util.Objects;

/**
 * @Author: Archana Kumari
 * @Date: 22-02-2023
 */
public class Money {
    private int mAmount;
    private String mCurrencyCode;

    public Money(int mAmount, String mCurrencyCode) {
        this.mAmount = mAmount;
        this.mCurrencyCode = mCurrencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof  Money))
            return false;
       // if (o == null || getClass() != o.getClass()) return false;
        Money other = (Money) o;
        boolean currencyCodeEquals = (this.mCurrencyCode == null && other.mCurrencyCode == null)
                || (this.mCurrencyCode != null && this.mCurrencyCode.equals(other.mCurrencyCode));
        return this.mAmount == other.mAmount && currencyCodeEquals;
        //return mAmount == money.mAmount && Objects.equals(mCurrencyCode, money.mCurrencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mAmount, mCurrencyCode);
    }
}
