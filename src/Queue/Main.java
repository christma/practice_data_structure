package Queue;

import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer> q, int opCount){

        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0 ; i < opCount ; i ++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0 ; i < opCount ; i ++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {


        int opCount = 1000000;

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<Integer>();
        double time = testQueue(linkedListQueue, opCount);
        System.out.println(time);

    }
}
