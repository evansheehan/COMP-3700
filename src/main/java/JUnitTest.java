import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JUnitTest {

    @Test
    public void valid_test_findMax() {
        int[] validArray = new int[]{5, 6, 9, 4, 12, 0, 3};

        Integer expected = 12;
        Integer actual = Finder.findMax(validArray);
        assertEquals(expected, actual);
    }

    @Test
    public void invalid_test_findMax() {
        int[] nullArray = null;
        int[] emptyArray = new int[]{};

        Integer expected = null;
        Integer actual = Finder.findMax(nullArray);
        assertEquals(expected, actual);

        actual = Finder.findMax(emptyArray);
        assertEquals(expected, actual);
    }

    @Test
    public void valid_test_findMin() {
        int[] validArray = new int[]{5, 6, 9, 4, 12, 0, 3};

        Integer expected = 0;
        Integer actual = Finder.findMin(validArray);
        assertEquals(expected, actual);
    }

    @Test
    public void invalid_test_findMin() {
        int[] nullArray = null;
        int[] emptyArray = new int[]{};

        Integer expected = null;
        Integer actual = Finder.findMax(nullArray);
        assertEquals(expected, actual);

        actual = Finder.findMax(emptyArray);
        assertEquals(expected, actual);
    }
}
