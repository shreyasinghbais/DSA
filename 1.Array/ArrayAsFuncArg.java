public class ArrayAsFuncArg {

    //Function to increament array elements by 1
    public static void update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]+1;
        }
    }

    //Function to print array
    public static void printArray(int arr[]){
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int marks[] = {94, 95, 96, 97, 98, 99};
        update(marks);
        printArray(marks);
    }
}
