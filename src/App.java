// public class App {
//     public static void main(String[] args) throws Exception {

//         String x = "water";
//         String y = "Koolaid";
//         String temp;

//         temp = x;
//         x = y;
//         y = temp;

//         System.out.println("X is " + x);
//         System.out.println("Y is " + y);

//     }
// }

import java.util.Scanner;

// create a public class app that has a main method
public class App {
    // create a main method
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite color?");
        String color = scanner.next();

        System.out.println(
                "Hello, " + name + "!" + " You are " + age + " years old." + " Your favorite color is " + color + ".");

    }
}
