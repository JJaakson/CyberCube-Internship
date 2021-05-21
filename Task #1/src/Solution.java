import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Character, Integer> before = new HashMap<>();
    Map<Character, Integer> after = new HashMap<>();

    private Character find(String s, String t) {
        for (Character character : s.toCharArray()) {
            if (before.isEmpty() || !before.containsKey(character)) {
                before.put(character, 1);
            } else if (before.containsKey(character)) {
                before.replace(character, before.get(character) + 1);
            }
        }
        for (Character character : t.toCharArray()) {
            if (after.isEmpty() || !after.containsKey(character)) {
                after.put(character, 1);
            } else if (after.containsKey(character)) {
                after.replace(character, after.get(character) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : after.entrySet()) {
            if (!before.containsKey(entry.getKey())) {
                return entry.getKey();
            } else {
                if (!before.get(entry.getKey()).equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println("Example: Input =>  s = \"abcd\", t = \"abcde\"; Output => \"e\"");
        System.out.println("My solution: " + x.find("abcd", "abcde"));

        System.out.println("Example: Input =>  s = \"\", t = \"y\"; Output => \"y\"");
        System.out.println("My solution: " + x.find("", "y"));

        System.out.println("Example: Input =>   s = \"a\", t = \"aa\"; Output => \"a\"");
        System.out.println("My solution: " + x.find("a", "aa"));

        System.out.println("Example: Input =>  s = \"ae\", t = \"aea\"; Output => \"a\"");
        System.out.println("My solution: " + x.find("ae", "aea"));
    }
}
