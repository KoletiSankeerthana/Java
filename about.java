import java.util.Scanner;  // import Scanner class

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // reads a full line of text

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // reads an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();  // good practice: close the scanner
    }
}
