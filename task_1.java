// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class task_1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = compList(20);
        System.out.println(revList(list));
    }

    static LinkedList<Integer> compList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 10; i < n + 1; i++) {
            list.add(i);
        }
        return list;
    }

    static LinkedList<Integer> revList(LinkedList<Integer> list) {
        LinkedList<Integer> revList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revList.add(list.get(i));
        }
        return revList;
    }

}