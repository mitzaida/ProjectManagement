/*
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("( hola mundo ( ) ho )"));
    }
    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        String nn = "";

        nn.indexOf(4);
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']','[');

        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.peek() != map.get(c)) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
*/
