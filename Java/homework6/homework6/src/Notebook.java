public class Notebook{
    private String brand;
    private String model;
    private String operatingSystem;
    private String color;
    private double screenSize;
    private String screenTechnology;
    private int ram;
    private int rom;
    private String typeDisk;

    public Notebook(String brand, String model, String color, double screenSize, String screenTechnology, int ram, int rom, String typeDisk, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.screenTechnology = screenTechnology;
        this.ram = ram;
        this.rom = rom;
        this.typeDisk = typeDisk;
        this.operatingSystem = operatingSystem;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %s, ROM: %s, TypeDisk: %s, OperatingSystem: %s", brand, model, color, screenSize, ram, rom, typeDisk, operatingSystem);
        return ".";
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getOperatingSystem() {return operatingSystem;}



}