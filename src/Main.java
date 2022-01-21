public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[5];


        linearSearch(intArray,44);
    }

    public static int linearSearch(int[] array, int target){
        // LINEAR SEARCH - SEQUENTIAL SEARCH
        array = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        for(int i = 0; i<array.length; i++){
            if(array[i] == target){
                System.out.println("Target found in the array: "+target);
                return target;

            }
        }
        System.out.println("Not in the array");
        return -1;
    }
}
