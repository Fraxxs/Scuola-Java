package Angolo;

import java.util.Scanner;

class Main {
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);

    Angolo a1 = new Angolo(120, 40, 10);

    Angolo a2 = new Angolo(90, 0, 80);
    
    a2.DifferenzaAngoli(a1);
  }
}
