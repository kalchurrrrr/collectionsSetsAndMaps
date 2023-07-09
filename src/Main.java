import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueEvenNums = new TreeSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNums.add(num);
            }
        }

        for (int num : uniqueEvenNums) {
            System.out.println(num);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<String> words = new ArrayList<>(List.of("яблоко", "банан", "вишня", "яблоко", "банан", "апельсин"));
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}