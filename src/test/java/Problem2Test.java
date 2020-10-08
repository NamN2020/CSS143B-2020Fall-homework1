import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        // add your tests here

        int inputs[][] = {
                {},
                {5},
                {8, 2},
                {9, 3, 6},
                {1, 1, 1},
                {-4, -10, 5, 20},
                {-4, -4, -10, 5, 20},
                {8, 30, 25, -5, 7, 90},
                {43, -4, 8, 31, 7, 10, 15}
        };


        int[][] answer = {
                {},
                {5},
                {2, 8},
                {3, 6, 9},
                {1, 1, 1},
                {-10, -4, 5, 20},
                {-10, -4, -4, 5, 20},
                {-5, 7, 8, 25, 30, 90},
                {-4, 7, 8, 10, 15, 31, 43}
        };

        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {
            int[] expected =  answer[i];
            Problem2.bubbleSort(inputs[i]);
            int[] actual = inputs[i];
            assertArrayEquals(expected, actual);
        }
    }
}



