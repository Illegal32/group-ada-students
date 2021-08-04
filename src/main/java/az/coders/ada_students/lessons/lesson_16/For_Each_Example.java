package az.coders.ada_students.lessons.lesson_16;

import java.util.Random;

public class For_Each_Example {
    public static void main(String[] args) {
        int [] arr = generateArray(15);
        int [] arr1 = generateArray(10);
        printWithForI(arr);
        printWithForEach(arr1);
    }
    //bu methodun isi ondan ibaretdirki
    // random reqemler qaytarmaqdir
    // uzunluqu 10 olacaq
    private static int [] generateArray(int length){
        int [] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    private static void printWithForI(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void printWithForEach(int[] arr) {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
