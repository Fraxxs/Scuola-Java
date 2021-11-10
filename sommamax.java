/*L'utente inserisce un numero che sarà il massimo numero da poter raggiungere con una somma di altri
numeri, stoppa il programma quando la somma eccede quel numero.*/

import java.util.Scanner;

public class sommamax
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int sommamax = 0;
        int x = 0;
        int somma = 0;

        System.out.println("Inserisci il massimo che la somma puo' raggiungere: ");
        sommamax = input.nextInt();

        do
        {
            System.out.println("Inserisci un numero: ");
            x = input.nextInt();
            somma = somma + x;;

            if(somma == sommamax)
                System.out.println("La somma totale e' uguale alla somma massima (" + somma + ")");

            if(somma > sommamax)
                System.out.println("La somma eccede la somma totale di " + (somma -sommamax));
        }while(somma < sommamax);
    
        input.close();
    }
}