package LinkedList;

/**
 * @program: practice_data_structure
 * @author: 爱喝啤酒的圣诞
 * @create: 2019-08-27 16:44
 **/

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(3, 999);
        System.out.println(linkedList);

        linkedList.del(3);
        System.out.println(linkedList);

        linkedList.delFirst();
        System.out.println(linkedList);

        linkedList.delLast();
        System.out.println(linkedList);
    }

}
