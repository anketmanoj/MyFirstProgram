import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

// public class App {
// public static void main(String[] args) throws Exception {

// String x = "water";
// String y = "Koolaid";
// String temp;

// temp = x;
// x = y;
// y = temp;

// System.out.println("X is " + x);
// System.out.println("Y is " + y);

// }
// }

// import java.util.Scanner;

// // create a public class app that has a main method
// public class App {
// // create a main method
// public static void main(String[] args) throws Exception {

// Scanner scanner = new Scanner(System.in);

// System.out.println("What is your name?");
// String name = scanner.nextLine();

// System.out.println("What is your age?");
// int age = scanner.nextInt();
// scanner.nextLine();

// System.out.println("What is your favorite color?");
// String color = scanner.next();

// System.out.println(
// "Hello, " + name + "!" + " You are " + age + " years old." + " Your favorite
// color is " + color + ".");

// }
// }

// * Expressions in Java

// public class App {
// public static void main(String[] args) throws Exception {

// double friends = 10;
// friends = friends / 3;

// System.out.println(friends);
// }
// }

// * basic GUI app
// import javax.swing.JOptionPane;

// public class App {
// public static void main(String[] args) throws Exception {
// String name = JOptionPane.showInputDialog("What is your name?");
// JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

// int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
// JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

// double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are
// you?"));
// JOptionPane.showMessageDialog(null, "You are " + height + " inches tall.");

// }
// }

// * working with math class

// public class App {
// public static void main(String[] args) throws Exception {
// double x = 3.14;
// double y = -10;

// double z = Math.PI;

// System.out.println("The largest number is " + z);
// }
// }

// * create a program to find the hypotenuse of a triangle
// import javax.swing.JOptionPane;

// public class App {
// public static void main(String[] args) throws Exception {
// double x = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the
// length of this side? "));
// double y = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the
// length of this side?"));

// double c = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

// System.out.println("hypotenuse is " + c);
// }
// }

// * Working with random numbers
// import java.util.Random;

// public class App {
// public static void main(String[] args) throws Exception {
// Random random = new Random();

// // int x = random.nextInt(6) + 1;
// double y = random.nextDouble();

// // x = Math.abs();

// System.out.println(y);
// }
// }

// * working with if statements

// public class App {
// public static void main(String[] args) throws Exception {
// int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are
// you?"));

// if (age >= 18) {
// System.out.println("You are old enough to vote!");
// } else if (age == 17) {
// System.out.println("You can vote next year!");
// } else {
// System.out.println("You can't vote yet!");
// }
// }
// }

// * working with switch statements

// public class App {
// public static void main(String[] args) throws Exception {
// String day = JOptionPane.showInputDialog(null, "What day is it?");

// switch (day) {
// case "Sunday":
// System.out.println("Happy Sunday!");
// break;

// default:
// System.out.println("Have a nice day!");
// break;
// }
// }
// }

// *working with logical operators

// public class App {
// public static void main(String[] args) throws Exception {
// int temp = 70;

// if (temp > 30) {
// System.out.println("It is hot outside");
// } else if (temp >= 20 && temp <= 30) {
// System.out.println("Its a nice day");
// } else {
// System.out.println("It is cold outside");
// }
// }
// }

// * working with while loops

// public class App {
// public static void main(String[] args) throws Exception {
// int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a
// number"));

// while (x < 3) {
// System.out.println(x);
// x++;
// }
// }
// }

// * Working with for loops

// public class App {
// public static void main(String[] args) throws Exception {
// for (int i = 0; i < 10; i++) {
// System.out.println(i);
// }
// }
// }

// * Working with nested loops

// public class App {
// public static void main(String[] args) throws Exception {
// Scanner scanner = new Scanner(System.in);

// int rows;
// int columns;
// String symbol = "";

// System.out.println("How many rows?");
// rows = scanner.nextInt();
// System.out.println("How many columns?");
// columns = scanner.nextInt();
// System.out.println("What symbol do you want to use?");
// symbol = scanner.next();

// for (int i = 0; i < rows; i++) {
// System.out.println();
// for (int j = 0; j < columns; j++) {
// System.out.print(symbol);
// }
// }
// }
// }

// * Working with arrays

// public class App {
// public static void main(String[] args) throws Exception {
// String[] cars = { "Camaro", "Corvette", "Mustang", "Charger" };

// for (int i = 0; i < cars.length; i++) {
// System.out.println(cars[i]);
// }

// }
// }

// * Working with 2D arrays

// public class App {
// public static void main(String[] args) throws Exception {
// String[][] cars = { { "Camaro", "Corvette", "Mustang", "Charger" },
// { "Chevy", "Cadillac", "Chrysler", "Dodge" },
// { "Ford", "GMC", "Jeep", "Lincoln" } };

// for (int i = 0; i < cars.length; i++) {
// System.out.println();
// for (int j = 0; j < cars[i].length; j++) {
// System.out.print(cars[i][j] + " ");
// }
// }
// }
// }

// * Working with wrapper classes

// public class App {
// public static void main(String[] args) throws Exception {
// Boolean a = true;
// Character b = '@';
// Double c = 3.14;
// String d = "Hello";

// if (a == true) {
// System.out.println("a is true");
// }
// }
// }

// * array lists in java

// public class App {
// public static void main(String[] args) throws Exception {
// ArrayList<String> cars = new ArrayList<String>();

// cars.add("Camaro");
// cars.add("Corvette");
// cars.add("Mustang");
// cars.add("Charger");

// cars.set(0, "Test");
// cars.remove(2);

// for (int i = 0; i < cars.size(); i++) {
// System.out.println(cars.get(i));
// }
// }
// }

// * 2d array lists in java
// public class App {
//     public static void main(String[] args) throws Exception {
//         ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

//         ArrayList<String> bakeryList = new ArrayList<String>();
//         bakeryList.add("Bread");
//         bakeryList.add("Cake");
//         bakeryList.add("Cookie");

//         ArrayList<String> produceList = new ArrayList<String>();
//         produceList.add("Apple");
//         produceList.add("Banana");
//         produceList.add("Orange");

//         ArrayList<String> drinksList = new ArrayList<String>();
//         drinksList.add("Coffee");
//         drinksList.add("Tea");

//         groceryList.add(bakeryList);
//         groceryList.add(produceList);
//         groceryList.add(drinksList);

//         System.out.println(groceryList.get(0));
//     }
// }

// * working with for each loop

// public class App {
//     public static void main(String[] args) throws Exception {
//         // String[] animals = { "Cat", "Dog", "Bird", "Fish" };

//         ArrayList<String> animals = new ArrayList<String>();
//         animals.add("Cat");
//         animals.add("Dog");
//         animals.add("Bird");
//         animals.add("Fish");

//         for (String animal : animals) {
//             System.out.println(animal);
//         }
//     }
// }

// * methods in java

// public class App {
//     public static void main(String[] args) throws Exception {
//         int x = 4;
//         int y = 4;

//         System.out.println(add(x, y));
//     }

//     public static int add(int x, int y) {
//         return x + y;
//     }

// }

// * working on OOP in Java

// public class App {
//     public static void main(String[] args) throws Exception {
//         Car myCar = new Car();
//         myCar.setMake("Ford");

//         // System.out.println(myCar.make);
//         myCar.drive();
//     }
// }

// * working with constructors in java

// public class App {
//     public static void main(String[] args) throws Exception {
//         Human human = new Human("John", 20, 67.9);
//         Human human2 = new Human("Jane", 21, 68.9);

//         // System.out.println(human.name);
//         // System.out.println(human2.name);

//         human.eat();
//     }
// }

// * 

// * working with super keyword in java

public class App {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Superman", 30, "Superhuman");
    }
}