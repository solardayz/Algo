package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueStudy {
    public static class Queue<E> {
        private List<E> queue = new ArrayList<E>();

        public E getQueue() {
            if (queue.isEmpty()) {
                return null;
            }
            return queue.remove(0);
        }

        public void setQueue(E element) {
            queue.add(element);
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public static void main(String[] args) {
            Queue<String> q = new Queue<>();
            q.setQueue("1");
            q.setQueue("2");
            q.setQueue("3");
            q.setQueue("4");

            System.out.println("q = " + q.isEmpty());
            while (!q.isEmpty()) {
                System.out.println("q.getQueue() = " + q.getQueue());
            }
        }
    }
}
