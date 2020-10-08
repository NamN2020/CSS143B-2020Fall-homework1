/*
    Nam Nguyen
    October 8th, 2020
    CSS 143B
    homework_1

    Sources used:
    https://www.geeksforgeeks.org/bubble-sort/
 */

public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        if (data == null || data.length == 0) {     //  filter Arrays
            return;
        }
        for (int n = 0; n < data.length - 1; n++) {
            for (int i = 0; i < data.length - 1 - n; i++) {     //  the condition is, data.length - 1 - n, because the largest number will be at
                                                                //  the largest index every loop so this, - n, ignores the largest index for the inner for-loop
                if (data[i] > data[i + 1]) {    //  if left side is larger than right side than swap places
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }

            }
        }
    }
}
