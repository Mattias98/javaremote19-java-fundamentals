package exercises;

/**
 * Find all pairs of elemints in an array whose sum is equal to a specified number; (1,2,7,3,10,2,9) with sum 4.
 * @author Mattias
 */

// my solution from internet

public class Array1 {
    static void  pairs_value(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements and their sum : ");

        for (int i =  0; i < inputArray.length; i++)
        {
            for (int j  = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
                }
            }
        }
    }

    public static void  main(String[] args)
    {
      pairs_value(new int[] {1, 2, 7, 3, 10, 2, 9 }, 4);







    }
}

