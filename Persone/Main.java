package Persone;

import java.util.Scanner;

public class Main
{
        public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        String nome; //inizializate delle variabili usate nella riga 36.
        String sesso;
        int eta;
        String professione;
        int n = 0;

        while(true)
        {
            System.out.print("Quante persone vuoi inserire? ");
            n = input.nextInt();
            input.nextLine();
            Persona[] p = new Persona[n];
            for(int i = 0; i < n; i++)
            {
                System.out.print("Inserisci il nome della " + (i + 1) + "a persona: "); //serie di input delle variabili precedenti
                nome = input.nextLine();

                System.out.print("\tInserisci il sesso: ");
                sesso = input.nextLine();

                System.out.print("\tInserisci l'età: ");
                eta = input.nextInt();

                System.out.print("\tInserisci la professione: ");
                input.nextLine();
                professione = input.nextLine();
                System.out.println("");

                p[i] = new Persona (nome, sesso, eta, professione);
            }
            for (int i = 0; i < n; i++)
            {
                System.out.println("\n" + p[i].getNome() + " dice: " + p[i].toString()); //richiamo al metodo che stampa la classe "Persona".
            }
            int scelta = 0;

            System.out.print("Se desideri terminare il programma allora digita '0', altrimenti digita qualsiasi altro numero. ");
            scelta = input.nextInt();

            if(scelta == 0)
            {
                break;
            }
        }

        System.out.println("Programma terminato.");

        input.close();
    }    
}