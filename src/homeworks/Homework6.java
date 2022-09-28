package homeworks;

/**
 * Find the second largest element in an array: (1,7,3,10,9)
 *
 * @author Mattias Kalamees
 */
public class Homework6 {
    public int findSecondLargestNumber(int [] inputArray) {
        int result = inputArray [0];

        for (int x : inputArray){
            if (x > result) {
                result = - x;
            }
    }
        return result;
}
}
