package Array;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array(20);

        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        System.out.println(arr.getCapacity());
        System.out.println(arr.getSize());
        arr.add(0, 10);
        System.out.println(arr);
    }
}
