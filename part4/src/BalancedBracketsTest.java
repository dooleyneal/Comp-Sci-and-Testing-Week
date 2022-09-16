import static org.junit.Assert.*;
import org.junit.Test;

public class BalancedBracketsTest {
    String balancedArrowAndParenthesis = "<button type=submit onClick='helloWorld()>";
    String missingCloseArrow = "<script src=home.java";
    String missingOpenSquare = "int] nums = {1, 2, 3, 4, 5}";
    String extraOpenCurly = "int[] nums = {{1, 2, 3, 4, 5)";
    String empty = "";
    BalancedBrackets bb = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedArrowAndParenthesis() {
        assertTrue(bb.balancedBrackets(balancedArrowAndParenthesis));
    }

    @Test
    public void testBalancedBrackets_missingCloseArrow() {
        assertFalse(bb.balancedBrackets(missingCloseArrow));
    }

    @Test
    public void testBalancedBrackets_missingOpenSquare() {
        assertFalse(bb.balancedBrackets(missingOpenSquare));
    }

    @Test
    public void testBalancedBrackets_extraOpenCurly() {
        assertFalse(bb.balancedBrackets(extraOpenCurly));
    }

    @Test
    public void testBalancedBrackets_empty() {
        assertTrue(bb.balancedBrackets(empty));
    }
}
