package pl.pawel.demo.datastructures;


import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== HashTable ====");
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patric");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        for (Integer key: table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        System.out.println("\n----- String as a key ------\n");

        Hashtable<String, String> stringTable = new Hashtable<>(10);

        stringTable.put("100", "Spongebob");
        stringTable.put("123", "Patric");
        stringTable.put("321", "Sandy");
        stringTable.put("555", "Squidward");
        stringTable.put("777", "Gary");

        for (String key: stringTable.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + stringTable.get(key));
        }
    }
}
