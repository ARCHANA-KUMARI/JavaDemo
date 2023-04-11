package collection.map;

import androidx.annotation.NonNull;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Archana Kumari
 * @Date: 10-04-2023
 */
public class MyHashMap<K, V> {
      private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public final String toString() {
            return key + "=" + value;
        }
    }

    int noOfNode, noOfBucket;
    private LinkedList<Node> mBucketList[];

    public MyHashMap() {
        noOfBucket = 4;
        mBucketList = new LinkedList[noOfBucket];
        for (int i = 0; i < noOfBucket; i++) {
            mBucketList[i] = new LinkedList<>();
        }
    }

    private int calculateHashCode(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % noOfBucket;
    }

    public void put(K key, V value) {
        int bucketIndex = calculateHashCode(key);
        int nodeIndex = search(key, bucketIndex);
        if (nodeIndex == -1) {
            mBucketList[bucketIndex].add(new Node(key, value));
            noOfNode++;
        } else {
            Node node = mBucketList[bucketIndex].get(nodeIndex);
            node.value = value;
        }
        double lambda = noOfNode / noOfBucket;
        if (lambda > 2.0) {
            resizeBucketList();
        }
    }

    public V get(K key) {
        int bucketIndex = calculateHashCode(key);
        int searchedNodeIndex = search(key, bucketIndex);
        if (searchedNodeIndex == -1) {
            return null;
        } else {
            Node node = mBucketList[bucketIndex].get(searchedNodeIndex);
            return node.value;
        }
    }

    public boolean contains(K key) {
        int bucketIndex = calculateHashCode(key);
        int searchedNodeIndex = search(key, bucketIndex);
        if (searchedNodeIndex == -1) {
            return false;
        } else {
            return true;
        }
    }

    public V remove(K key) {
        int bucketIndex = calculateHashCode(key);
        int searchedNodeIndex = search(key, bucketIndex);
        if (searchedNodeIndex == -1) {
            return null;
        } else {
            Node node = mBucketList[bucketIndex].remove(searchedNodeIndex);
            noOfNode--;
            return node.value;
        }
    }

    public List<K> getKeySet() {
        List<K> list = new LinkedList<>();
        for (int bucketIndex = 0; bucketIndex < mBucketList.length; bucketIndex++) {
            LinkedList<Node> nodeListAtIndex = mBucketList[bucketIndex];
            for (int nodeIndex = 0; nodeIndex < nodeListAtIndex.size(); nodeIndex++) {
                Node node = nodeListAtIndex.get(nodeIndex);
                list.add(node.key);
            }
        }
        return list;
    }

    public boolean isEmpty() {
        return noOfNode == 0;
    }

    public int size() {
        return noOfNode;
    }

    private void resizeBucketList() {
        LinkedList<Node>[] oldBucketList = mBucketList;
        noOfBucket = noOfBucket * 2;
        mBucketList = new LinkedList[noOfBucket];
        for (int i = 0; i < mBucketList.length; i++) {
            mBucketList[i] = new LinkedList<>();
        }
        for (int i = 0; i < oldBucketList.length; i++) {
            mBucketList[i] = oldBucketList[i];
        }
    }

    private int search(K key, int bucketListIndex) {
        LinkedList<Node> nodeList = mBucketList[bucketListIndex];
        if (nodeList != null && nodeList.size() > 0) {
            for (int i = 0; i < nodeList.size(); i++) {
                if (nodeList.get(i) .key== key) {
                    return i;
                }
            }
        }
        return -1;
    }
}
