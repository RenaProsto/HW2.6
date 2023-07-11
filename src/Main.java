import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer a : nums) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();


        Set<Integer> nums2 = new HashSet<>(List.of(4, 4, 5, 5, 6, 6, 7));
        for (Integer a : nums2) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();

        Set<String> word = new HashSet<>(List.of("aaa", "bbb", "ccc", "aaa"));
        System.out.println(word);


        List<String> string = List.of("один", "два", "два", "три", "три", "три");

        Map<String, Integer> wordsByCount = new HashMap<>();
        for (
                String w : string) {
            if (wordsByCount.containsKey(w)) {
                wordsByCount.put(w, wordsByCount.get(w) + 1);
            } else {
                wordsByCount.put(w, 1);
            }
        }
        System.out.println(wordsByCount);
    }

}