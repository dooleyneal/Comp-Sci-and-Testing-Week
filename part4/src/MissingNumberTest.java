import static org.junit.Assert.*;
import org.junit.Test;

public class MissingNumberTest {
    private int[] missingOne = { 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] missingFour = { 1, 2, 3, 5, 6, 7, 8, 9, 10};
    private int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingOne() {
        assertEquals(1, mn.missingNumber(missingOne, 10));
    }

    @Test
    public void testMissingNumber2_MissingOne() {
        assertEquals(1, mn.missingNumber2(missingOne, 10));
    }

    @Test
    public void testMissingNumber3_MissingOne() {
        assertEquals(1, mn.missingNumber3(missingOne, 10));
    }

    @Test
    public void testMissingNumber_MissingFour() {
        assertEquals(4, mn.missingNumber(missingFour, 10));
    }

    @Test
    public void testMissingNumber2_MissingFour() {
        assertEquals(4, mn.missingNumber2(missingFour, 10));
    }

    @Test
    public void testMissingNumber3_MissingFour() {
        assertEquals(4, mn.missingNumber3(missingFour, 10));
    }

    @Test
    public void testMissingNumber_MissingNone() {
        assertEquals(0, mn.missingNumber(missingNone, 10));
    }

    @Test
    public void testMissingNumber2_MissingNone() {
        assertEquals(0, mn.missingNumber2(missingNone, 10));
    }

    @Test
    public void testMissingNumber3_MissingNone() {
        assertEquals(0, mn.missingNumber3(missingNone, 10));
    }
}
