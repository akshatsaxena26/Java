package Array;

import java.util.*;

public class Sunlight_list {
    public static List<Integer> sunlight_list(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(i);

            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 20, 25, 50, 100 };
        System.out.println(sunlight_list(arr));

    }

}
