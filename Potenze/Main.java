/*Crea un programma dotato di una classe 'potenza' che implementa
la potenza del 2 dei numeri (interi) associati agli oggetti
istanziati della classe. La classe deve essere dotata di costruttore,
di un metodo pow() che stampi a video la potenza del numero associato all'oggetto
e di un metodo cambiobase() che deve permettere di cambiare base alla potenza da calcolare.*/

package Potenze;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        int n = 0;

        System.out.print("Inserisci il numero da elevare alla seconda: ");
        n = input.nextInt();

        Potenza x = new Potenza(n);

        x.pow();

        int m = 0;

        System.out.print("Inserisci il numero da mettere al posto di " + n + ": ");
        m = input.nextInt();

        x.cambiobase(m);

        x.pow();

        input.close();
    }
}
