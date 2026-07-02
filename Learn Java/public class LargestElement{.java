public class LargestElement{
    public static void main(String[] nums){
        int[] nums={3,3,6,1};
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
} 
    

