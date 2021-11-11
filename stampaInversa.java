/*Scrivi un programma che acquisisce dall'utente una sequenza di N numeri interi e,
terminato l'inserimento, mostra i numeri in ordine inverso rispetto all'ordine di inserimento.
Il valore di N è scelto dall'utente prima di iniziare l'inserimento, ma non può superare il valore 100.*/

import java.util.Scanner;

public class stampaInversa
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        int n = 0;

        System.out.println("Quanti valori vuoi inserire? ");
        n = input.nextInt();
        
        int[] v = new int[n];

        System.out.println("Inserisci i valori (max 100): ");

        for (int i = 0; i < n; i++)
        {
            System.out.print("Valore numero" + (i+1) + ": ");
            v[i] = input.nextInt();
        }

        System.out.println("Ordine normale dei valori: ");

        for (int i = 0; i < n; i++)
        {
            System.out.print(v[i] + " ");
        }

        System.out.println("\nOrdine inverso: ");

        for (int i = n-1; i >= 0; i--)
        {
            System.out.print(v[i] + " ");
        }

        input.close();
    }    
}
