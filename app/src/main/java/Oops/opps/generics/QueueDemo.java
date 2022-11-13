package Oops.opps.generics;

import java.util.ArrayList;

import exception.EmptyQueueException;

/**
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class QueueDemo<T> {
    private final ArrayList<T> mList = new ArrayList<>();
    private int mRear = -1;
    private int mFront = -1;

    public void enQueue(T data) {
        if (isEmpty()) {
            mFront = mFront + 1;
        }
        mRear = mRear + 1;
        mList.add(data);
    }

    boolean isEmpty() {
        return mList.isEmpty();
    }

    public T deQueue(int index) {
        if (isEmpty()) {
            throw new EmptyQueueException("Can`t perform dequeue on empty queue");
        }
        mFront = mFront + 1;
        T data = mList.get(index);
        mList.remove(index);
        return data;
    }

    boolean isQueueFull() {
        return mFront == mRear + 1;
    }

    public void printQueue() {
        if (isEmpty()) {
            throw new EmptyQueueException("No elements in Queue");
        }
        for (T data : mList) {
            System.out.println(data);
        }
    }
}
