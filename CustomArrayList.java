public class CustomArrayList<V> {

    private static final int INITIAL_SIZE = 1 << 4;

    public V[] array;
    int size = 0;

    public CustomArrayList() {
        array = (V[]) new Object[INITIAL_SIZE];
    }

    public void add(V value){
        array[size++] = value;
    }
    public V get(int index){

        return array[index];
    }


    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(3);
        list.add(4);
        list.add(10);

        System.out.println(list.get(0)); // 3
        System.out.println(list.get(1)); // 4
        //System.out.println(list.size()); // 3
    }
}