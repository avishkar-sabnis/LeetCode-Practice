public class CustomHashMap<K, V> {

    public static final int INITIAL_SIZE = 1<<4;

    public Entry<K,V>[] hashTable;

    public CustomHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    public class Entry<K ,V>{
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(K key) {
        int hashCode = key.hashCode();
        return hashCode ^ (hashCode >>> 16); // spreads bits (like Java HashMap)
    }


    public void put(K key, V value){
        int index = hash(key) & (hashTable.length-1);

        if (hashTable[index]==null) {
            hashTable[index] = new Entry<>(key,value);
        }

        if (hashTable[index].key.equals(key)) {
            hashTable[index].value = value;
        }
        else{
            if (hashTable[index].next == null) {
                hashTable[index].next = new Entry<>(key, value);
                return;
            }
            hashTable[index] = hashTable[index].next;
        }
    }

    public V get(K key){

        int index = hash(key) & (hashTable.length-1);

        if(hashTable[index].key.equals(key)){
            return hashTable[index].value;
        }
        else{
            while(hashTable[index]!=null){
                if(hashTable[index].key.equals(key)){
                    return hashTable[index].value;
                }
            }
        }
            return null;


    }


    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 10); // update
        System.out.println("Value for A: " + map.get("A"));
        System.out.println("Value for B: " + map.get("B"));
       // map.remove("B");


    }
}