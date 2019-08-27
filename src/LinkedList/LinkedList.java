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
}
