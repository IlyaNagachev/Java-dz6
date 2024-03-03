import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Notebooks> notebooks = new HashSet<>();
        notebooks.add(new Notebooks("Asus", "ZenBook", 8, 256, 11, 40000, "Черный"));
        notebooks.add(new Notebooks("MSI", "Katana", 16, 512, 10, 110000, "Серый"));
        notebooks.add(new Notebooks("Gigabyte", "G5", 16, 1024, 11, 80000, "Черный"));
        notebooks.add(new Notebooks("Asus", "TUF", 12, 512, 11, 60000, "Черный"));
        notebooks.add(new Notebooks("Acer", "Nitro", 32, 2048, 11, 150000, "Белый"));
        
        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "ram");
        filterCriteria.put(2, "hardDrive");
        filterCriteria.put(3, "os");
        filterCriteria.put(4, "price");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Оперативная память, 2-Накопитель, 3-Версия виндовс, 4-Цена");
        System.out.println("Введите номера критерия фильтрации");
        String criteriaInput = scanner.nextLine();
        String[] criteriaArray = criteriaInput.split(",");

        Map<String, Integer> filterValues = new HashMap<>();
        for (String criteria : criteriaArray) {
            int criteriaNumber = Integer.parseInt(criteria.trim());
            System.out.println("Введите минимальное значение для критерия: ");
            int minValue = scanner.nextInt();
            filterValues.put(filterCriteria.get(criteriaNumber), minValue);
        }

        List<Notebooks> filteredNotebooks = filterNotebooks(notebooks, filterValues);

        System.out.println("Подходящие ноутбуки:");
        for (Notebooks notebook : filteredNotebooks) {
            System.out.println(notebook.toString());
        }
    }

    public static List<Notebooks> filterNotebooks(Set<Notebooks> notebooks, Map<String, Integer> filterValues) {
        List<Notebooks> filteredNotebooks = new ArrayList<>();

        for (Notebooks notebook : notebooks) {
            boolean isMatched = true;

            for (Map.Entry<String, Integer> entry : filterValues.entrySet()) {
                String criteria = entry.getKey();
                int minValue = entry.getValue();

                switch (criteria) {
                    case "ram":
                        if (notebook.getRam() < minValue) {
                            isMatched = false;
                        }
                        break;
                    case "hardDrive":
                        if (notebook.getHardDrive() < minValue) {
                            isMatched = false;
                        }
                        break;
                    case "os":if (notebook.getOs()< minValue) {
                            isMatched = false;
                        }
                        break;
                    case "price":
                        if (notebook.getPrice()< minValue) {
                            isMatched = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный критерий фильтрации: " + criteria);
                        break;
                }

                if (!isMatched) {
                    break;
                }
            }

            if (isMatched) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}  