
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("My name is jacob");
        int bio_marks = 60;
        System.out.println(bio_marks);
        float pi = 3.14f;
        double temp = 3.74748489;
        long balance = 2304980958L;

        boolean choice = true;
        short overdraft = 1000;
        char gender = 'M';
        byte min = 100;
        String fname_lname= "jacob gichira";
        int a = 1;
        int b = 6;
        int c = 9;
        double x1 = 0.0;
        double x2 =0.0;
        int age = 18;
        int day = 7;
        boolean can_drink = (age >= 18 && day == 6  || day ==7);
        int marks = 65;
        boolean got_a_b = (marks >= 65 && marks <= 69);
        System.out.println(got_a_b);
       /* int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b ;
        int mod = a % b;
        int x = a--;
        int y = b++;
        int sqrt = Math.sqrt(25);
        int powe = Math.pow(a , b); */

        x1 = (-b+ Math.sqrt(Math.pow(b, 2)-(4 *a*c)))/(2 * a);
        x2 = (-b- Math.sqrt(Math.pow(b, 2)-(4 *a*c)))/(2 * a);
        System.out.println(x1);
        System.out.println(x2);






        System.out.println();


    }
}



