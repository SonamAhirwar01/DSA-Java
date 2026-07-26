package Arrays.Easy;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] nums={2,5,6,8,10,6,3,5,9,4 };

        int largest= nums[0];
        int slargest=-1;
        int smallest= nums[0];
        int ssmallest=Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largest){
                slargest=largest;
                largest=nums[i];
            }
            if(nums[i]<largest && nums[i]>slargest){
                slargest=nums[i];
            }
            if (nums[i]<smallest){
                ssmallest=smallest;
                smallest=nums[i];
            }
            if(nums[i]>smallest && nums[i]<ssmallest){
                smallest=nums[i];
            }
        }
        System.out.println("largest  "+ largest);
        System.out.println("slargest "+ slargest);
        System.out.println("smallest "+smallest);
        System.out.println("ssmallest "+ssmallest);

    }
}
