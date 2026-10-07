import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SingleNumberSolverTest {

    private final SingleNumberSolver solver = new SingleNumberSolver();

    @Test
    public void testSingleNumberAtEnd() {
        int[] nums = {2, 2, 1};
        assertEquals(1, solver.singleNumber(nums));
    }

    @Test
    public void testSingleNumberAtStart() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, solver.singleNumber(nums));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {1};
        assertEquals(1, solver.singleNumber(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -1};
        assertEquals(-2, solver.singleNumber(nums));
    }

    @Test
    public void testLargeInput() {
        int[] nums = new int[30001];
        for (int i = 0; i < 30000; i += 2) {
            nums[i] = i / 2;
            nums[i + 1] = i / 2;
        }
        nums[30000] = 9999999;
        assertEquals(9999999, solver.singleNumber(nums));
    }

    @Test
    public void testMixedNumbers() {
        int[] nums = {0, 0, 1, 2, 2, -100, -100, 999, 999, 555, 555};
        assertEquals(1, solver.singleNumber(nums));
    }

    @Test
    public void testMinimumInput() {
        int[] nums = {Integer.MIN_VALUE};
        assertEquals(Integer.MIN_VALUE, solver.singleNumber(nums));
    }

    @Test
    public void testMaximumInput() {
        int[] nums = {Integer.MAX_VALUE, Integer.MAX_VALUE, 7};
        assertEquals(7, solver.singleNumber(nums));
    }
}
