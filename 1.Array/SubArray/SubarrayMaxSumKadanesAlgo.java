public class SubarrayMaxSumKadanesAlgo {

    public static void kadanes(int num[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("The maximum sub array sum is - " + ms);
    }

    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10};
        kadanes(numbers);
    }
}
