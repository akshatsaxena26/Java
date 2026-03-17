package Array;
import java.util.*;


public class Subarray {

    public static void sub(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currSum =0;
                for (int k=i;k<=j;k++){
                    currSum += number[k];
                    // System.out.print(number[k]);

                }
                if(maxSum<currSum){
                    maxSum= currSum;
                }
                 System.out.println(currSum);
            }
        }
        // System.out.println(maxSum);
    }
    public static void main(String args[]){
        int number[]={2,4,6};
        sub(number);
    }
    
}
