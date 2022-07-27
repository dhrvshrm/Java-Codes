// import java.util.Scanner;

// // QUES 1 -- -- Addition of two numbers -- -- 

// // public class Functions {

// //     public static int calculate(int x, int y) {
// //         int sum = x + y;
// //         return sum;

// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int x = sc.nextInt();
// //         int y = sc.nextInt();

// //         int sum = calculate(x, y);
// //         System.out.println(sum);
// //     }
// // }

// // -------- ---------- ------------ --------- ---------- !!!!!! -------- ---------- ------------ --------- ----------

// // QUES 2  -- -- Multipication of two numbers -- --

// // public class Functions {
// //     public static int calculate(int x, int y) {
// //         int product = x * y;
// //         return product;

// //     }

// // public static void main(String[] args) {
// //     Scanner sc = new Scanner(System.in);
// //     System.out.println("Enter first number : ");
// //     int x = sc.nextInt();
// //     System.out.println("Enter second number : ");
// //     int y = sc.nextInt();

// //     int product = calculate(x, y);
// //     System.out.println("Product is " + product);
// // }
// // }

// // -------- ---------- ------------ --------- ---------- !!!!!! -------- ---------- ------------ --------- ----------

// // QUES 3 -- -- FACTORIAL OF A NUMBER -- -- 

// // public class Functions {
// //     public static void Factorial(int n) {
// //     // condition 
// //     if(n < 0) {
// //         System.out.println("invalid number");
// //         return;
// //     }

// //     int fact = 1;

// //     for (int i=n; i>=1; i--) {
// //         fact = fact*1;  

// //     }
// //     System.out.println(fact);
// //     return;        
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter a number : ");
// //         int n = sc.nextInt();

// //         System.out.println("Factorial of the entered number is : " + Factorial);
// //     }

// // }

// // -------- ---------- ------------ --------- ---------- !!!!!! -------- ---------- ------------ --------- ----------

// // QUES 4 -- -- Enter 3 numbers from the user & make a function to print their average -- -- 

// // public class Functions {
// //     public static int calculate(int x, int y, int z) {
// //         int avg = (x + y + z) / 3;
// //         return avg;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter x");
// //         int x = sc.nextInt();
// //         System.out.println("Enter y");
// //         int y = sc.nextInt();
// //         System.out.println("Enter z");
// //         int z = sc.nextInt();

// //         int avg = calculate(x, y, z);
// //         System.out.println("The average of the enetered numbers is : " + avg);
// //     }

// // }

// // -------- ---------- ------------ --------- ---------- !!!!!! -------- ---------- ------------ --------- ----------

// // QUES 5 -- -- Write a function to print the sum of all odd numbers from 1 to n. -- --
// // import java.util.*;
// // import java.util.concurrent.SubmissionPublisher;

// // public class Functions {
// //     public static void calculate(int n, int i, int sum) {

// //         for (i = 0; i <= n; i++) {
// //             if ((i % 2) == 1) {
// //                 sum = sum + i;
// //             }
// //             int sum = 0;
// //         }
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a nummber : ");
// //         n = sc.nextLine();

// //         System.out.println("The sum of numbers is : " + sum);
// //     }
// // }

// // QUES 6 -- -- Write a function that takes in the radius as input and returns the circumference of a circle. -- --

// // import java.util.*;

// // public class Functions {
// //     public static void circumference(Double r, double cir) {
// //         double pie = 3.14;
// //         double cir = 2 * pie * r;
// //         return;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the radius : ");
// //         double r = sc.nextInt();
// //         double result = Math.round(circumference(r) * 1000) / 1000.0;
// //         System.out.println("Circumference is : " + result);
// //     }
// // }

// // Ques 7 -- -- Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// // -- -- 

// public class Functions {
//     public static void vote(int age) {
//         // condition
//         if (age >= 18) {
//             System.out.println("Eligible to vote!");
//             return;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age : ");
//         int age = sc.nextInt();
//         System.out.println(vote(age));
//     }
// }