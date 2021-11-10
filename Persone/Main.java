package Persone;

import java.util.Scanner;

public class Main
{
    public static Persona p; //dichiarata una variabile di tipo "Persona" che verrà
                             //usata nella riga 36.

    public static void chiSei() //funzione che stampa a video gli elementi
    {                           //inseriti nella classe "Persona"
        System.out.println("Sono una persona di nome: " + p.getNome() + ", sesso: " + p.getSesso() + ", età: " + p.getEtà() + ", professione: " + p.getProfessione() + ".");
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        String nome = ""; //inizializate delle variabili usate nella riga 36.
        String sesso = "";
        int età = 0;
        String professione = "";

        System.out.print("Inserisci il nome: "); //serie di input delle variabili precedenti
        nome = input.next();

        System.out.print("Inserisci il sesso: ");
        sesso = input.next();

        System.out.print("Inserisci l'età: ");
        età = input.nextInt();

        System.out.print("Inserisci la professione: ");
        professione = input.next();
        System.out.println("");

        p = new Persona (nome, sesso, età, professione);

        chiSei(); //richiamo al metodo che stampa la classe "Persona".

        input.close();
    }    
}
