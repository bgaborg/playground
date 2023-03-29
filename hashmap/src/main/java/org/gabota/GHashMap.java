package org.gabota;

import java.util.Arrays;

public class GHashMap<K, V> {
    private int CAPACITY = 1 << 4;
    private GMapBucket<K, V>[] buckets;
    private int size = 0;

    @SuppressWarnings({"unchecked"})
    public GHashMap() {
        buckets = new GMapBucket[CAPACITY];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new GMapBucket<>();
        }
    }

    public GMapKeyValueEntry<K, V> get(K key) {
        int hash = getHash(key);
        GMapBucket<K, V> bucket = buckets[hash];
        for (GMapKeyValueEntry<K, V> entry : bucket.getEntries()) {
            if (entry.getKey().equals(key))
                return entry;
        }
        return null;
    }

    public void put(K key, V value) {
        final GMapKeyValueEntry<K, V> entry = this.get(key);
        if (entry != null) {
            entry.setValue(value);
        } else {
            final int hash = getHash(key);
            final GMapBucket<K, V> bucket = buckets[hash];
            bucket.addEntry(new GMapKeyValueEntry<>(key, value));
            this.size++;
        }
    }

    public GMapKeyValueEntry<K, V> remove(K key) {
        if (this.containsKey(key)){
            final int hash = getHash(key);
            final GMapBucket<K,V> bucket = buckets[hash];
            GMapKeyValueEntry<K, V> entry = this.get(key);
            bucket.removeEntry(entry);
            this.size--;
            return entry;
        } else {
            return null;
        }
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        GMapBucket<K, V> bucket = buckets[hash];
        return bucket.getEntries().stream().anyMatch(e -> e.getKey().equals(key));
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "GHashMap{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + this.size() +
                ", capacity=" + CAPACITY +
                '}';
    }

    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }


    public static void main(String[] args) {
        GHashMap<String, String> ssghm = new GHashMap<>();
        ssghm.put("one", "asd");
        ssghm.put("two", "brg");
        ssghm.put("three", "adfv");
        ssghm.put("four", "bfsb");
        ssghm.put("five", "yrq");
        ssghm.put("six", "teqr");

        System.out.println(ssghm.get("six"));
        System.out.println(ssghm);
    }
}