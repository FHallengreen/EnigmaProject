package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  Scanner scan = new Scanner(System.in);

  public int homeScreen() {
    System.out.printf("Type 1 for Caesar Algorithm \n" +
        "Type 2 for Vigenère algorithm \n");
    int input = 0;

    while (input != 1 && input != 2) { // Created a while loop using try / if / catch to check if user is typing correct information.
      System.out.println("Please enter 1 for Caesar or 2 for Vigenère: ");
      try {
        input = Integer.parseInt(scan.nextLine());
        if (input != 1 && input != 2) {
          System.out.println("Input is not in choices!"); // If user types other numbers, it will return this message.
        }
      } catch (NumberFormatException e) {
        System.out.println("Input is invalid!"); // if user types other than numbers, it will return this message.
      }
    }
    if (input == 1) { // Following will now direct user to next method based on their decision or return them homeScreen()
      return caesar();
    }
      return vigenere();
  }

  public int caesar() {
    System.out.println("You have chosen the Caesar Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");
    int input = scan.nextInt();
    if (input == 1) {
      return caesarEncrypt();
    } else if (input == 2) {
      return caesarDecryption();
    }
    System.out.println("You entered something else, please try again...");
    return caesar();
  }

  public int vigenere() {
    //FILL
    return 0;
  }

  public int caesarEncrypt() {
    return 0;
  }

  public int caesarDecryption() {
    return 0;
  }

  public static void main(String[] args) {

    System.out.println("Welcome to my encryption / decryption tool");
    System.out.println("Please select which algorithm you want to use:");
    Main obj = new Main();
    obj.homeScreen();
  }
}
