import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchParenthesis {
    private static final Map<Character, Character> matchingParenMap = new HashMap<>();
    private static final Set<Character> openinParenSet = new HashSet<>();

    static {
        matchingParenMap.put(')', '(');
        matchingParenMap.put('}', '{');
        matchingParenMap.put(']', '[');
        openinParenSet.addAll(matchingParenMap.values());
    }

    public static boolean hasMatchingParens(String input) {
        try {
            Stack<Character> parenStack = new Stack<>();
            for(int i = 0; i<input.length(); i++) {
                char ch = input.charAt(i);
                if (openinParenSet.contains(ch)) parenStack.push(ch);

                if(matchingParenMap.containsKey(ch)) {
                    Character lastParen = parenStack.pop();
                    if(lastParen != matchingParenMap.get(ch)) return false;
                }
            }
            return parenStack.isEmpty();
        } catch (StackOverflowException e) {
            System.err.println("Stack Overflow!!!");
        } catch (StackUnderflowException e) {
            System.err.println("Stack Underflow!!!");
        }
        return true;
    }
}
