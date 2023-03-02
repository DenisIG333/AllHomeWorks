import java.util.*;

//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
//Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
//Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

public class task2 {
    public static void main(String[] args) {
        deleteLastname("Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова," +
                "Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов");
    }

    static void deleteLastname(String s){
        
        String[] s1 = s.split(",");

        for (int i = 0; i < s1.length; i++) {
            String str = s1[i];

            int stringIndex = str.indexOf(" ");
            str = str.substring(0, stringIndex);
            s1[i] = str;
        }
        numberOfRepetitions(s1);
    }

    static void numberOfRepetitions(String[] arrayNames){
        Map<String, Integer> treeMap = new TreeMap<>();

        for (String word : arrayNames)
        {
            treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);
        }


        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for (Map.Entry<String, Integer> entry: treeMap.entrySet()) {
            if (map.containsKey(entry.getValue())){
                List<String> list = map.get((entry.getValue()));
                list.add(entry.getKey());
            } else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                map.put(entry.getValue(), list);
            }
        }
        System.out.println(map);

        }

    }


