package Sorting;
import java.util.*;

public class Bubblesort {
    public static void bubbleSort(int[] number){
        
        for (int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-1-i;j++){
                
                if(number[j]>number[j+1]){
                    
                    //SWAP
                    int temp = number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;

                }
               
            }
        }
      
    }
      public static void Arr(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String args[]){
        int number[]= {1,2,3,6,9,4,7,8,10,5};
        bubbleSort(number);
        Arr(number);
        
    }

    
}
