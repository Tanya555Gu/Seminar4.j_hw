// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {

        int[] list = {5, 14, 7, 13, 9, 0,};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println(linkList);
        enqueue(linkList, 13);
        System.out.println(linkList);
        System.out.println(dequeue(linkList));
        System.out.println(linkList);
        System.out.println(first(linkList));
        System.out.println(linkList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.peekFirst();
    }
}
