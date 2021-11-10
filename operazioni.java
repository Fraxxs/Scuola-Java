/*Scrivere un programma in C++ che prenda in input 2 numeri e scelga se stampare:
- La somma;
- La differenza;
- La moltiplicazione;
- La divisione;
- Se i numeri sono pari o dispari.*/

import java.util.Scanner;

public class operazioni
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int scelta;

        while(true)
        {
            System.out.print("Inserisci il primo numero: ");
            x = input.nextInt();
            System.out.print("Inserisci il secondo numero: ");
            y = input.nextInt();

            System.out.println("Scegli l'operazione da svolgere:");
            System.out.println("1 - Somma.");
            System.out.println("2 - Differenza.");
            System.out.println("3 - Prodotto.");
            System.out.println("4 - Divisione.");
            System.out.println("5 - Controlla se i numeri sono pari o dispari.");
            scelta = input.nextInt();

            if(scelta == 1)
                System.out.println("La somma e': " + (x + y) + ".");
            
            if(scelta == 2)
                System.out.println("La differenza e': " + (x - y) + ".");
            
            if(scelta == 3)
                System.out.println("Il prodotto e': " + (x * y) + ".");
            
            if (scelta == 4)
                System.out.println("Il risultato della divisione e': " + (x / y) + " con resto " + (x % y) + ".");
            
            if (scelta == 5){
                if(x % 2 == 0)
                    System.out.println("Il primo numero e' pari.");
                else    
                    System.out.println("Il primo numero e' dispari.");
                if(y % 2 == 0)
                    System.out.println("Il secondo numero e' pari.");
                else
                    System.out.println("Il secondo numero e' disapri.");}            
            System.out.print("Digita '0' se si vuole ricominciare o digita qualsiasi altro numero per chiudere il programma. ");
            int risposta = input.nextInt();

            if(risposta != 0){
                System.out.println("Programma chiuso.");
                break;}
        }
    }
}