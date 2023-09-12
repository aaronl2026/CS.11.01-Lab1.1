import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int minimum_age = 7+(age/2);
        System.out.println(age+"-year olds should date somebody who is at least "+minimum_age+" years old.");
    }
}
