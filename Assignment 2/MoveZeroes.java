package Assignment2;

public class MoveZeroes {
    
        public void moveZeroes(int[] nums) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                 if(nums[i]!=0){
                     nums[j]=nums[i];
                     j++;
                 }
            }
            while(nums.length-1>=j){
                nums[j]=0;
                j++;
            }
            
        }
    }

