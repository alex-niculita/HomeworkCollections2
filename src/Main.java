import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 2, 3, 4, 4, 5, 5, 6, 7));

        //Задание 1. Напечатать только нечетные числа
        System.out.println("Задание 1");
        printOdds(nums);
        System.out.println();

        //Задание 2. Напечатать только четные числа без повторений в порядке возрастания
        System.out.println("Задание 2");
        printEvensDistinctSorted(nums);
        System.out.println();

        String str = "Напишите код который выводит код в консоль все уникальные слова из " +
                "списка слов в выводит котором могут выводит выводит встречаться дубли все все выводит";

        //Задание 3. Напечатать в консоль все уникальные слова из списка слов
        System.out.println("Задание 3");
        printUniqueWords(str);
        System.out.println();

        //Задание 4. Напечатать все количество дублей из списка слов
        System.out.println("Задание 4");
        printDoubles(str);
        System.out.println();

    }

    public static void printOdds(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void printEvensDistinctSorted(List<Integer> nums) {
        Set<Integer> dist = new HashSet<>(nums);
        List<Integer> temp = new ArrayList<>();
        for (Integer num : dist) {
            if (num % 2 == 0) {
                temp.add(num);
            }
        }
        Collections.sort(temp);
        for (Integer num : temp) {
            System.out.println(num);
        }

    }

    public static void printUniqueWords(String str) {
        Set<String> unique = new HashSet<>(List.of(str.split(" ")));
        System.out.println(unique);
    }

    public static void printDoubles(String str) {
        String[] arr = str.split(" ");
        Map<String, Integer> doubles = new HashMap<>();

        for (String s : arr) {
            if (doubles.containsKey(s)) {
                int n = doubles.get(s) + 1;
                doubles.put(s, n);
            } else {
                doubles.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> e : doubles.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }

    }

}