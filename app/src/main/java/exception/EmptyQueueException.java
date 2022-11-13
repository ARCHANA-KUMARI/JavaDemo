package exception;

import androidx.annotation.Nullable;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class EmptyQueueException extends RuntimeException{
    private String mMsg;

    public EmptyQueueException(String message) {
        super(message);
        mMsg = message;
    }

    @Nullable
    public String getmMsg() {
        return mMsg;
    }
}
