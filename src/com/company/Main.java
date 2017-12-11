package com.company;

public class Main {

    public static void main(String[] args) {
        Duplicate dup = new Duplicate();
        int array[] = {9,8,7,37,8,9,11,7};
        int[] array2 = {0,0,0,0,0};
        int[] array3 = {};
        int[] array4 = {1,2,3,4,5};

        PrintArray print = new PrintArray();
        System.out.println(dup.duplicate(array));
        System.out.println(dup.duplicate(array2));
        System.out.println(dup.duplicate(array3));
        System.out.println(dup.duplicate(array4));






        /*int[] listmain = {7, 7, 8, 6, 11, 7, 0, -58, 1819, 651, -651, 7};

        BubbleSortExample bs = new BubbleSortExample();

        PrintArray print = new PrintArray();
        print.printArray(listmain);

        bs.bubbleSort(listmain);
        for (int i = 0; i < (listmain.length); i++) {
            System.out.print(" " + listmain[i]);

        }
        System.out.println();
        System.out.println("" + bs.isSorted(listmain));
*/
    }
}
