public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearSearch(intArray, 5);
    }

    public static int linearSearch(int[] array, int target){
        // LINEAR SEARCH - SEQUENTIAL SEARCH
        for(int i = 0; i<array.length; i++){
            if(array[i] == target){
                System.out.println("Target found in the array: "+target);
                return target;
            }
        }
        System.out.println("Not found in the array - worst case scenario");
        return -1;
    }
}
