import org.example.BubbleSort;
import org.example.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void mergeSort1_arrayEqual() {
        int[] input = new int[]{3, 2, 1};
        int[] output = new int[]{1, 2, 3};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(MergeSort.mergeSortSol(input)), "Output error");
    }

    @Test
    public void mergeSort2_arrayEqual() {
        int[] input = new int[]{1, 2, 3};
        int[] output = new int[]{1, 2, 3};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(MergeSort.mergeSortSol(input)), "Output error");
    }

    @Test
    public void mergeSort3_arrayEqual() {
        int[] input = new int[]{5, 2, 3, 8, 6, 1};
        int[] output = new int[]{1, 2, 3, 5, 6, 8};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(MergeSort.mergeSortSol(input)), "Output error");
    }
}
