import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    private Map<List<String>, String> map = new HashMap<>();

    void add(List<String> contact, String name){
        map.put(contact, name);

    }

    void print(String name){
        for (Map.Entry entry: map.entrySet()) { //map.entrySet() перебирает значения
            if(entry.getValue().equals(name)){
                System.out.println(entry);
            }
        }

    }
}
