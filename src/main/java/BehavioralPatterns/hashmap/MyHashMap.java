package main.java.BehavioralPatterns.hashmap;

public class MyHashMap<K, V> {

    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAXIMUM_SIZE = 1<<30;

    private Entry[] hashMap;

    public MyHashMap(){
        hashMap = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity){
        int mapSize = getMapSize(capacity);
        hashMap = new Entry[mapSize];
    }

    private int getMapSize(int cap){
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n<0)? 1: (n>MAXIMUM_SIZE) ? MAXIMUM_SIZE : n + 1;
    }

    static class Entry<K, V>{

        public K key;
        public V value;

        public Entry<K,V> next;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
            next = null;
        };
    }

    public void put(K key, V value){
        int hash = key.hashCode()%hashMap.length;

        if (hashMap[hash] == null){
            hashMap[hash] = new Entry(key, value);
        }
        else{
            Entry prev = hashMap[hash];
            Entry cur = prev;
            while(cur != null){
                if (cur.key == key){
                    cur.value = value;
                    return;
                }
                prev = cur;
                cur = cur.next;
            }
            prev.next = new Entry(key, value);
        }
    }

    public V get(K key){
        int hash = key.hashCode()%hashMap.length;
        Entry cur = hashMap[hash];
        while(cur!= null && cur.key != key){
            cur = cur.next;
        }
        if (cur == null){
            return null;
        }
        else{
            return (V) cur.value;
        }
    }
}
