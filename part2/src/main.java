import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        System.out.println(balancedParentheses("He((o Wor(d)"));
        System.out.println(balancedBrackets("()<>{}[]"));
        System.out.println(usingStacks("Hel[lo]"));
    }


    //This solution has O(n) run time on the length of the string, as the .count() method had to iterate over the entire string.
    //My solution uses regex to match any brackets while the given solution uses for loops and counter variables to increment for each match.
    public static boolean balancedParentheses(String myString) {
        Pattern open = Pattern.compile("[(]");
        Pattern close = Pattern.compile("[)]");

        Matcher openMatch = open.matcher(myString);
        Matcher closeMatch = close.matcher(myString);

        return openMatch.results().count() == closeMatch.results().count();
    }

    //This solution has O(n) run time on the length of the string, as the .count() method had to iterate over the entire string.
    //My solution uses regex to match the parenthesis while the given solution creates a hash map and checks that all closing brackets have a corresponding opening bracket.
    public static boolean balancedBrackets(String myString) {
        Pattern openA = Pattern.compile("<");
        Pattern closeA = Pattern.compile(">");

        Pattern openP = Pattern.compile("\\(");
        Pattern closeP = Pattern.compile("\\)");

        Pattern openC = Pattern.compile("\\{");
        Pattern closeC = Pattern.compile("}");

        Pattern openS = Pattern.compile("\\[");
        Pattern closeS = Pattern.compile("]");

        Matcher openAMatch = openA.matcher(myString);
        Matcher closeAMatch = closeA.matcher(myString);

        Matcher openPMatch = openP.matcher(myString);
        Matcher closePMatch = closeP.matcher(myString);

        Matcher openCMatch = openC.matcher(myString);
        Matcher closeCMatch = closeC.matcher(myString);

        Matcher openSMatch = openS.matcher(myString);
        Matcher closeSMatch = closeS.matcher(myString);

        return openAMatch.results().count() == closeAMatch.results().count()
                && openPMatch.results().count() == closePMatch.results().count()
                && openCMatch.results().count() == closeCMatch.results().count()
                && openSMatch.results().count() == closeSMatch.results().count();
    }

    //My solution runs on O(n^2) time as the both the for-loop and the .push() method run linearly with the length of the string.
    //If we were to use a queue, the runtime would only be 0(n) as the equivalent .push() method would run in constant time as it does not have to reassign all the queue elements.
    public static boolean usingStacks(String myString) {

        ArrayStack myStack = new ArrayStack(myString.length());
        for (int i = 0; i < myString.length(); i++) {
            myStack.push(Character.toString(myString.charAt(i)));
        }

        int sCount = 0;
        int pCount = 0;
        int aCount = 0;
        int cCount = 0;

        while (myStack.size() > 0) {
            switch (myStack.pop()) {
                case "[": sCount++; break;
                case "]": sCount--; break;
                case "(": pCount++; break;
                case ")": pCount--; break;
                case "<": aCount++; break;
                case ">": aCount--; break;
                case "{": cCount++; break;
                case "}": cCount--; break;

            }
        }

        return sCount == 0 && pCount == 0 && aCount == 0 && cCount == 0;


    }

}
