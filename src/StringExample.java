/**
 * String example
 *
 * @author Mattias
 */
public class StringExample {
    public static void main(String[] args) {
        String firstName = "Mattias";
                String lastName = "Kalamees";
                String fullName = firstName + lastName;  // option 1

        System.out.println(fullName);
        String city = "Tallinn";

        fullName = firstName.concat(lastName);  // option 2

        String ageString = "My age is : " + 3 + "i live in" + city + "My name is: " + fullName;

        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 3, city, fullName);
    }
}
