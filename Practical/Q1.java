//1. Write a program take 2 strings as input from the user and find if
//   both the strings are same or not.



package Practical;

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = sc.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = sc.nextLine();

    if (str1.equals(str2)) {
      System.out.println("Congratulation you string got matched");
    } else {
      System.out.println("String does not matched");
    }
  }
}
