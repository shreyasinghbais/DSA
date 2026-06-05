//Java program to get all the sub arrays in the array.
public class SubarrayPrint {
    //Function to print the sub arrays
    public static void   printSubArrays(int num[]){
        int tsa=0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k]+" ");
                }
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Tolal No. of Sub Arrays are - " + tsa);
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
