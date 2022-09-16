import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BalancedBracketsParameterized {

    private String input;
    private boolean expectedOutput;
    BalancedBrackets bb = new BalancedBrackets();

    public BalancedBracketsParameterized(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static List<Object[]> testConditions() {
        String balancedArrowAndParenthesis = "<button type=submit onClick='helloWorld()>";
        String missingCloseArrow = "<script src=home.java";
        String missingOpenSquare = "int] nums = {1, 2, 3, 4, 5}";
        String extraOpenCurly = "int[] nums = {{1, 2, 3, 4, 5)";
        String empty = "";

        Object[][] expectedOutputs = {
                {balancedArrowAndParenthesis, true},
                {missingCloseArrow, false},
                {missingOpenSquare, false},
                {extraOpenCurly, false},
                {empty, true}
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets() {
        assertEquals(expectedOutput, bb.balancedBrackets(input));
    }

}
