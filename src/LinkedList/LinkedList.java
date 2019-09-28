package LinkedList;

/**
 * @program: practice_data_structure
 * @author: 爱喝啤酒的圣诞
 * @create: 2019-08-27 16:44
 **/

public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // 返回是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 链表头添加元素
    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;

//        head = new Node(e,head);
        size++;
    }

    public void add(int index, E e) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. illegal index");

        if (index == 0)
            addFirst(e);
        else {
            Node prve = head;
            for (int i = 0; i < index - 1; i++)
                prve = prve.next;
            Node node = new Node(e);
            node.next = prve.next;
            prve.next = node;
//            prve.next = new Node(e,prve.next);
            size++;

        }
    }

    public void addLast(E e) {
        add(size, e);
    }


}
