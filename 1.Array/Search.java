/*Searching algorithms are used to check an element or 
retrieve an element from an Array where it is stored.
Types of searching algorithms are: 1.Linear or Sequential Search & 2.Binary Search.*

/*Sequential search algorithm that starts at one end and goes through each element of the array
until the desired element is found, otherwise the search continues till the end of the data set.
Time Complexity: O(N) & Space Complexity: O(1).*/ 

/*Binary Search algorithm is used in a sorted array by repeatedly dividing the search interval in half.
Time Complexity: O(logN) & Space Complexity: O(1).*/

public class Search {
    //Function to perform Sequential Search
    public static int seqencialSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            } 
        }
        return -1;
    }
    //Function to perform Binary Search
    public static int binarySearch(int arr[], int key){
        int start=0; int end=arr.length;
        while (start<=end) {
            int mid = (start+end)/2;
            if(key==mid){
                return mid;
            }
            else if(key<mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    //Function to print array
    public static void printArray(int arr[]){
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        //creating a character type array of vovels
            int array[] = {2, 4, 6, 8, 10};
            printArray(array);
            
            int element = 4;
            int value = 7;

            //Function calling of Sequencial Search
            int elem = seqencialSearch(array, element);
            if (elem == -1){
                System.out.println(element + " is NOT FOUND in the array! ");  
            }
            else{
                System.out.println(element + " is FOUND at index = " + elem );
            }
            //Function calling of Binary Search
            int val = binarySearch(array, value);
            if (val == -1){
                System.out.println(value + " is NOT FOUND in the array! ");  
            }
            else{
                System.out.println(value + " is FOUND at index = " + val );
            }
    }
}
