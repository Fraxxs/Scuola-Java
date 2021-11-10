package Persone;

import java.util.Scanner;

public class Main
{
    public static Persona p;

    public static void chiSei()
    {
        System.out.println("Sono una persona di nome: " + p.getNome() + ", sesso: " + p.getSesso() + ", età: " + p.getEtà() + ", professione: " + p.getProfessione() + ".");
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        String nome = "";
        String sesso = "";
        int età = 0;
        String professione = "";

        System.out.print("Inserisci il nome: ");
        nome = input.next();

        System.out.print("Inserisci il sesso: ");
        sesso = input.next();

        System.out.print("Inserisci l'età: ");
        età = input.nextInt();

        System.out.print("Inserisci la professione: ");
        professione = input.next();
        System.out.println("");

        p = new Persona (nome, sesso, età, professione);

        chiSei();

        input.close();
    }    
}
