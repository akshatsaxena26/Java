// package Array;
// import java.util.*;

// public class Linear {
//      public static int largestNumber(int numbers[]) {
//       int largest = Integer.MIN_VALUE;;
//             for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//         }

//         return largest;
//     }


//     public static void main(String args[]){
//      int number[] =  {1,2,7,4,5,6}; 
//      System.out.println("largest number is :"+largestNumber(number));
//     }
// }


package Array;
import java.util.*;

class Main {
    public static int largerValue(int number[]){
        int largestNumber = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largestNumber){
                largestNumber=number[i];
            }
        }
        return largestNumber;
    }
    
    
    public static void main(String[] args) {
        int numbers[]= {2,4,5,7,8,1,0,500,800,7};
        
        int yahooo= largerValue(numbers);
        System.out.println("the largest value is "+yahooo);
        
        
        
     
    }
}
