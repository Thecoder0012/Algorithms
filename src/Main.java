public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        binarySearch(intArray, 5);
        linearSearch(intArray, 5);
    }

    public static int linearSearch(int[] array, int target){
        // LINEAR SEARCH - SEQUENTIAL SEARCH
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Target found in the array: " + target);
                return target;
            }
        }
        System.out.println("Not found in the array - worst case scenario");
        return -1;
    }

    public static int binarySearch(int[] data, int target) {
        int start = 0, end = data.length - 1;
        int midPoint;
        while (start <= end) {
            midPoint = (start + end) / 2;
            if (data[midPoint] == target) {
                System.out.println("Target found the in the array: "+target);
                return target;
            } else if (data[midPoint] < target) {
                start = midPoint + 1;
            } else {
                end = midPoint - 1;
            }
        }
        return 0;
    }
}
