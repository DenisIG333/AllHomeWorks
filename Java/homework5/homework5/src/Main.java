//Реализуйте структуру телефонной книги с помощью HashMap,
//учитывая, что 1 человек может иметь несколько телефонов.

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        contacts.add(List.of("671-89-35", "671-89-61"), "Иванов");
        contacts.add(List.of("671-89-62", "677-49-61"), "Петров");
        contacts.add(List.of("677-49-62", "677-49-63"), "Сидоров");
        contacts.add(List.of("677-49-64", "677-49-66"), "Кузнецов");
        contacts.add(List.of("677-49-72", "675-43-81"), "Пирогов");
        contacts.add(List.of("675-50-48", "675-50-63"), "Иванов");

        contacts.print("Иванов");
    }
}