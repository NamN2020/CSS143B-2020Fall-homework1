/*
    Nam Nguyen
    October 7th, 2020
    CSS 143B
    homework_1

    Sources used:
    https://www.geeksforgeeks.org/binary-search/
 */

public class Problem1 {
    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution


        int left = 0;
        int right = data.length -1;

        while (left <= right) {             //  loops until the left is less than or equal to the right which means it completely searched the array
                                            //  this while loop also acts as a filter because if the array is empty it will skip this while loop and return -1
            int mid = (left + right) / 2;   //  update mid every loop

            if (target > data[mid]) {
                left = mid + 1;             //  if target is on the right side of the array than cut array in half by updating left side
            } else if (target < data[mid]) {
                right = mid - 1;            //  if target is on the left side of the array than cut array in half by updating right side
            } else if (target == data[mid]) {
                return mid;
            }
        }

        return -1;  //  returns -1 if it gets pass the while loop which means the target was not found in the array
    }
}
