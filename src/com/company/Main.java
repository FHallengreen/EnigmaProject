package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  Scanner scan = new Scanner(System.in);
  final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
  char[] alphabetToChars = ALPHABET.toCharArray();

  int input = 0;

  public void checkInput() {
    input = scan.nextInt();
    while (input != 1 && input != 2) { // Created a while loop using try / if / catch to check if user is typing correct information.
      System.out.println("Please enter 1 or 2: ");
      try {
        input = Integer.parseInt(scan.nextLine());
        if (input != 1 && input != 2) {
          System.out.println("Input is not in choices!"); // If user types other numbers, it will return this message.
        }
      } catch (NumberFormatException e) {
        System.out.println("Input is invalid!"); // if user types other than numbers, it will return this message.
      }
    }
    System.out.println("You entered: " + input);
  }

  public void homePage() {
    System.out.printf("Type 1 for Caesar Algorithm \n" +
        "Type 2 for Vigenère algorithm \n");
    checkInput(); // will go to the checkInput() method to assign input a new value & make sure return value is either 1 & 2.
    if (input == 1) { // Following will now direct user to next method based on their decision or return them homeScreen()
      caesarPage();
    }
    vigenerePage();
  }

  public void caesarPage() { // The Caesar landing page which uses same loop and if statements to direct user to next page.
    System.out.println("You have chosen the Caesar Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");
    checkInput();
    if (input == 1) {
      caesarEncrypt();
    } else {
      caesarDecryption();
    }
  }

  public void vigenerePage() {
    System.out.println("You have chosen the Vigenère Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");
    checkInput();
    if (input == 1) {
      vigenereEncrypt();
    } else {
      vigenereDecryption();
    }
  }

  public int caesarEncrypt() {
    return 0;
  }

  public int caesarDecryption() {
    return 0;
  }

  public int vigenereEncrypt() {
    return 0;
  }

  public int vigenereDecryption() {
    return 0;
  }

  public void textToNumber(String inputText) {
    inputText = inputText.toUpperCase();
    int[] charPosition = new int [inputText.length()];

    for (int i = 0; i < inputText.length(); i++) {
     charPosition[i] = ALPHABET.indexOf(inputText.charAt(i)); // The character matching alphabet will be stored in charPos array.
      }
  }

  public char numberToText(int inputNumber) {
    char number = ALPHABET.charAt(inputNumber);
    System.out.println(number);
    return number;
  }


  public static void main(String[] args) {
    Main obj = new Main();

 /*   System.out.println("Welcome to my encryption / decryption tool");
    System.out.println("Please select which algorithm you want to use:");

    obj.homePage();*/
    String inputText = "Frederik";
    obj.textToNumber(inputText.toUpperCase());
  }
}
