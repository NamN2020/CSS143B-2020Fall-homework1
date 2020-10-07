public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if( data == null || data.length == 0){
            return -1;
        }

        int maxIdx = 0;
        int left = 0;
        int right = data.length;
        int mid = (left + right) / 2;

        while(data[mid] != target) {
            mid = (left + right) / 2;   //  update mid every loop

            if (target > data[mid]) {
                left = mid + 1;         //  if target is on the right side of the array than update left side
            } else if (target < data[mid]) {
                right = mid -1;         //  if target is on the left side of the array than update right side
            } else if (target == data[mid]) {
                maxIdx = mid;
            }
        }

        return maxIdx;
    }
}
