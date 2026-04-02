import java.util.Map;

public class CustomHashMap<K, V> {

    public final int INITIAL_SIZE = 1 << 4; // 16
    public final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry<K, V>[] hashTable;

    public CustomHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    public CustomHashMap(int capacity) {
        int tableSize = hashTableSize(capacity);
        hashTable = new Entry[tableSize];
    }

    private int hashTableSize(int capacity) {
        int n = capacity - 1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        if (n < 0)
            return 1;
        else if (n >= MAXIMUM_CAPACITY)
            return MAXIMUM_CAPACITY;
        else
            return n + 1;
    }

    // Entry class (Linked List node)
    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function
    private int hash(K key) {
        int h = key.hashCode();
        return h ^ (h >>> 16); // spreads bits (like Java HashMap)
    }

    // PUT method
    public void put(K key, V value) {

        /*
        put the element on basis of index
        index is calculated using hashfuncion
        for a given index if element is not present then create a new entry
        if element is present then compare their keys
        if keys are same then replace value
        if keys are not same then create new node
         */

        int index = hash(key) & (hashTable.length-1);

        Entry<K,V> newEntry = new Entry<>(key,value);

        if(hashTable[index]==null){
            hashTable[index]=new Entry<>(key,value);
        }
        else{
            if (hashTable[index].key.equals(key)) {
                hashTable[index].value = value;

            }
            else{
                if (hashTable[index].next == null) {
                    hashTable[index].next = newEntry;
                    return;
                }
                hashTable[index] = hashTable[index].next;
            }
        }

    }

    // GET method
    public V get(K key) {
        int hash = hash(key);
        int index = hash & (hashTable.length - 1);


        while (hashTable[index] != null) {
            if (hashTable[index].key.equals(key)) {
                return hashTable[index].value;
            }
            hashTable[index] = hashTable[index].next;
        }

        return null;
    }

    // REMOVE method
    public void remove(K key) {
        int hash = hash(key);
        int index = hash & (hashTable.length - 1);

        Entry<K, V> prev = null;

        while (hashTable[index] != null) {
            if (hashTable[index].key.equals(key)) {
                if (prev == null) {
                    hashTable[index] = hashTable[index].next;
                } else {
                    prev.next = hashTable[index].next;
                }
                return;
            }
            prev = hashTable[index];
            hashTable[index] = hashTable[index].next;
        }
    }



    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 10); // update
        System.out.println("Value for A: " + map.get("A"));
        System.out.println("Value for B: " + map.get("B"));
        map.remove("B");


    }
}