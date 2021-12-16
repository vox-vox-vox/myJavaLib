package collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        /**
         * Deque 作为双端队列，十分灵活
         */
        Deque<Integer> deque= new LinkedList<>();
        deque.offerLast(1); // 队尾插入，相当于offer
        deque.offerFirst(2);  // 队首插入
        deque.offer(3);
        System.out.println(deque); // 上述结果应为2 1 3

        System.out.println(deque.getFirst());// 队首值
        System.out.println(deque.getLast());// 队尾值
        System.out.println(deque.pollFirst());// 队首出队
        System.out.println(deque.pollLast());// 队尾出队
    }
}
