//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        int[] list = { 3, 5, 7, 2, 4, 6 };
        int sum = 0;

        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : list) {
            linkList.add(temp);
            sum += temp;
        }
        System.out.println(sum);


    }
}
