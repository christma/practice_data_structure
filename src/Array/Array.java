package Array;

/**
 * @program: practice_data_structure
 * @author: 爱喝啤酒的圣诞
 * @create: 2019-08-13 14:58
 **/

public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("Add failed, Array is full.");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Array is full.");

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;

    }

    int get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed, index is illegal.");
        return data[index];
    }

    void set(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("set failed, index is illegal.");
        data[index] = e;
    }

    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return true;
        }
        return false;
    }

    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    public int remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("index failed, index is illegal.");

        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public void removeElement(int e) {
        int index = find(e);
        if (index != -1)
            remove(index);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }


}
