package com.company;

public class BubbleSortExample {
    public void bubbleSort(int[] arr) {
        int lengtharr = arr.length;
        int temp = 0;
        for (int i = 0; i < lengtharr; i++) {
            for (int j = 1; j < (lengtharr - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public boolean isSorted(int[] arr) {
        int len = arr.length;
        int i = 0;
        while (i < len - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
