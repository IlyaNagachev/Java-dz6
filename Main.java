public class Main {

    public static void main(String[] args) {
        Notebooks nb1 = new Notebooks("Asus", "ZenBook", 8, 256, 11, 40000, "Черный");
        Notebooks nb2 = new Notebooks("MSI", "Katana", 16, 512, 10, 110000, "Серый");
        Notebooks nb3 = new Notebooks("Gigabyte", "G5", 16, 1024, 11, 80000, "Черный");
        Notebooks nb4 = new Notebooks("Asus", "TUF", 12, 512, 11, 60000, "Черный");
        Notebooks nb5 = new Notebooks("Acer", "Nitro", 32, 2048, 11, 150000, "Белый");
        System.out.println(nb1);
        System.out.println(nb2);
        System.out.println(nb3);
        System.out.println(nb4);
        System.out.println(nb5);


    }
}