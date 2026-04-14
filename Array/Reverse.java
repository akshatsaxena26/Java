package Array;

public class Reverse {
    public static void reverseArray(int n[], int start, int end) {

        while (start < end) {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args) {

        int start = 0;

        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };

        int end = arr.length - 1;
    }
}
