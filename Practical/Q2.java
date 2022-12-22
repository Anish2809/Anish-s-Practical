//2. Write a program take 2 strings as input from user and find if
//first string exists in another


package Practical;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the first string: ");
    String string1 = sc.nextLine();
    System.out.print("Enter the second string: ");
    String string2 = sc.nextLine();

    
    if (string2.contains(string1)) {
      System.out.println(string1 + " is a substring of " + string2);
    } else {
      System.out.println(string1 + " is not a substring of " + string2);
    }
  }
}
