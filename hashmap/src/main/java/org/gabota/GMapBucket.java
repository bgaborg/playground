package org.gabota;

import java.util.LinkedList;
import java.util.List;

public class GMapBucket<K,V> {
    final private List<GMapKeyValueEntry<K, V>> entries;

    public GMapBucket() {
        entries = new LinkedList<>();
    }

    public List<GMapKeyValueEntry<K, V>> getEntries() {
        return entries;
    }

    public void addEntry(GMapKeyValueEntry<K, V> entry) {
        this.entries.add(entry);
    }

    public void removeEntry(GMapKeyValueEntry<K, V> entry) {
        this.entries.add(entry);
    }

    @Override
    public String toString() {
        return "GMapBucket{" +
                "entries=" + entries +
                '}';
    }
}
