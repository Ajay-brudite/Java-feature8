//9.Find the Maximum Element in an Array Using Stream Functions

import java.util.*;
import java.util.stream.*;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 0, 5, 9};

        int max=Arrays.stream(array)
            .max()
            .getAsInt();

        System.out.println("Maximum Element: " + max);
    }
}