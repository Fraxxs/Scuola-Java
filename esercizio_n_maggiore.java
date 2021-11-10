/*L'utente deve inserire numeri fino a quando non inserisce un numero negativo.
Stampare il numero più grande*/

import java.util.Scanner;

public class esercizio_n_maggiore
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int scelta = 0;
        int n;
        int max = 0;
        
        do
        {
            System.out.println("Clicca '1' per inserire un numero.");
            System.out.println("Clicca '2' per leggere il numero maggiore.");
            scelta = input.nextInt();
            switch(scelta)
            {
                case 1:
                {
                    System.out.println("Inserisci numero: ");
                    n = input.nextInt();
                    if (n > max)
                    max = n;
                    break;
                }

                case 2:
                {
                    System.out.println("Il numero maggiore e': " + max);
                    break;
                }
                default: System.out.println("Selezione non valida.");
            }
        }while (scelta != 2);

        input.close();
    }
}