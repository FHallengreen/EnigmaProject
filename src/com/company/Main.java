package com.company;

import java.util.Scanner;

public class Main {
  Scanner scan = new Scanner(System.in);

  public int homeScreen() {
    System.out.println("Please select which algorithm you want to use:");
    System.out.printf("Type 1 for Caesar Algorithm \n" +
        "Type 2 for Vigenère algorithm \n");
    int input = scan.nextInt();
    if (input == 1) {
      return caesar();}
    else if (input == 2) {
      return vigenere();
    }
    return homeScreen();
  }

  public int caesar() {
    System.out.println("You have chosen the Caesar Algorithm. Please select if you want to encrypt or decrypt a message:");
    System.out.printf("Type 1 to encrypt a message\n" +
        "Type 2 to decrypt a message\n");
    int input = scan.nextInt();
    if (input == 1) {
      return caesarEncrypt();}
    else if (input == 2) {
      return caesarDecryption();
    }
    return caesar();
  }

  public int vigenere() {
    //FILL
    return 0;
  }

  public int caesarEncrypt () {
    return 0;
  }

  public int caesarDecryption (){
    return 0;
  }

  public static void main(String[] args) {

    System.out.println("Welcome to my encryption / decryption tool");
    Main obj = new Main();
    obj.homeScreen();
  }
}
