package Array;
import java.util.*;


 public class Pivot {
     public static int pivot(int nums[],int tar){
        int str=0;
        int end=nums.length-1;
        for(int i=0;i<=nums.length;i++){
            int mid=str+(end-str)/2;
            if(nums[mid]==tar){
                return mid;
            }
            if(nums[0]<=nums[mid]){
                if(nums[str]<=tar&& tar<=nums[mid]){
                    end=mid-1;
                    
                }else{
                    str=mid+1;
                }
            }else{
               if( nums[mid]<=tar && tar<=nums[end]){
                    str=mid+1;
               }else{
                   end=mid-1;
               }
                    
                
            }
        }
        return -1;
    
    }
    public static void main(String args[]){
        int nums[]={5,4,0,1,2,3};
        int target=0;
        int result=pivot(nums,target);
       System.out.print("the pivot answer is:"+result);
    }
 }


