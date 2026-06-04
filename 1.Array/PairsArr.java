//Java program to print all the pairs in the array.
//time complexity=O(n) & space complexity=O(1)
public class PairsArr {
    //Function to print array
    public static void printArray(int arr[]){
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
    //Function to print pairs of array
    public static void printPairs(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ arr[i] + ", " + arr[j] + "),");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pais of Array = "+ tp);
    }
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        printArray(array);
        printPairs(array);
    }
}
