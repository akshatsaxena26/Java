package Sorting;

public class Selectionsort {
    public static void Selectionsort(int[] number){
        for(int i = 0; i<number.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<number.length;j++){
                if(number[minPos]>number[j]){
                    minPos=j;
                }


            }
            //SWAP
            int temp=number[minPos];
                number[minPos]=number[i];
                number[i]=temp;

        }

    }
        public static void Arr(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String args[]){
        int number[]={1,3,5,2,4};
        Selectionsort(number);
        Arr(number);
    }
    
}
