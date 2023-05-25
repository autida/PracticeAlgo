package org.example;

public class MergeSort {
    static void merge(int[] a, int left, int mid, int right) {
        int nleft = mid - left + 1;
        int nright = right - mid;

        int[] leftsub = new int[nleft];
        int[] rightsub = new int[nright];
        // populating left sub
        for(int i = 0; i < nleft; i++) {
            leftsub[i] = a[left + i];
        }
        // populating right sub
        for(int i = 0; i < nright; i++) {
            rightsub[i] = a[mid + i + 1];
        }
        int i = 0, j = 0, k = left;
        while (i < nleft && j < nright) {
            if (leftsub[i] <= rightsub[j]) {
                a[k] = leftsub[i];
                i++;
            } else {
                a[k] = rightsub[j];
                j++;
            }
            k++;
        }
        while(i < nleft) {
            a[k] = leftsub[i];
            i++;
            k++;
        }
        while (j < nright) {
            a[k] = rightsub[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] a, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }
    public static int[] mergeSortSol(int[] a) {
        mergeSort(a, 0, a.length - 1);
        return null;
    }
}
