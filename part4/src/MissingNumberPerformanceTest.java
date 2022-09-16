import static org.junit.Assert.*;

import org.junit.Test;


public class MissingNumberPerformanceTest {
    private int[] missingOne = { 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] missingFour = { 1, 2, 3, 5, 6, 7, 8, 9, 10};
    private int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private MissingNumber mn = new MissingNumber();

    @Test(timeout = 500)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumber(missingOne, 10);
            mn.missingNumber(missingFour, 10);
            mn.missingNumber(missingNone, 10);
        }
    }

    @Test(timeout = 500)
    public void testMissingNumber2_Performance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumber2(missingOne, 10);
            mn.missingNumber2(missingFour, 10);
            mn.missingNumber2(missingNone, 10);
        }
    }

    @Test(timeout = 500)
    public void testMissingNumber3_Performance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumber3(missingOne, 10);
            mn.missingNumber3(missingFour, 10);
            mn.missingNumber3(missingNone, 10);
        }
    }
}
