package exercises;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        int myAge = 21;
        if (myAge >= 18){
            System.out.println("The person is an adult");
        } else{
            System.out.println("The person is not an adult");
        }

            int number = 2020;
            if(number % 2  == 0) {
                System.out.println("This is an even number");
            }   else{
                System.out.println("This is a odd number");


                // Write a Java program to print if the string is empty, if the lenght is grater than 20 and if the string is null

                String test = "";
                if(test == ""){
                    System.out.println("The given string is empty");
                }  else if(test.length() > 20) {
                    System.out.println("The given String is so long");
                }    else if (test.length() < 20){
                        System.out.println("The given string is too short");
                }  else if(test == null) {
                    System.out.println("This string cannot be 0");
                }
            }
        }

}
