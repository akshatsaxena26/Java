package Array;

class Zigzagmerge {

    public static int[] zigzagMerge(int arr[], int brr[]) {

        int crr[] = new int[arr.length + brr.length];

        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < brr.length) {
            crr[k++] = arr[i++];
            crr[k++] = brr[j++];
        }

        while (i < arr.length) {
            crr[k++] = arr[i++];
        }

        while (j < brr.length) {
            crr[k++] = brr[j++];
        }

        return crr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int brr[] = { 7, 8, 9, 10 };

        int result[] = zigzagMerge(arr, brr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}