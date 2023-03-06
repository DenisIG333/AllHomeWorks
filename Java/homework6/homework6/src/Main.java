import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook HP = new Notebook("HP", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD", "Linux");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD", "Windows");
        Notebook MacBookProA2485 = new Notebook("Apple", "S-150", "Green", 17.0, "IPS", 16, 512, "SSD", "MacOS");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0", "Windows");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 14.0, "TFT", 16, 1024, "SSD", "DOS");

        List<Notebook> notebookList = List.of(HP, SamsungS101, MacBookProA2485, AsusTUF504, AsusTUF555);

        int userChoice = choiceUser();
        String requestUser = UserRequest();

        if (userChoice == 1) {
            for (Notebook ram : notebookList) {
                if (ram.getRam() >= Integer.parseInt(requestUser)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        if (userChoice == 2) {
            for (Notebook sizeDiskHdd : notebookList) {
                if (sizeDiskHdd.getRom() >= Integer.parseInt(requestUser)) {
                    System.out.println(sizeDiskHdd.printInfo());
                }
            }
        }

        if (userChoice == 3) {
            for (Notebook OperatingSystem : notebookList) {
                if (OperatingSystem.getOperatingSystem().equalsIgnoreCase(requestUser)) {
                    System.out.println(OperatingSystem.printInfo());
                }
            }
        }

        if (userChoice == 4) {
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUser)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        if (userChoice == 5) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUser)) {
                    System.out.println(color.printInfo());
                }
            }
        }

        if (userChoice == 6) {
            for (Notebook screenSize : notebookList) {
                if (screenSize.getScreenSize() >= Double.parseDouble(requestUser)) {
                    System.out.println(screenSize.printInfo());
                }
            }
        }
        }

        static int choiceUser(){
            Scanner scannerUser = new Scanner(System.in);
            System.out.println("Выберите параметр для поиска, где: \n1 - RAM(8гб,16гб,32гб)\n2 - Объём жесткого диска(128гб,256гб,500гб,1тб)\n" +
                    "3 - Операционная система(Windows,Linux,MacOS)\n4 - Бренд(Samsung,Asus,HP)\n5 - Цвет(black,red)\n" +
                    "6 - Диагональ экрана(14.0, 15.6, 17.0)");
            int choiceUserSearch = scannerUser.nextInt();

            switch (choiceUserSearch){
                case (1):
                    System.out.println("Напишите желаемый минимальный объём оперативной памяти(8гб,16гб,32гб): ");
                    break;
                case (2):
                    System.out.println("Напишите желаемый объём жесткого диска(128гб,256гб,500гб,1тб): ");
                    break;
                case (3):
                    System.out.println("Напишите желаемую операционную систему(Windows,Linux,MacOS): ");
                    break;
                case (4):
                    System.out.println("Напишите желаемый бренд(Samsung,Asus,HP): ");
                    break;
                case (5):
                    System.out.println("Напишите желаемый цвет(black,red): ");
                    break;
                case (6):
                    System.out.println("Напишите минимальный размер диагонали экрана(14.0, 15.6, 17.0): ");
                    break;
                default:
                    System.out.println("Введите корректное число");
                    break;
            }

            return choiceUserSearch;


        }

        static String UserRequest(){
            Scanner scannerRequestUserForSearch = new Scanner(System.in);
            String requestUserForSearch = scannerRequestUserForSearch.nextLine();
            return requestUserForSearch;
        }


}
