public class SubarrayMaxSumPrefixMethod {
    //Function to get the maximum sum of the sub arrays
    public static void maxSubArraysSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //Loop to calculate the prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                // currSum=0;
                // for(int k=start; k<=end; k++){
                //     currSum += num[k];
                // } 
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The maximum sub array sum is - " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10};
        maxSubArraysSum(numbers);
    }
}
