package main.java.BehavioralPatterns.hashmap;

public class Main {

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>(5);
        myHashMap.put(1,"Ravi");
        myHashMap.put(2,"kant");
        myHashMap.put(3,"Aman");
        myHashMap.put(4,"Mishra");
        myHashMap.put(2,"Jha");
        myHashMap.put(6,"Gupta");
        myHashMap.put(7,"Raj");


        System.out.println(myHashMap.get(2));
    }
}
