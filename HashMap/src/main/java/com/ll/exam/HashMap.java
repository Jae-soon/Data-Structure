package com.ll.exam;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    private Object[] keys;
    private Object[] values;
    private int size;

    HashMap() {
        size = 0;
        keys = new Object[100];
        values = new Object[100];
    }

    public void put(K key, V value) {
        if (isFull()) {
            extendsArr();
        }

        int keyIndex = indexOfKey(key);

        if(keyIndex != -1) {
            values[keyIndex] = value;
            return;
        }
        keys[size] = key;
        values[size] = value;

        size++;
    }

    private void extendsArr() {
        Object[] newkeys = new Object[keys.length * 2];
        Object[] newvalues = new Object[values.length * 2];

        for (int i = 0; i < size; i++) {
            newkeys[i] = keys[i];
            newvalues[i] = values[i];
        }

        keys = newkeys;
        values = newvalues;
    }

    private boolean isFull() {
        return size >= keys.length - 1;
    }

    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if(key.equals(keys[i])) {
                return i;
            }
        }
        return -1;
    }

    private int indexOfValue(V value) {
        for(int i = 0; i < size; i++) {
            if(value.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    public V get_value(K key) {
        int keyIndex = indexOfKey(key);
        if(keyIndex == -1) {
            return null;
        }
        return (V)values[keyIndex];
    }

    public K get_key(V value) {
        int valueIndex = indexOfValue(value);
        if(valueIndex == -1) {
            return null;
        }
        return (K)keys[valueIndex];
    }

    public void remove(K key) {
        int startIndex = indexOfKey(key);

        for (int i = startIndex; i < size; i++) {
            keys[i] = keys[i+1];
            values[i] = values[i+1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            keySet.add((K)keys[i]);
        }

        return keySet;
    }

    public boolean contains(K key) {
        int keyIndex = indexOfKey(key);
        if(keyIndex == -1) {
            return false;
        }
        return true;
    }
}
