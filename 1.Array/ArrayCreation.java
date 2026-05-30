import java.util.*;
public class ArrayCreation {

    //Function to print array
    public static void printArray(int arr[]){
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //creating an array without user input
        int list[] = {1,2,3,4,5};
        printArray(list);
        
        //creating an array with user input
        Scanner io = new Scanner(System.in);
        int marks[] = new int[6];

        //loop for inserting marks into the array from user
        System.out.println("Enter marks");
        for (int i= 0; i<marks.length; i++){
            marks[i] = io.nextInt();
        }
        System.out.println("Array of marks is:-");
        printArray(marks);
        io.close();
    }
}