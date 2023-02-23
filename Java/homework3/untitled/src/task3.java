import java.util.ArrayList;
import java.util.Arrays;

//3.Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое этого списка.
public class task3 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,4,7,8,12,5,45));

        int max = list.get(0);
        int min = list.get(0);


        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("Максимальное число списка  = " + max );
        System.out.println("Минимальное число списка  = " + min);
        avarage(list);

    }

    public static void avarage(ArrayList<Integer> arrayList){
        float sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        sum /= arrayList.size();
        System.out.println("Среднее арифметическое списка = " + sum);
    }
}
