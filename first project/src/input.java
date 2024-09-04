import java.util.Scanner;  // importing Scanner class which is present in java.util package
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creating scanner object and here System.in is a standard input stream in java
        System.out.println("Enter your name : "); // it will print the statement on console

        String name = scanner.nextLine();  // it will read the input from console
        System.out.println("Your name is : " +name);  // it will print the final output on console
    }
}
