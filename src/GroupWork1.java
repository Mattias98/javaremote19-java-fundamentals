/**
 *
 * GroupWork 1 // The Fizz Buzz Problem
 * @author Mattias & Martti
 *
 */
public class GroupWork1 {
    public static void main(String[] args) {

        // Write a program which prints "Fizz" if the number is a multiplier of 3
        // "Buzz" if the number is a multiplier of 5 and "FizzBuzz" if it can be divided with 3 and 5.
int i = 3;
int j = 5;
int x = 18; // number that is changeable

if(x % 3 == 0)
        System.out.println("Fizz");
        if(x % 5 == 0)
        System.out.println("Buzz");
        if(x % 3 == 0 && x % 5 == 0)
        System.out.println("FizzBuzz");

    }

}
