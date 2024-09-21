import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");

    String name = input.next();
    String surename = input.next();

    System.out.println("Your name is " + name + " " + surename);
    input.close();
  }


}