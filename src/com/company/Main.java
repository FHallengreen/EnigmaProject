package com.company;

import java.util.Scanner;

public class Main {
  Scanner scan = new Scanner(System.in);

  final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

  int shiftedValue;
  String inputText;

  int input = 0;

  public void homePage() {
    System.out.printf("Type 1 for Caesar Algorithm \n" +
        "Type 2 for Vigenère algorithm \n");
    checkInput(); // will go to the checkInput() method to assign input a new value & make sure return value is either 1 & 2.
    if (input == 1) { // Following will now direct user to next method based on their decision or return them homeScreen()
      caesarPage();
    } else if (input == 2) {
      vigenerePage();
    }
  }

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

  public void caesarPage() { // The Caesar landing page which uses same loop and if statements to direct user to next page.
    System.out.println("You have chosen the Caesar Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");

    checkInput();

    System.out.println("Enter message you want to encrypt / decrypt: ");
    inputText = scan.next();
    System.out.println("Enter swift value");
    shiftedValue = scan.nextInt();

    if (input == 1) {
      caesarEncryption(inputText.toUpperCase(), shiftedValue);
    } else {
      caesarDecryption(inputText.toUpperCase(), shiftedValue);
    }
  }

  public void vigenerePage() {
    System.out.println("You have chosen the Vigenère Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");

    checkInput();

    System.out.println("Enter message you want to encrypt / decrypt: ");
    inputText = scan.next();
    System.out.println("Enter keyword");
    String keyword = scan.next();
    if (input == 1) {
      vigenereEncrypt(inputText.toUpperCase(), keyword.toUpperCase());
    } else {
      vigenereDecryption(inputText.toUpperCase(), keyword.toUpperCase());
    }
  }


  public String caesarEncryption(String textToEncrypt, int shiftValue) {

    int[] numbersFromText = textToNumber(textToEncrypt); // creating array for the text we will encrypt.

    int[] shiftedValuesFromText = shiftValue(numbersFromText, shiftValue); // Using the shiftValue method to return the encrypted message as values.

    String encryptCipherText = numbersToText(shiftedValuesFromText); // Will turn the values back into letters.

    System.out.println(encryptCipherText);
    return encryptCipherText;

  }

  public String caesarDecryption(String textToEncrypt, int shiftValue) {

    int[] numbersFromText = textToNumber(textToEncrypt); // creating array for the text we will decrypt.

    int[] shiftedValuesFromText = shiftValue(numbersFromText, shiftValue * -1); // Using shiftValue() to return decrypted text.

    String decryptCipherText = numbersToText(shiftedValuesFromText); // Will turn the values back into letters.

    System.out.println(decryptCipherText);
    return decryptCipherText;

  }


  public int vigenereEncrypt(String textToEncrypt, String keyword) {
    return 0;
  }

  public int vigenereDecryption(String textToEncrypt, String keyword) {
    return 0;
  }

  public int[] shiftValue(int[] originalPositions, int shiftValue) { // Will use the entered shiftValue to make an array with shifted values.

    int[] shiftedPositions = new int[originalPositions.length];

    for (int i = 0; i < originalPositions.length; i++) { // looping the original positions array (created in numbersToText() and returning shiftedpositions[], adding the shiftValue.

      int shiftedNumber = originalPositions[i] + shiftValue;

      if (shiftedNumber < 1) { // To avoid outOfBounds error we need two if statements to get the correct value at either side of the alphabet.
        shiftedPositions[i] = ALPHABET.length() + shiftedNumber - 1;
      } else if (shiftedNumber > ALPHABET.length() - 1) {
        shiftedPositions[i] = shiftedNumber - ALPHABET.length();
      } else {
        shiftedPositions[i] = shiftedNumber;
      }

    }
    return shiftedPositions;
  }

  public String numbersToText(int[] charPositions) {

    String cipherText = "";

    for (int i = 0; i < charPositions.length; i++) {

      //For each iteration of the loop, we add a new character to the string.

      char charFromAlphabet = ALPHABET.charAt(charPositions[i]);

      cipherText += String.valueOf(charFromAlphabet);


    }

    return cipherText;

  }

  public int[] textToNumber(String inputText) {

    int[] charPosition = new int[inputText.length()];

    int i;
    for (i = 0; i < inputText.length(); i++) {
      charPosition[i] = ALPHABET.indexOf(inputText.charAt(i)); // The character matching alphabet will be stored in charPos array.
      //System.out.print(charPosition[i] + " ");
    }
    return charPosition;
  }


  public static void main(String[] args) {
    Main obj = new Main();

    System.out.println("Welcome to my encryption / decryption tool");
    System.out.println("Please select which algorithm you want to use:");
    obj.homePage();

  }
}
