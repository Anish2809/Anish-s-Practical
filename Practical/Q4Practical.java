//Q4Write a program create two interfaces 'Printable' and 'Calculate'
//and use these two interfaces in two different classes one will
//calculate square and another will calculate cube


package Practical;

import java.util.Scanner;

interface Printable {
  void print();
}

interface Calculate {
  int calculate(int x);
}

class Square implements Printable, Calculate {
  int sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public void print() {
    System.out.println("Side length: " + sideLength);
  }

  @Override
  public int calculate(int x) {
    return x * x;
  }
}

class Cube implements Printable, Calculate {
  int sideLength;

  public Cube(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public void print() {
    System.out.println("Side length: " + sideLength);
  }

  @Override
  public int calculate(int x) {
    return x * x * x;
  }
}

public class Q4Practical {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    Square square = new Square(num);
    square.print();
    System.out.println("Square: " + square.calculate(square.sideLength));

    Cube cube = new Cube(num);
    cube.print();
    System.out.println("Cube: " + cube.calculate(cube.sideLength));
  }
}
