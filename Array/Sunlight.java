package Array;

public class Sunlight {
    public static int sunlight(int arr[]) {
        int max = 0;
        int count = 0;

        for (int n : arr) {
            if (n > max) {
                max = n;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 15, 9, 25, 20, 40 };
        int result = sunlight(arr);
        System.out.println(result);

    }

}
