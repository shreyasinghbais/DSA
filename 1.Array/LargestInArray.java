//Java program to get largest element in the array.
public class LargestInArray {
    //Function to get largest element
    public static int getLargest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largest<nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 7, 5};
        System.out.println("largest value is: " + getLargest(numbers));
    }
}
