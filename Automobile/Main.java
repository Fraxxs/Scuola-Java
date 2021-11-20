/*Creare la classe auto che ha i seguenti attributi: stato (indica se è acceso o spento),
velocità, modello, casaAutomobilistica, colore, litriCarburante, consumi.
Metodi, oltre a quelli standard e ai costruttori,
fare i metodi accelera/decelera, accendi/spegni.
Implementare inoltre il metodo viaggio che restituisce
se l'auto può arrivare a destinazione o meno in base
ai chilometri da percorrere.*/

package Automobile;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        boolean stato = false;
        int velocita = 0;
        String modello = "";
        String casaAutomobilistica = "";
        String colore = "";
        int litriCarburante = 0;
        int consumi = 0;
        int distanza = 0;
        int scelta = 0;
        //serie di input per inserire i vari parametri del costruttore.
        System.out.print("Inserire la casa automobilistica della tua auto: ");
        casaAutomobilistica = input.nextLine();

        System.out.print("Inserire il modello della tua auto: ");
        modello = input.nextLine();

        System.out.print("Inserire ilcolore della tua auto: ");
        colore = input.nextLine();

        System.out.print("Inserire i litri massimi del carburante all'interno del serbatoio della tua auto: ");
        litriCarburante = input.nextInt();

        System.out.print("Inserire il consumo di carburante ogni 30 kilometri: ");
        consumi = input.nextInt();

        System.out.print("Inserire i kilometri di viaggio: ");
        distanza = input.nextInt();
        //utilizzo del costruttore
        Auto auto = new Auto(stato, velocita, modello, casaAutomobilistica, colore, litriCarburante, consumi, distanza);
        
            do{ //ciclo che ripete la richiesta delle scelte fino a quando non venga scelta l'opzione
                //apposita per uscirne
            System.out.println("Scegli un'opzione:");
            System.out.println("1 - Descrivi la mia auto.");
            System.out.println("2 - Controlla il percorso.");
            System.out.println("3 - Metti in moto.");
            System.out.println("4 - Spegni il motore.");
            System.out.println("5 - Svolgi il viaggio.");
            System.out.println("6 - Accellera.");
            System.out.println("7 - Decellera.");
            System.out.println("8 - Concludi il viaggio (termina il programma).");


            scelta = input.nextInt();
            //serie di casi che compiono le azioni elencate richiamando i metodi scritti nel file Auto.java
            switch (scelta)
            {
                case 1:
                {
                    System.out.println(auto.toString());
                    break;
                }
                
                case 2:
                {
                    System.out.println("E' stata inserita una distanza di " + auto.getDistanza() + " kilometri.");
                    break;
                }

                case 3:
                {
                    auto.accendi();
                    break;
                }
                
                case 4:
                {
                    auto.spegni();
                    break;
                }

                case 5:
                {
                    auto.viaggio();
                    break;
                }

                case 6:
                {
                    auto.accellera();
                    break;
                }

                case 7:
                {
                    auto.decellera();
                    break;
                }

                case 8:
                {
                    break;
                }

                default:
                {
                    System.out.println("Scelta non valida.");
                    break;
                }
            }
        }while (scelta != 8);

        System.out.println("Viaggio concluso, programma terminato.");

        input.close();
    }
}