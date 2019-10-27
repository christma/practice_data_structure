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

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
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
        add(0, e);
//        head = new Node(e,head);
    }

    public void add(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. illegal index");
        }


        Node prve = dummyHead;
        for (int i = 0; i < index; i++) {
            prve = prve.next;
        }

//        Node node = new Node(e);
//        node.next = prve.next;
//        prve.next = node;
        prve.next = new Node(e, prve.next);
        size++;


    }

    public void addLast(E e) {
        add(size, e);
    }


    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed. illegal index");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }

    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Update failed. illegal index");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e) {
        Node cur = dummyHead.next;
        for (int i = 0; i < size; i++) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public E del(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Del failed. illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    public E delFirst() {
        return del(0);
    }

    public E delLast() {
        return del(size - 1);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            sb.append(cur + "-->");
            cur = cur.next;
        }
        sb.append("Null");
        return sb.toString();
    }
}
