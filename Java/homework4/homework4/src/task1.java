//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
//Постараться не обращаться к листу по индексам

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        int[] listMas = {7,1,2,5,4,3,9,6};
        LinkedList<Integer> linkList = new LinkedList<>();

        addLinkedList(linkList, listMas);
        reverseLinkedList(linkList);
    }

    static void addLinkedList(LinkedList<Integer> linkList, int[] mas){
        for (Integer temp : mas) {
            linkList.add(temp);
        }
    }

    static void reverseLinkedList(LinkedList<Integer> linkedList){
        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size()-temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }
        System.out.println("linkList = " + linkedList);
    }
}
