//Java program to reverse an array
//By using a temporary array: Brutrforce approach with time & space complexity = O(n)
//By swapping method: Optimized approach with time complexity=O(n) & space complexity=O(1)
public class RevArr {
    //Function to print array
    public static void printArray(int arr[]){
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
    //Function to reverse an array by using a temporary array
    public static void tempReverse(int arr[]){
        int n = arr.length;
        int tempArr[] = new int[n];
        for(int i=arr.length-1; i>=0; i--){
            tempArr[n-i-1] = arr[i]; 
        }
        printArray(tempArr);
    } 
    //Function to reverse an array by swapping method
    public static void swapReverse(int arr[]){
        for(int i=0; i<=arr.length/2; i++){
            int x = arr[i];
            arr [i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = x;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array1[] = {11, 12, 13, 14, 15};
        printArray(array);
        tempReverse(array);
        printArray(array1);
        swapReverse(array1);
    }    
} 
