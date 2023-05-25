import org.example.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void bubbleSortTest1_arrayEqual() {
        int[] input = new int[]{3, 2, 1};
        int[] output = new int[]{1, 2, 3};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(BubbleSort.bubbleSort(input)), "Output error");
    }

    @Test
    public void bubbleSortTest2_arrayEqual() {
        int[] input = new int[]{1, 2, 3};
        int[] output = new int[]{1, 2, 3};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(BubbleSort.bubbleSort(input)), "Output error");
    }

    @Test
    public void bubbleSortTest3_arrayEqual() {
        int[] input = new int[]{5, 2, 3, 8, 6, 1};
        int[] output = new int[]{1, 2, 3, 5, 6, 8};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(BubbleSort.bubbleSort(input)), "Output error");
    }
}
