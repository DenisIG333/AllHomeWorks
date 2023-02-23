//2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,4,5,3,6,12));
        ArrayList<Integer> newList = new ArrayList<Integer>();


        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) % 2 == 1){
                newList.add(list.get(i));
            }

        }

        System.out.println(newList);
    }
}
