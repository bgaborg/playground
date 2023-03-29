package org.gabota;

public class GMapKeyValueEntry<K, V> {

    private K key;
    private V value;

    public GMapKeyValueEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GMapKeyValueEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
