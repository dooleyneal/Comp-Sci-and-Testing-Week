import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BalancedBrackets {
    public static void main(String[] args) {

    }
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
}
