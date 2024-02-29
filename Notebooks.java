public class Notebooks {
    private String name;
    private String model;
    private int ram;
    private int hardDrive;
    private int oc;
    private int price;
    private String color;

public Notebooks(String name, String model, int ram, int hardDrive, int oc, int price, String color){
    this.name = name;
    this.model = model;
    this.ram = ram;
    this.hardDrive = hardDrive;
    this.oc = oc;
    this.price = price;
    this.color = color;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getOc() {
        return oc;
    }

    public void setOc(int oc) {
        this.oc = oc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebooks{" + "Производитель='" + name + '\'' + "Марка='" + model + '\'' + "ОЗУ='" + ram + '\''  + "Накопитель='" + hardDrive +
        "OC='" + oc + '\'' + '\'' + "Стоимость='" + price + '\'' + ", цвет='" + color + '}';
    }

}
