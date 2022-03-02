package com.company;

import java.util.Scanner;

public class Main {
  Scanner scan = new Scanner(System.in);

  public int homeScreen() {
    System.out.println("Please select which algorithm you want to use:");
    System.out.printf("Type 1 for Caesar Algorithm \n" +
        "Type 2 for Vigenère algorithm \n");
    int press = scan.nextInt();
    if (press == 1) {
      return caesar();}
    else if (press == 2) {
      return vigenere();
    }
    return homeScreen();
  }

  public int caesar() {
    //FILL
    return 0;
  }

  public int vigenere() {
    //FILL
    return 0;
  }

  public static void main(String[] args) {

    System.out.println("Welcome to my encryption / decryption tool");
    Main obj = new Main();
    obj.homeScreen();
  }
}
